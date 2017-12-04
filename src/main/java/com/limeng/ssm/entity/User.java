package com.limeng.ssm.entity;

/**
 *  用户
 */
public class User {
    private long userId;
    private String userName;
    private  String userPassword;
    private String userPhone;
    private int passwdError;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getPasswdError() {
        return passwdError;
    }

    public void setPasswdError(int passwdError) {
        this.passwdError = passwdError;
    }
}
