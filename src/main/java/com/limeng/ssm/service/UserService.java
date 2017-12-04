package com.limeng.ssm.service;

import com.limeng.ssm.entity.User;

import java.math.BigInteger;
import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     * @param offset
     * @param limit
     * @return
     */
    public List<User> qryAllUserList(int offset, int limit );

    /**
     * 添加用户信息
     * @param userName
     * @param password
     * @param userPhone
     * @param passwdError
     */
    public void insertUser(String userName,String password,String userPhone,int passwdError);

}
