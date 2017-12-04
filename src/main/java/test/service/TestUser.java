package test.service;

import com.limeng.ssm.common.MD5Util;
import com.limeng.ssm.entity.User;
import com.limeng.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml","classpath:mybatis.xml"})
public class TestUser {
    @Autowired
    private UserService userService;
  //  @Test
    public  void testqryAllUserList(){
        List<User> userList = userService.qryAllUserList(0,20);
        for (int i = 0; i <userList.size() ; i++) {
            System.out.println("userName:" + userList.get(i).getUserName());
            System.out.println("userPhone:" + userList.get(i).getUserPhone());
        }
    }
    @Test
    public void insertUser(){
        String userName = "马大成";
        String password = MD5Util.getpwd("abcd1234");
        String userPhone = "13962253675";
        int userpwdError=0;
        userService.insertUser(userName,password,userPhone,userpwdError);

    }
}
