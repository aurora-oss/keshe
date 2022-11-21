package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.AdminDao;
import com.example.bookstore.pojo.Admin;

import static com.alibaba.druid.util.Utils.md5;

public class AdminDaoImpl extends BaseDao implements AdminDao {
    /**
     * 保存用户信息
     *
     * @param admin 管理员
     * @return -1 表示操作失败，其他表示影响的行数
     */
    @Override
    public int saveAdmin(Admin admin) {
        String sql = "insert into p_admin(a_name, a_id,a_password,a_power) values (?,?,?,?,?);";
        try {
            return update(sql,admin.getA_name(),admin.getA_id(),md5(admin.getA_passward()),admin.getA_power());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * 通过管理员教工号查询教师，返回管理员实体
     *
     * @param a_id 教职工工号
     */
    @Override
    public Admin queryAdminByID(String a_id) {
        String sql = "select * from p_admin where a_id = ?";
        return queryForone(Admin.class, sql, a_id);
    }

    /**
     * 通过教师教工号查询教师，返回教师实体
     *
     * @param a_id 教职工工号
     * @param a_passward 教职工密码
     */
    @Override
    public Admin queryAdminByIDAndPassward(String a_id, String a_passward) {
        String sql = "SELECT * from p_admin where a_name = ? and a_passward = ?;";
        return queryForone(Admin.class, sql, a_id,md5(a_passward));
    }
}
