package com.example.bookstore.test;

import com.example.bookstore.pojo.User;
import com.example.bookstore.service.Userservice;
import com.example.bookstore.service.impl.UserServiceiml;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserserviceTest {

    Userservice userservice = new UserServiceiml();

//    @Test
//    public void registUser() {
//        userservice.registUser(new User("Tom","6666666","Administrator@qq.com",0));
//    }
//
//    @Test
//    public void login() {
//        System.out.println(userservice.login(new User("Tom","6666666","Administrator@qq.com",4)));
//    }

    @Test
    public void existUsername() {
        if(userservice.existUsername(("Tom"))){
            System.out.println("用户已经存在");
        }else{
            System.out.println("用户不存在");
        }
    }
}