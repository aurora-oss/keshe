package com.example.bookstore.service.impl;

import com.example.bookstore.dao.UserDao;
import com.example.bookstore.dao.impl.UserDaoImpl;
import com.example.bookstore.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceimlTest {
    private UserDao userDao = new UserDaoImpl();

//    @Test
//    public void registUser() {
//        userDao.saveUser(new User("Tom","6666666","Administrator@qq.com",0,"小王","1234567890","male","2012-12-8"));
//    }

    @Test
    public void login() {
        if(userDao.getUserByUsernameAndPassword("Tom","6666666") ==null)
        {
            System.out.println("查询无");
        }
        else{
            System.out.println("查询得到");
        }
    }

    @Test
    public void existUsername() {
        User user = userDao.queryUserByUsername("monster");
        System.out.println(user);
    }

    @Test
    public void existUserTel() {
        if(userDao.quertUserByTel("18292047145")== null){
            System.out.println("查询无");
        }
        else{
            System.out.println("查询得到");
        }
    }
}