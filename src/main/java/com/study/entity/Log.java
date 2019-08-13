package com.study.entity;

import java.util.Date;

public class Log extends JSONBuilder {
    private String logId;
    private String userId;
    private String modleName;
    private String logContents; //日志内容
    private String notes;       //备注
    private Date createTime;
    private Date updateTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getModleName() {
        return modleName;
    }

    public void setModleName(String modleName) {
        this.modleName = modleName;
    }

    public String getLogContents() {
        return logContents;
    }

    public void setLogContents(String logContents) {
        this.logContents = logContents;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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