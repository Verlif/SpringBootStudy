package com.study.entity;

public class Reference extends JSONBuilder {

    private String refId;       // 参数id
    private String refType;     // 参数附属类型
    private String refName;     // 参数名(内容)
    private String refNum;      // 参数编号
    private String upId;        // 父级参数id

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public String getUpId() {
        return upId;
    }

    public void setUpId(String upId) {
        this.upId = upId;
    }
}