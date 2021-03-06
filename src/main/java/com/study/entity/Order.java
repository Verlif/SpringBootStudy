package com.study.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order extends JSONBuilder {

    //订单刚生成，未确认状态
    public static final String STATUS_UNCONFIRMED = "unconfirmed";
    //订单已确认，待支付
    public static final String STATUS_UNPAID = "unpaid";
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

    private String orderId;             // 订单id
    private String orderNum;            // 订单号
    private String userId;              // 订单用户id
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

    public static String getStatusUnconfirmed() {
        return STATUS_UNCONFIRMED;
    }

    public static String getStatusUnpaid() {
        return STATUS_UNPAID;
    }

    public static String getStatusFinish() {
        return STATUS_FINISH;
    }

    public static String getStatusCancel() {
        return STATUS_CANCEL;
    }

    public static String getStatusDelete() {
        return STATUS_DELETE;
    }

    public static long getOVERTIME() {
        return OVERTIME;
    }

    public static int getTypeTheWhole() {
        return TYPE_THE_WHOLE;
    }

    public static int getTypeAnother() {
        return TYPE_ANOTHER;
    }

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
}