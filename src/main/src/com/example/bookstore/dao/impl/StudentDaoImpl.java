package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.StudentDao;
import com.example.bookstore.pojo.Student;

import static com.alibaba.druid.util.Utils.md5;

public class StudentDaoImpl extends BaseDao implements StudentDao {
    /**
     * 保存用户信息
     *
     * @param student 学生
     * @return -1 表示操作失败，其他表示影响的行数
     */
    @Override
    public int saveStudent(Student student) {
        String sql = "insert into p_student(id,s_name, s_id,s_passward,s_Faculties,s_major,s_power) values (0,?,?,?,?,?,?);";
        try {
            return update(sql,student.getS_name(),student.getS_id(),md5(student.getS_password()),student.getS_Faculties(),
                    student.getS_major(),student.getS_power());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * 通过学生学号查询学生，返回学生实体
     *
     * @param s_id 学生学号
     */
    @Override
    public Student queryStudentByID(String s_id) {
        String sql = "select * from p_student where s_id = ?";
        return queryForone(Student.class, sql, s_id);
    }

    /**
     * 通过学生学号、密码查询学生，返回学生实体 用于登录
     *
     * @param s_id 学生学号
     * @param s_passward 学生密码
     */
    @Override
    public Student queryStudentByIDAndPassward(String s_id, String s_passward) {
        String sql = "SELECT * from p_student where s_id = ? and s_passward = ?;";
        return queryForone(Student.class, sql, s_id,md5(s_passward));
    }

}
