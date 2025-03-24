package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 戏曲
 *
 * @author 
 * @email
 */
@TableName("xiqu")
public class XiquEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiquEntity() {

	}

	public XiquEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 戏曲名称
     */
    @ColumnInfo(comment="戏曲名称",type="varchar(200)")
    @TableField(value = "xiqu_name")

    private String xiquName;


    /**
     * 戏曲编号
     */
    @ColumnInfo(comment="戏曲编号",type="varchar(200)")
    @TableField(value = "xiqu_uuid_number")

    private String xiquUuidNumber;


    /**
     * 戏曲照片
     */
    @ColumnInfo(comment="戏曲照片",type="varchar(200)")
    @TableField(value = "xiqu_photo")

    private String xiquPhoto;


    /**
     * 发源地
     */
    @ColumnInfo(comment="发源地",type="varchar(200)")
    @TableField(value = "xiqu_address")

    private String xiquAddress;


    /**
     * 戏曲文件
     */
    @ColumnInfo(comment="戏曲文件",type="varchar(200)")
    @TableField(value = "xiqu_file")

    private String xiquFile;


    /**
     * 戏曲音频
     */
    @ColumnInfo(comment="戏曲音频",type="varchar(200)")
    @TableField(value = "xiqu_music")

    private String xiquMusic;


    /**
     * 戏曲视频
     */
    @ColumnInfo(comment="戏曲视频",type="varchar(200)")
    @TableField(value = "xiqu_video")

    private String xiquVideo;


    /**
     * 戏曲类型
     */
    @ColumnInfo(comment="戏曲类型",type="int(11)")
    @TableField(value = "xiqu_types")

    private Integer xiquTypes;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 戏曲热度
     */
    @ColumnInfo(comment="戏曲热度",type="int(11)")
    @TableField(value = "xiqu_clicknum")

    private Integer xiquClicknum;


    /**
     * 戏曲介绍
     */
    @ColumnInfo(comment="戏曲介绍",type="longtext")
    @TableField(value = "xiqu_content")

    private String xiquContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xiqu_delete")

    private Integer xiquDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：戏曲名称
	 */
    public String getXiquName() {
        return xiquName;
    }
    /**
	 * 设置：戏曲名称
	 */

    public void setXiquName(String xiquName) {
        this.xiquName = xiquName;
    }
    /**
	 * 获取：戏曲编号
	 */
    public String getXiquUuidNumber() {
        return xiquUuidNumber;
    }
    /**
	 * 设置：戏曲编号
	 */

    public void setXiquUuidNumber(String xiquUuidNumber) {
        this.xiquUuidNumber = xiquUuidNumber;
    }
    /**
	 * 获取：戏曲照片
	 */
    public String getXiquPhoto() {
        return xiquPhoto;
    }
    /**
	 * 设置：戏曲照片
	 */

    public void setXiquPhoto(String xiquPhoto) {
        this.xiquPhoto = xiquPhoto;
    }
    /**
	 * 获取：发源地
	 */
    public String getXiquAddress() {
        return xiquAddress;
    }
    /**
	 * 设置：发源地
	 */

    public void setXiquAddress(String xiquAddress) {
        this.xiquAddress = xiquAddress;
    }
    /**
	 * 获取：戏曲文件
	 */
    public String getXiquFile() {
        return xiquFile;
    }
    /**
	 * 设置：戏曲文件
	 */

    public void setXiquFile(String xiquFile) {
        this.xiquFile = xiquFile;
    }
    /**
	 * 获取：戏曲音频
	 */
    public String getXiquMusic() {
        return xiquMusic;
    }
    /**
	 * 设置：戏曲音频
	 */

    public void setXiquMusic(String xiquMusic) {
        this.xiquMusic = xiquMusic;
    }
    /**
	 * 获取：戏曲视频
	 */
    public String getXiquVideo() {
        return xiquVideo;
    }
    /**
	 * 设置：戏曲视频
	 */

    public void setXiquVideo(String xiquVideo) {
        this.xiquVideo = xiquVideo;
    }
    /**
	 * 获取：戏曲类型
	 */
    public Integer getXiquTypes() {
        return xiquTypes;
    }
    /**
	 * 设置：戏曲类型
	 */

    public void setXiquTypes(Integer xiquTypes) {
        this.xiquTypes = xiquTypes;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：戏曲热度
	 */
    public Integer getXiquClicknum() {
        return xiquClicknum;
    }
    /**
	 * 设置：戏曲热度
	 */

    public void setXiquClicknum(Integer xiquClicknum) {
        this.xiquClicknum = xiquClicknum;
    }
    /**
	 * 获取：戏曲介绍
	 */
    public String getXiquContent() {
        return xiquContent;
    }
    /**
	 * 设置：戏曲介绍
	 */

    public void setXiquContent(String xiquContent) {
        this.xiquContent = xiquContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXiquDelete() {
        return xiquDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setXiquDelete(Integer xiquDelete) {
        this.xiquDelete = xiquDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiqu{" +
            ", id=" + id +
            ", xiquName=" + xiquName +
            ", xiquUuidNumber=" + xiquUuidNumber +
            ", xiquPhoto=" + xiquPhoto +
            ", xiquAddress=" + xiquAddress +
            ", xiquFile=" + xiquFile +
            ", xiquMusic=" + xiquMusic +
            ", xiquVideo=" + xiquVideo +
            ", xiquTypes=" + xiquTypes +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", xiquClicknum=" + xiquClicknum +
            ", xiquContent=" + xiquContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", xiquDelete=" + xiquDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
