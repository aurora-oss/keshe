package com.example.bookstore.dao;

import com.example.bookstore.pojo.Admin;
import com.example.bookstore.pojo.Teacher;

public interface AdminDao {
    /**通过管理员教工号查询教师，返回管理员实体
     * */
    Admin queryAdminByID(String a_id);
    /**通过教师教工号查询教师，返回教师实体
     * */
    Admin queryAdminByIDAndPassward(String a_id,String a_passward);
    /**
     保存用户信息
     @param admin 管理员
     @return -1 表示操作失败，其他表示影响的行数
     */
    public int saveAdmin(Admin admin);
}
