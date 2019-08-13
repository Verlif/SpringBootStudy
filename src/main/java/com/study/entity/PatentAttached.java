package com.study.entity;

import java.util.Date;

public class PatentAttached extends JSONBuilder {
    private String paId;
    private String patentId;
    private String paPicAddr;
    private Date createTime;
    private Date updateTime;

    public String getPaId() {
        return paId;
    }

    public void setPaId(String paId) {
        this.paId = paId;
    }

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
    }

    public String getPaPicAddr() {
        return paPicAddr;
    }

    public void setPaPicAddr(String paPicAddr) {
        this.paPicAddr = paPicAddr;
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
