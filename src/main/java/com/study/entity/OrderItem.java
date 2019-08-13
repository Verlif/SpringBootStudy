package com.study.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem extends JSONBuilder {
    private String oitemId;
    private String orderId;
    private String patentId;
    private BigDecimal oitemPrice;
    private int dealWay;
    private Date createTime;

    public String getOitemId() {
        return oitemId;
    }

    public void setOitemId(String oitemId) {
        this.oitemId = oitemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
    }

    public BigDecimal getOitemPrice() {
        return oitemPrice;
    }

    public void setOitemPrice(BigDecimal oitemPrice) {
        this.oitemPrice = oitemPrice;
    }

    public int getDealWay() {
        return dealWay;
    }

    public void setDealWay(int dealWay) {
        this.dealWay = dealWay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
