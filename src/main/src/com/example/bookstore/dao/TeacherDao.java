package com.example.bookstore.dao;


import com.example.bookstore.pojo.Teacher;
import com.example.bookstore.pojo.User;

public interface TeacherDao {
    /**通过教师教工号查询教师，返回教师实体
     * */
    Teacher queryStudentByID(String p_id);
    /**通过教师教工号、密码查询教师，返回教师实体用于登录
     * */
    Teacher queryStudentByIDAndPassward(String p_id,String p_passward);
    /**
    保存用户信息
    @param teacher 教师
    @return -1 表示操作失败，其他表示影响的行数
    */
    public int saveTeacher(Teacher teacher);
}
