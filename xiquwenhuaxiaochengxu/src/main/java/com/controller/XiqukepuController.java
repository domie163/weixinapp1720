
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 戏曲科普
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xiqukepu")
public class XiqukepuController {
    private static final Logger logger = LoggerFactory.getLogger(XiqukepuController.class);

    private static final String TABLE_NAME = "xiqukepu";

    @Autowired
    private XiqukepuService xiqukepuService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private CaozuorizhiService caozuorizhiService;//操作日志
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private XiquService xiquService;//戏曲
    @Autowired
    private XiquCollectionService xiquCollectionService;//戏曲收藏
    @Autowired
    private XiquLiuyanService xiquLiuyanService;//戏曲留言
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = xiqukepuService.queryPage(params);

        //字典表数据转换
        List<XiqukepuView> list =(List<XiqukepuView>)page.getList();
        for(XiqukepuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"列表查询",list.toString());
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiqukepuEntity xiqukepu = xiqukepuService.selectById(id);
        if(xiqukepu !=null){
            //entity转view
            XiqukepuView view = new XiqukepuView();
            BeanUtils.copyProperties( xiqukepu , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
    caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"单条数据查看",view.toString());
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XiqukepuEntity xiqukepu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xiqukepu:{}",this.getClass().getName(),xiqukepu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<XiqukepuEntity> queryWrapper = new EntityWrapper<XiqukepuEntity>()
            .eq("xiqukepu_name", xiqukepu.getXiqukepuName())
            .eq("xiqukepu_types", xiqukepu.getXiqukepuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiqukepuEntity xiqukepuEntity = xiqukepuService.selectOne(queryWrapper);
        if(xiqukepuEntity==null){
            xiqukepu.setInsertTime(new Date());
            xiqukepu.setCreateTime(new Date());
            xiqukepuService.insert(xiqukepu);
            caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"新增",xiqukepu.toString());
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XiqukepuEntity xiqukepu, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,xiqukepu:{}",this.getClass().getName(),xiqukepu.toString());
        XiqukepuEntity oldXiqukepuEntity = xiqukepuService.selectById(xiqukepu.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(xiqukepu.getXiqukepuPhoto()) || "null".equals(xiqukepu.getXiqukepuPhoto())){
                xiqukepu.setXiqukepuPhoto(null);
        }

            xiqukepuService.updateById(xiqukepu);//根据id更新
            List<String> strings = caozuorizhiService.clazzDiff(xiqukepu, oldXiqukepuEntity, request,new String[]{"updateTime"});
            caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"修改",strings.toString());
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<XiqukepuEntity> oldXiqukepuList =xiqukepuService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        xiqukepuService.deleteBatchIds(Arrays.asList(ids));

        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"删除",oldXiqukepuList.toString());
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<XiqukepuEntity> xiqukepuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XiqukepuEntity xiqukepuEntity = new XiqukepuEntity();
//                            xiqukepuEntity.setXiqukepuName(data.get(0));                    //戏曲科普名称 要改的
//                            xiqukepuEntity.setXiqukepuPhoto("");//详情和图片
//                            xiqukepuEntity.setXiqukepuTypes(Integer.valueOf(data.get(0)));   //戏曲科普类型 要改的
//                            xiqukepuEntity.setInsertTime(date);//时间
//                            xiqukepuEntity.setXiqukepuContent("");//详情和图片
//                            xiqukepuEntity.setCreateTime(date);//时间
                            xiqukepuList.add(xiqukepuEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xiqukepuService.insertBatch(xiqukepuList);
                        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"批量新增",xiqukepuList.toString());
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = xiqukepuService.queryPage(params);

        //字典表数据转换
        List<XiqukepuView> list =(List<XiqukepuView>)page.getList();
        for(XiqukepuView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"列表查询",list.toString());
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiqukepuEntity xiqukepu = xiqukepuService.selectById(id);
            if(xiqukepu !=null){


                //entity转view
                XiqukepuView view = new XiqukepuView();
                BeanUtils.copyProperties( xiqukepu , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                    caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"单条数据查看",view.toString());
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XiqukepuEntity xiqukepu, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xiqukepu:{}",this.getClass().getName(),xiqukepu.toString());
        Wrapper<XiqukepuEntity> queryWrapper = new EntityWrapper<XiqukepuEntity>()
            .eq("xiqukepu_name", xiqukepu.getXiqukepuName())
            .eq("xiqukepu_types", xiqukepu.getXiqukepuTypes())
//            .notIn("xiqukepu_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XiqukepuEntity xiqukepuEntity = xiqukepuService.selectOne(queryWrapper);
        if(xiqukepuEntity==null){
            xiqukepu.setInsertTime(new Date());
            xiqukepu.setCreateTime(new Date());
        xiqukepuService.insert(xiqukepu);

            caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"前台新增",xiqukepu.toString());
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

