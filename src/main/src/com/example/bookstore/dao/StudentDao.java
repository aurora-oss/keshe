package com.example.bookstore.dao;

import com.example.bookstore.pojo.Student;

public interface StudentDao {
    /**通过学生学号查询学生，返回学生实体
     * */
    Student queryStudentByID(String s_id);
    /**通过学生学号、密码查询学生，返回学生实体 用于登录
     * */
    Student queryStudentByIDAndPassward(String s_id,String s_passward);
    /**
     保存用户信息
     @param student 学生
     @return -1 表示操作失败，其他表示影响的行数
     */
    public int saveStudent(Student student);
}
