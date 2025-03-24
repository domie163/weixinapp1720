package com.entity.vo;

import com.entity.XiqukepuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 戏曲科普
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiqukepu")
public class XiqukepuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 戏曲科普名称
     */

    @TableField(value = "xiqukepu_name")
    private String xiqukepuName;


    /**
     * 戏曲科普图片
     */

    @TableField(value = "xiqukepu_photo")
    private String xiqukepuPhoto;


    /**
     * 戏曲科普类型
     */

    @TableField(value = "xiqukepu_types")
    private Integer xiqukepuTypes;


    /**
     * 戏曲科普发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 戏曲科普详情
     */

    @TableField(value = "xiqukepu_content")
    private String xiqukepuContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：戏曲科普名称
	 */
    public String getXiqukepuName() {
        return xiqukepuName;
    }


    /**
	 * 获取：戏曲科普名称
	 */

    public void setXiqukepuName(String xiqukepuName) {
        this.xiqukepuName = xiqukepuName;
    }
    /**
	 * 设置：戏曲科普图片
	 */
    public String getXiqukepuPhoto() {
        return xiqukepuPhoto;
    }


    /**
	 * 获取：戏曲科普图片
	 */

    public void setXiqukepuPhoto(String xiqukepuPhoto) {
        this.xiqukepuPhoto = xiqukepuPhoto;
    }
    /**
	 * 设置：戏曲科普类型
	 */
    public Integer getXiqukepuTypes() {
        return xiqukepuTypes;
    }


    /**
	 * 获取：戏曲科普类型
	 */

    public void setXiqukepuTypes(Integer xiqukepuTypes) {
        this.xiqukepuTypes = xiqukepuTypes;
    }
    /**
	 * 设置：戏曲科普发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：戏曲科普发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：戏曲科普详情
	 */
    public String getXiqukepuContent() {
        return xiqukepuContent;
    }


    /**
	 * 获取：戏曲科普详情
	 */

    public void setXiqukepuContent(String xiqukepuContent) {
        this.xiqukepuContent = xiqukepuContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
