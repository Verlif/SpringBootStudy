package com.study.entity;

import java.util.Date;

public class PatentAttached extends JSONBuilder {

    private String paId;            // 专利附件表内id
    private String patentId;        // 附属于专利的id
    private String paPicAddr;       // 专利相关图片网络地址
    private Date createTime;        // 附件创建时间
    private Date updateTime;        // 附件更新时间

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
