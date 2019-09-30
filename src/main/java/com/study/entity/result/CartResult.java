package com.study.entity.result;

import java.math.BigDecimal;
import java.util.Date;

public class CartResult {
    private String cartId;
    private String userId;
    private String patentId;
    private int dealWay;
    private BigDecimal dealPrice;
    private Date createTime;
    private Date updateTime;

    private String patentName;
    private String userName;
    private String patentDetails;
    private String patentArea;
    private String patentKeyword;
    private int patentDealTypes;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
    }

    public int getDealWay() {
        return dealWay;
    }

    public void setDealWay(int dealWay) {
        this.dealWay = dealWay;
    }

    public BigDecimal getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(BigDecimal dealPrice) {
        this.dealPrice = dealPrice;
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

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
