package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.UserDao;
import com.example.bookstore.pojo.User;

import java.sql.SQLException;

import static com.alibaba.druid.util.Utils.md5;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserByUsername(String username)  { //queryForone
        String sql = "select * from t_user where password = ?";
        return queryForone(User.class, sql, username);
    }

    @Override
    public User getUserByUsernameAndPassword(String username, String password) {
        String sql = "SELECT name,password from t_user where name = ? and password = ?;";
        return queryForone(User.class, sql, username,md5(password));
    }


    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(name, password,email,real_name,tel,sex,date) values (?,?,?,?,?,?,?);";
        try {
            return update(sql, user.getName(),md5(user.getPassword()),user.getEmail(),user.getReal_name(),user.getTel(),user.getSex(),user.getDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public User quertUserByTel(String tel) {
        String sql = "SELECT tel from t_user where tel = ?;";
        return queryForone(User.class, sql, tel);
    }

}
