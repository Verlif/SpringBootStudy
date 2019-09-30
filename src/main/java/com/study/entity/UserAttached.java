package com.study.entity;

import java.util.Date;

public class UserAttached extends JSONBuilder {

    private String uaId;        // 用户附件表内id
    private String userId;      // 相关用户id
    private String uaPicAddr;   // 用户图片网络地址
    private Date createTime;    // 附件创建时间
    private Date updateTime;    // 附件信息修改时间

    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUaPicAddr() {
        return uaPicAddr;
    }

    public void setUaPicAddr(String uaPicAddr) {
        this.uaPicAddr = uaPicAddr;
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
