package com.entity.model;

import com.entity.XiqukepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 戏曲科普
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiqukepuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 戏曲科普名称
     */
    private String xiqukepuName;


    /**
     * 戏曲科普图片
     */
    private String xiqukepuPhoto;


    /**
     * 戏曲科普类型
     */
    private Integer xiqukepuTypes;


    /**
     * 戏曲科普发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 戏曲科普详情
     */
    private String xiqukepuContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
