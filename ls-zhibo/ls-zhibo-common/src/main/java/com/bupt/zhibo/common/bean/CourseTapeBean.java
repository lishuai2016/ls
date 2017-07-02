package com.bupt.zhibo.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by djn8 on 2017/5/8.
 */
public class CourseTapeBean implements Serializable {


    private Integer isEnd;

    public Integer getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    /**
     * 添加字段用于统计购买该课程的人数
     */
    private Integer peoples;

    public Integer getPeoples() {
        return peoples;
    }

    public void setPeoples(Integer peoples) {
        this.peoples = peoples;
    }

    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 暂定管理员ID,后续取主播ID
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 直播流标示id
     *
     * @mbg.generated
     */
    private String streamId;

    /**
     * 聊天室id
     *
     * @mbg.generated
     */
    private String groupid;

    /**
     * 直播的标题
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 主播的名字
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * 主播的头像
     *
     * @mbg.generated
     */
    private String headpic;

    /**
     * 直播展示图片
     *
     * @mbg.generated
     */
    private String frontcover;

    /**
     * 主播的地理位置
     *
     * @mbg.generated
     */
    private String location;

    /**
     * 推流地址
     *
     * @mbg.generated
     */
    private String pushUrl;

    /**
     * 直播所处的状态 0
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 点赞数
     *
     * @mbg.generated
     */
    private Integer likeCount;

    /**
     * 浏览数
     *
     * @mbg.generated
     */
    private Integer viewerCount;

    /**
     * 保留字段
     *
     * @mbg.generated
     */
    private Integer checkStatus;

    /**
     * 保留字段
     *
     * @mbg.generated
     */
    private Integer forbidflag;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;



    /**
     * flv播放地址
     *
     * @mbg.generated
     */
    private String flvPlayUrl;

    private String hlsPlayUrl;

    /**
     * 是否回放
     *
     * @mbg.generated
     */
    private Integer isPlayback;

    /**
     * 直播的时长
     *
     * @mbg.generated
     */
    private Integer duration;


    /**
     * 直播的价格
     *
     * @mbg.generated
     */
    private Float price;

    /**
     * 创建人ID
     *
     * @mbg.generated
     */
    private Integer createUserid;

    /**
     * 直播课程所属的类别
     *
     * @mbg.generated
     */
    private Integer courseType;

    /**
     * 直播介绍（带样式）
     *
     * @mbg.generated
     */
    private String courseDesc;


    public Integer getTapeId() {
        return tapeId;
    }

    public void setTapeId(Integer tapeId) {
        this.tapeId = tapeId;
    }

    private Integer tapeId;

    private String tapePlayUrl;

    private String tapeHlsPlayUrl;

    private String fileSize;

    private Date startTime;

    private Date endTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getFrontcover() {
        return frontcover;
    }

    public void setFrontcover(String frontcover) {
        this.frontcover = frontcover;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getViewerCount() {
        return viewerCount;
    }

    public void setViewerCount(Integer viewerCount) {
        this.viewerCount = viewerCount;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getForbidflag() {
        return forbidflag;
    }

    public void setForbidflag(Integer forbidflag) {
        this.forbidflag = forbidflag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFlvPlayUrl() {
        return flvPlayUrl;
    }

    public void setFlvPlayUrl(String flvPlayUrl) {
        this.flvPlayUrl = flvPlayUrl;
    }

    public String getHlsPlayUrl() {
        return hlsPlayUrl;
    }

    public void setHlsPlayUrl(String hlsPlayUrl) {
        this.hlsPlayUrl = hlsPlayUrl;
    }

    public Integer getIsPlayback() {
        return isPlayback;
    }

    public void setIsPlayback(Integer isPlayback) {
        this.isPlayback = isPlayback;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getTapePlayUrl() {
        return tapePlayUrl;
    }

    public void setTapePlayUrl(String tapePlayUrl) {
        this.tapePlayUrl = tapePlayUrl;
    }

    public String getTapeHlsPlayUrl() {
        return tapeHlsPlayUrl;
    }

    public void setTapeHlsPlayUrl(String tapeHlsPlayUrl) {
        this.tapeHlsPlayUrl = tapeHlsPlayUrl;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
