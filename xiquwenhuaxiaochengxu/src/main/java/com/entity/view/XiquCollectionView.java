package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XiquCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 戏曲收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xiqu_collection")
public class XiquCollectionView extends XiquCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String xiquCollectionValue;

	//级联表 戏曲
		/**
		* 戏曲名称
		*/

		@ColumnInfo(comment="戏曲名称",type="varchar(200)")
		private String xiquName;
		/**
		* 戏曲编号
		*/

		@ColumnInfo(comment="戏曲编号",type="varchar(200)")
		private String xiquUuidNumber;
		/**
		* 戏曲照片
		*/

		@ColumnInfo(comment="戏曲照片",type="varchar(200)")
		private String xiquPhoto;
		/**
		* 发源地
		*/

		@ColumnInfo(comment="发源地",type="varchar(200)")
		private String xiquAddress;
		/**
		* 戏曲文件
		*/

		@ColumnInfo(comment="戏曲文件",type="varchar(200)")
		private String xiquFile;
		/**
		* 戏曲音频
		*/

		@ColumnInfo(comment="戏曲音频",type="varchar(200)")
		private String xiquMusic;
		/**
		* 戏曲视频
		*/

		@ColumnInfo(comment="戏曲视频",type="varchar(200)")
		private String xiquVideo;
		/**
		* 戏曲类型
		*/
		@ColumnInfo(comment="戏曲类型",type="int(11)")
		private Integer xiquTypes;
			/**
			* 戏曲类型的值
			*/
			@ColumnInfo(comment="戏曲类型的字典表值",type="varchar(200)")
			private String xiquValue;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 戏曲热度
		*/

		@ColumnInfo(comment="戏曲热度",type="int(11)")
		private Integer xiquClicknum;
		/**
		* 戏曲介绍
		*/

		@ColumnInfo(comment="戏曲介绍",type="longtext")
		private String xiquContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer xiquDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public XiquCollectionView() {

	}

	public XiquCollectionView(XiquCollectionEntity xiquCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, xiquCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getXiquCollectionValue() {
		return xiquCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setXiquCollectionValue(String xiquCollectionValue) {
		this.xiquCollectionValue = xiquCollectionValue;
	}


	//级联表的get和set 戏曲

		/**
		* 获取： 戏曲名称
		*/
		public String getXiquName() {
			return xiquName;
		}
		/**
		* 设置： 戏曲名称
		*/
		public void setXiquName(String xiquName) {
			this.xiquName = xiquName;
		}

		/**
		* 获取： 戏曲编号
		*/
		public String getXiquUuidNumber() {
			return xiquUuidNumber;
		}
		/**
		* 设置： 戏曲编号
		*/
		public void setXiquUuidNumber(String xiquUuidNumber) {
			this.xiquUuidNumber = xiquUuidNumber;
		}

		/**
		* 获取： 戏曲照片
		*/
		public String getXiquPhoto() {
			return xiquPhoto;
		}
		/**
		* 设置： 戏曲照片
		*/
		public void setXiquPhoto(String xiquPhoto) {
			this.xiquPhoto = xiquPhoto;
		}

		/**
		* 获取： 发源地
		*/
		public String getXiquAddress() {
			return xiquAddress;
		}
		/**
		* 设置： 发源地
		*/
		public void setXiquAddress(String xiquAddress) {
			this.xiquAddress = xiquAddress;
		}

		/**
		* 获取： 戏曲文件
		*/
		public String getXiquFile() {
			return xiquFile;
		}
		/**
		* 设置： 戏曲文件
		*/
		public void setXiquFile(String xiquFile) {
			this.xiquFile = xiquFile;
		}

		/**
		* 获取： 戏曲音频
		*/
		public String getXiquMusic() {
			return xiquMusic;
		}
		/**
		* 设置： 戏曲音频
		*/
		public void setXiquMusic(String xiquMusic) {
			this.xiquMusic = xiquMusic;
		}

		/**
		* 获取： 戏曲视频
		*/
		public String getXiquVideo() {
			return xiquVideo;
		}
		/**
		* 设置： 戏曲视频
		*/
		public void setXiquVideo(String xiquVideo) {
			this.xiquVideo = xiquVideo;
		}
		/**
		* 获取： 戏曲类型
		*/
		public Integer getXiquTypes() {
			return xiquTypes;
		}
		/**
		* 设置： 戏曲类型
		*/
		public void setXiquTypes(Integer xiquTypes) {
			this.xiquTypes = xiquTypes;
		}


			/**
			* 获取： 戏曲类型的值
			*/
			public String getXiquValue() {
				return xiquValue;
			}
			/**
			* 设置： 戏曲类型的值
			*/
			public void setXiquValue(String xiquValue) {
				this.xiquValue = xiquValue;
			}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 戏曲热度
		*/
		public Integer getXiquClicknum() {
			return xiquClicknum;
		}
		/**
		* 设置： 戏曲热度
		*/
		public void setXiquClicknum(Integer xiquClicknum) {
			this.xiquClicknum = xiquClicknum;
		}

		/**
		* 获取： 戏曲介绍
		*/
		public String getXiquContent() {
			return xiquContent;
		}
		/**
		* 设置： 戏曲介绍
		*/
		public void setXiquContent(String xiquContent) {
			this.xiquContent = xiquContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getXiquDelete() {
			return xiquDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setXiquDelete(Integer xiquDelete) {
			this.xiquDelete = xiquDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "XiquCollectionView{" +
			", xiquCollectionValue=" + xiquCollectionValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", xiquName=" + xiquName +
			", xiquUuidNumber=" + xiquUuidNumber +
			", xiquPhoto=" + xiquPhoto +
			", xiquAddress=" + xiquAddress +
			", xiquFile=" + xiquFile +
			", xiquMusic=" + xiquMusic +
			", xiquVideo=" + xiquVideo +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", xiquClicknum=" + xiquClicknum +
			", xiquContent=" + xiquContent +
			", xiquDelete=" + xiquDelete +
			"} " + super.toString();
	}
}
