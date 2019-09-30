package com.study.entity;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public class Comment extends JSONBuilder {

    public static final int COM_TYPE_GOOD = 0;          //好评
    public static final int COM_TYPE_BAD = 3;          //差评

    private String comId;           // 评论id
    private String userId;          // 评论者id
    private String patentId;        // 被评专利id
    private int comType;            // 评论类型，例如好评坏评
    private String comContent;      // 评论内容
    private Date createTime;        // 评论创建时间
    private Date updateTime;        // 评论更新时间

    public Comment() {}
    public Comment(JSONObject json) {
        super(json);
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
    }

    public int getComType() {
        return comType;
    }

    /**
     * 设置评论类型，请参照内置参数设定
     * @param comType   评论类型
     */
    public void setComType(int comType) {
        this.comType = comType;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}