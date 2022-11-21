package com.example.bookstore.dao;

import com.example.bookstore.pojo.User;

public interface UserDao {
    /*
    * 根据用户名查询用户信息
    * @param username 用户名
    * @return 返回null则没有这个人，反之已然
    */
    public User queryUserByUsername(String username);

    /*
    根据用户名和密码查询用户信息，进行登录检测
    * @param username 用户名
    * @param password 用户密码
    * @return
    */
    public User getUserByUsernameAndPassword(String username, String password);

    /*
    保存用户信息
    @param user 用户
    @return -1 表示操作失败，其他表示影响的行数
    */
    public int saveUser(User user);

    public User quertUserByTel(String tel);

}
