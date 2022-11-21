package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.UserDao;
import com.example.bookstore.pojo.User;
import org.junit.Test;
import static com.alibaba.druid.util.Utils.md5;

public class UserDaoImplTest {
    private UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() {
        User user =  userDao.queryUserByUsername("NaClO");
        System.out.println(user);
    }

    @Test
    public void getUserByUsernameAndPassword() {
        User user =  userDao.getUserByUsernameAndPassword("monster ",md5("liu20020822"));
    }

    @Test
    public void getUserByTel()
    {
        if(userDao.quertUserByTel("18292047145") == null) {
            System.out.println("！");
        }
    }
}