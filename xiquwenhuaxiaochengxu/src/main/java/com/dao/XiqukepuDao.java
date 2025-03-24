package com.dao;

import com.entity.XiqukepuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiqukepuView;

/**
 * 戏曲科普 Dao 接口
 *
 * @author 
 */
public interface XiqukepuDao extends BaseMapper<XiqukepuEntity> {

   List<XiqukepuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
