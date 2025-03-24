package com.entity.model;

import com.entity.XiquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 戏曲
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiquModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 戏曲名称
     */
    private String xiquName;


    /**
     * 戏曲编号
     */
    private String xiquUuidNumber;


    /**
     * 戏曲照片
     */
    private String xiquPhoto;


    /**
     * 发源地
     */
    private String xiquAddress;


    /**
     * 戏曲文件
     */
    private String xiquFile;


    /**
     * 戏曲音频
     */
    private String xiquMusic;


    /**
     * 戏曲视频
     */
    private String xiquVideo;


    /**
     * 戏曲类型
     */
    private Integer xiquTypes;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 戏曲热度
     */
    private Integer xiquClicknum;


    /**
     * 戏曲介绍
     */
    private String xiquContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer xiquDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
