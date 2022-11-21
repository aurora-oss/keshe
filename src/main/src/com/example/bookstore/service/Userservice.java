package com.example.bookstore.service;

import com.example.bookstore.pojo.User;

public interface Userservice {
    /*
    * 业务层*/
    /*注册用户*/
    public void registUser(User user);
    /*登录*/
    public User login(User user);
    /*检查是否重名
    * 返回True表示用户名存在、返回false表示可用
    * */
    public Boolean existUsername(String username);

    public Boolean existUserTel(String tel);

}
