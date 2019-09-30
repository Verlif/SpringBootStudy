package com.study.entity;

import java.util.Date;

public class Log extends JSONBuilder {

    private String logId;       // 日志id
    private String userId;      // 相关用户id
    private String moduleName;  // 相关模块名称
    private String logContents; // 日志内容
    private String notes;       // 日志备注
    private Date createTime;    // 日志创建时间
    private Date updateTime;    // 日志更新时间

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

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
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