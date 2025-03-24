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
 * 戏曲科普
 *
 * @author 
 * @email
 */
@TableName("xiqukepu")
public class XiqukepuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiqukepuEntity() {

	}

	public XiqukepuEntity(T t) {
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
     * 戏曲科普名称
     */
    @ColumnInfo(comment="戏曲科普名称",type="varchar(200)")
    @TableField(value = "xiqukepu_name")

    private String xiqukepuName;


    /**
     * 戏曲科普图片
     */
    @ColumnInfo(comment="戏曲科普图片",type="varchar(200)")
    @TableField(value = "xiqukepu_photo")

    private String xiqukepuPhoto;


    /**
     * 戏曲科普类型
     */
    @ColumnInfo(comment="戏曲科普类型",type="int(11)")
    @TableField(value = "xiqukepu_types")

    private Integer xiqukepuTypes;


    /**
     * 戏曲科普发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="戏曲科普发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 戏曲科普详情
     */
    @ColumnInfo(comment="戏曲科普详情",type="longtext")
    @TableField(value = "xiqukepu_content")

    private String xiqukepuContent;


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
	 * 获取：戏曲科普名称
	 */
    public String getXiqukepuName() {
        return xiqukepuName;
    }
    /**
	 * 设置：戏曲科普名称
	 */

    public void setXiqukepuName(String xiqukepuName) {
        this.xiqukepuName = xiqukepuName;
    }
    /**
	 * 获取：戏曲科普图片
	 */
    public String getXiqukepuPhoto() {
        return xiqukepuPhoto;
    }
    /**
	 * 设置：戏曲科普图片
	 */

    public void setXiqukepuPhoto(String xiqukepuPhoto) {
        this.xiqukepuPhoto = xiqukepuPhoto;
    }
    /**
	 * 获取：戏曲科普类型
	 */
    public Integer getXiqukepuTypes() {
        return xiqukepuTypes;
    }
    /**
	 * 设置：戏曲科普类型
	 */

    public void setXiqukepuTypes(Integer xiqukepuTypes) {
        this.xiqukepuTypes = xiqukepuTypes;
    }
    /**
	 * 获取：戏曲科普发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：戏曲科普发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：戏曲科普详情
	 */
    public String getXiqukepuContent() {
        return xiqukepuContent;
    }
    /**
	 * 设置：戏曲科普详情
	 */

    public void setXiqukepuContent(String xiqukepuContent) {
        this.xiqukepuContent = xiqukepuContent;
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
        return "Xiqukepu{" +
            ", id=" + id +
            ", xiqukepuName=" + xiqukepuName +
            ", xiqukepuPhoto=" + xiqukepuPhoto +
            ", xiqukepuTypes=" + xiqukepuTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", xiqukepuContent=" + xiqukepuContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
