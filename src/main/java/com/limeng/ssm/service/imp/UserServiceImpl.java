package com.limeng.ssm.service.imp;

import com.limeng.ssm.dao.UserDao;
import com.limeng.ssm.entity.User;
import com.limeng.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
   @Autowired
   private UserDao userDao;

   public List<User> qryAllUserList(int offset, int limit) {
        return  userDao.qryAllUserList(offset,limit);
    }

    public void insertUser(String userName, String password, String userPhone, int passwdError) {
        userDao.insertUser(userName,password,userPhone,passwdError);
    }
}
