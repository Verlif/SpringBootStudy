package com.study.entity;

import java.util.Date;

public class Right extends JSONBuilder {
    private String rightId;
    private String rightName;
    private String rightNum;
    private String rightDesc;
    private Date createTime;

    public String getRightId() {
        return rightId;
    }

    public void setRightId(String rightId) {
        this.rightId = rightId;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public String getRightNum() {
        return rightNum;
    }

    public void setRightNum(String rightNum) {
        this.rightNum = rightNum;
    }

    public String getRightDesc() {
        return rightDesc;
    }

    public void setRightDesc(String rightDesc) {
        this.rightDesc = rightDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}