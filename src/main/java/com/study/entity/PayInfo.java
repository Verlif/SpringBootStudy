package com.study.entity;

import java.util.Date;

public class PayInfo extends JSONBuilder {

    public static final int TYPE_WX = 0;        // 微信支付
    public static final int TYPE_ALIPAY = 1;    // 支付宝支付

    private String payId;       // 支付信息id
    private String userId;      // 支付用户id
    private String orderId;     // 相关订单id
    private int payType;        // 支付方式
    private String payNum;      // 交易流水号
    private String payStatus;   // 支付状态?待商榷
    private Date createTime;    // 支付信息创建时间
    private Date updateTime;    // 支付信息更新时间

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getPayNum() {
        return payNum;
    }

    public void setPayNum(String payNum) {
        this.payNum = payNum;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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