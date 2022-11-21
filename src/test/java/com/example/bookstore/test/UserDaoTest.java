package com.example.bookstore.test;

import com.example.bookstore.dao.UserDao;
import com.example.bookstore.dao.impl.UserDaoImpl;
import com.example.bookstore.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() {
        if(userDao.queryUserByUsername("小王") == null) {
            System.out.println("用户名可用");
        }else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void getUserByUsernameAndPassword() {
        if(userDao.getUserByUsernameAndPassword("小王","123456") == null) {
            System.out.println("用户登录失败");
        }else {
            System.out.println("用户登录成功");
        }
    }

//    @Test
//    public void saveUser() {
//        System.out.println(userDao.saveUser(new User("admin","123456","admin@qq.com",0)));
//    }
}