package com.study.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order extends JSONBuilder {

    //订单刚生成，未确认状态
    public static final String STATUS_UNCONFIRMED = "unconfirmed";
    //订单已确认，待支付
    public static final String STATUS_UNPAY = "unpaid";
    //订单已支付
    public static final String STATUS_FINISH = "finish";
    //订单被取消
    public static final String STATUS_CANCEL = "cancel";
    //订单被删除
    public static final String STATUS_DELETE = "delete";

    //订单超时时间
    public static final long OVERTIME = 1000 * 60 * 60 * 24;

    //平台一站式服务
    public static final int TYPE_THE_WHOLE = 0;
    //第三方服务
    public static final int TYPE_ANOTHER = 1;

    private String orderId;
    private String orderNum;
    private String userId;
    private BigDecimal orderPayment;
    private int orderType;
    private String orderStatus;
    private Date orderPayTime;
    private Date orderEndTime;              //交易完成时间
    private Date orderCloseTime;            //交易关闭时间
    private Date createTime;
    private Date updateTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(BigDecimal orderPayment) {
        this.orderPayment = orderPayment;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Date getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(Date orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public Date getOrderCloseTime() {
        return orderCloseTime;
    }

    public void setOrderCloseTime(Date orderCloseTime) {
        this.orderCloseTime = orderCloseTime;
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