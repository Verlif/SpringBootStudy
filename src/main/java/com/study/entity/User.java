package com.study.entity;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public class User extends JSONBuilder {

    private static final String BELONG_PUBLIC = "public";

    private String userId;              // 用户id
    private String groupId;             // 用户所在组id
    private String userName;            // 用户昵称
    private String userAccount;         // 用户手机号
    private String userPassword;        // 用户密码?暂定
    private String userAddr;            // 用户所在省市
    private String userAddrDetailed;    // 用户所在详细地址
    private String userContact;         // 用户联系方式说明
    private String userArea;            // 用户所在领域
    private String userKeyword;         // 用户相关的关键词集
    private int userGrade;              // 用户等级
    private String userWechatAccount;   // 用户微信账号绑定信息
    private String userAlipayAccount;   // 用户支付宝账号绑定信息
    private String userCode;            // 用户邀请码
    private String userInfo;            // 用户介绍
    private int isDel;                  // 用户是否已注销
    private Date createTime;            // 用户创建时间
    private boolean isCompany;          // 企业是否已认证
    private boolean isProxy;            // 第三方代理是否已认证
    private String belong;              // 用户所属标识，用于标记用户注册时的渠道
    {
        belong = BELONG_PUBLIC;
    }

    public User() {}
    public User(JSONObject json) {
        super(json);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserAddrDetailed() {
        return userAddrDetailed;
    }

    public void setUserAddrDetailed(String userAddrDetailed) {
        this.userAddrDetailed = userAddrDetailed;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }

    public String getUserKeyword() {
        return userKeyword;
    }

    public void setUserKeyword(String userKeyword) {
        this.userKeyword = userKeyword;
    }

    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserWechatAccount() {
        return userWechatAccount;
    }

    public void setUserWechatAccount(String userWechatAccount) {
        this.userWechatAccount = userWechatAccount;
    }

    public String getUserAlipayAccount() {
        return userAlipayAccount;
    }

    public void setUserAlipayAccount(String userAlipayAccount) {
        this.userAlipayAccount = userAlipayAccount;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public boolean isCompany() {
        return isCompany;
    }

    public void setCompany(boolean company) {
        isCompany = company;
    }

    public boolean isProxy() {
        return isProxy;
    }

    public void setProxy(boolean proxy) {
        isProxy = proxy;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public boolean isDel() {
        return isDel != 0;
    }

    public void del(boolean isDel) {
        this.isDel = isDel ? 1 : 0;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBelong() {
        return belong;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }
}
