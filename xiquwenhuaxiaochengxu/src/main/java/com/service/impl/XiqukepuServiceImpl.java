package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.XiqukepuDao;
import com.entity.XiqukepuEntity;
import com.service.XiqukepuService;
import com.entity.view.XiqukepuView;

/**
 * 戏曲科普 服务实现类
 */
@Service("xiqukepuService")
@Transactional
public class XiqukepuServiceImpl extends ServiceImpl<XiqukepuDao, XiqukepuEntity> implements XiqukepuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<XiqukepuView> page =new Query<XiqukepuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
