package com.limeng.ssm.dao;

import com.limeng.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户信息
     * @param offset
     * @param limit
     * @return
     */
    public List<User> qryAllUserList(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 新增用户信息
     * @param userName：用户名
     * @param password：密码
     * @param userPhone：手机号
     * @param passwdError：密码错误数
     */
    public void  insertUser(@Param("user_name") String userName,@Param("user_password")String password,@Param("user_phone") String userPhone,@Param("passwd_error")int passwdError);
}
