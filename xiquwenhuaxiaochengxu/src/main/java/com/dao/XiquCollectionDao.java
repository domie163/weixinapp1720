package com.dao;

import com.entity.XiquCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiquCollectionView;

/**
 * 戏曲收藏 Dao 接口
 *
 * @author 
 */
public interface XiquCollectionDao extends BaseMapper<XiquCollectionEntity> {

   List<XiquCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
