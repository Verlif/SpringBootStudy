package com.study.entity;

import java.util.Date;

public class UserAttached extends JSONBuilder {
    private String uaId;
    private String userId;
    private String uaPicAddr;
    private Date createTime;
    private Date updateTime;

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
