package com.study.entity;

import org.json.JSONObject;

import java.util.Date;

public class User extends JSONBuilder {
    private String userId;
    private String groupId;
    private String userName;
    private String userAccount;
    private String userPassword;
    private String userAddr;    //用户所在省市
    private String userAddrDetailed;
    private String userContact;
    private String userArea;
    private String userKeyword;
    private int userGrade;
    private String userWechatAccount;
    private String userAlipayAccount;
    private String userCode;
    private boolean isDel;
    private Date createTime;

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

    public boolean isDel() {
        return isDel;
    }

    public void setDel(boolean del) {
        isDel = del;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
