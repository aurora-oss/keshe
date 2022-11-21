package com.example.bookstore.service.impl;

import com.example.bookstore.dao.UserDao;
import com.example.bookstore.dao.impl.UserDaoImpl;
import com.example.bookstore.pojo.User;
import com.example.bookstore.service.Userservice;

public class UserServiceiml implements Userservice {
    /*业务层需要操作数据库对象*/
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.getUserByUsernameAndPassword(user.getName(), user.getPassword());
    }

    @Override
    public Boolean existUsername(String username) {
        if(userDao.queryUserByUsername(username) == null)
        {
            //null表示没有查到
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Boolean existUserTel(String tel) {
        if (userDao.quertUserByTel(tel) == null){
            //null表示没有查到
            return false;
        }else {
            return true;
        }
    }
}
