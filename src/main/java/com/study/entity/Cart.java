package com.study.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cart extends JSONBuilder{
    private String cartId;
    private String userId;
    private String patentId;
    private int dealWay;
    private BigDecimal dealPrice;
    private Date createTime;
    private Date updateTime;

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
}