package com.dao;

import com.entity.XiquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiquView;

/**
 * 戏曲 Dao 接口
 *
 * @author 
 */
public interface XiquDao extends BaseMapper<XiquEntity> {

   List<XiquView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
