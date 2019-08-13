package com.study.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Patent extends JSONBuilder {
    private String patentId;
    private String patentName;
    private String userId;
    private String patentDetails;
    private String patentArea;
    private String patentKeyword;
    private int patentDealTypes;
    private BigDecimal patentPrice;
    private boolean isSale;
    private Date createTime;
    private Date updateTime;

    public Patent() {}

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
    }

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPatentDetails() {
        return patentDetails;
    }

    public void setPatentDetails(String patentDetails) {
        this.patentDetails = patentDetails;
    }

    public String getPatentArea() {
        return patentArea;
    }

    public void setPatentArea(String patentArea) {
        this.patentArea = patentArea;
    }

    public String getPatentKeyword() {
        return patentKeyword;
    }

    public void setPatentKeyword(String patentKeyword) {
        this.patentKeyword = patentKeyword;
    }

    public int getPatentDealTypes() {
        return patentDealTypes;
    }

    public void setPatentDealTypes(int patentDealTypes) {
        this.patentDealTypes = patentDealTypes;
    }

    public BigDecimal getPatentPrice() {
        return patentPrice;
    }

    public void setPatentPrice(BigDecimal patentPrice) {
        this.patentPrice = patentPrice;
    }

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
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