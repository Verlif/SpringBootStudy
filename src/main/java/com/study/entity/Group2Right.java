package com.study.entity;

import java.util.Date;

public class Group2Right extends JSONBuilder {
    private String g2rId;
    private String rightId;
    private String groupId;
    private Date createTime;
    private Date updateTime;

    public String getG2rId() {
        return g2rId;
    }

    public void setG2rId(String g2rId) {
        this.g2rId = g2rId;
    }

    public String getRightId() {
        return rightId;
    }

    public void setRightId(String rightId) {
        this.rightId = rightId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
