package com.study.entity.result;

import com.study.entity.JSONBuilder;

import java.math.BigDecimal;
import java.util.Date;

public class OrderResult extends JSONBuilder {
    private String orderId;             // 订单id
    private String orderNum;            // 订单号
//    private String userId;              // 订单用户id
    private String patentId;            // 专利id
    private BigDecimal orderPayment;    // 订单支付金额
    private int orderType;              // 订单中的服务类型
    private String orderStatus;         // 订单状态
    private String orderDealWay;        // 交易方式，1-买断
    private Date orderPayTime;          // 订单支付时间
    private Date orderEndTime;          // 交易完成时间
    private Date orderCloseTime;        // 交易关闭时间
    private int isUpdate;               // 订单是否被修改，1-修改，0-未修改
    private int isDel;                  // 订单是否被删除，1-删除，0-未删除
    private Date createTime;            // 订单创建时间
    private Date updateTime;            // 订单更新时间

    private String patentName;
    private String userId;              // 专利对应用户id
    private String userName;
    private String patentDetails;
    private String patentArea;
    private String patentKeyword;
    private int patentDealTypes;

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

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
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

    public String getOrderDealWay() {
        return orderDealWay;
    }

    public void setOrderDealWay(String orderDealWay) {
        this.orderDealWay = orderDealWay;
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

    public int getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(int isUpdate) {
        this.isUpdate = isUpdate;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
