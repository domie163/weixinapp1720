package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XiqukepuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 戏曲科普
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xiqukepu")
public class XiqukepuView extends XiqukepuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 戏曲科普类型的值
	*/
	@ColumnInfo(comment="戏曲科普类型的字典表值",type="varchar(200)")
	private String xiqukepuValue;




	public XiqukepuView() {

	}

	public XiqukepuView(XiqukepuEntity xiqukepuEntity) {
		try {
			BeanUtils.copyProperties(this, xiqukepuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 戏曲科普类型的值
	*/
	public String getXiqukepuValue() {
		return xiqukepuValue;
	}
	/**
	* 设置： 戏曲科普类型的值
	*/
	public void setXiqukepuValue(String xiqukepuValue) {
		this.xiqukepuValue = xiqukepuValue;
	}




	@Override
	public String toString() {
		return "XiqukepuView{" +
			", xiqukepuValue=" + xiqukepuValue +
			"} " + super.toString();
	}
}
