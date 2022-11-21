package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.TeacherDao;
import com.example.bookstore.pojo.Teacher;

import static com.alibaba.druid.util.Utils.md5;

public class TeacherDaoImpl extends BaseDao implements TeacherDao {

    /**
     * 保存用户信息
     *
     * @param teacher 教师
     * @return -1 表示操作失败，其他表示影响的行数
     */
    @Override
    public int saveTeacher(Teacher teacher) {
        String sql = "insert into p_teacher( p_name, p_id,p_password,p_Faculties, p_major,p_power) values (?,?,?,?,?,?);";
        try {
            return update(sql,teacher.getP_name(),teacher.getP_id(),md5(teacher.getP_passward()),teacher.getP_Faculties(),
                    teacher.getP_major(),teacher.getP_power());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


    /**
     * 通过教师教工号查询教师，返回教师实体
     *
     * @param p_id
     */
    @Override
    public Teacher queryStudentByID(String p_id) {
        String sql = "select * from p_teacher where p_id = ?";
        return queryForone(Teacher.class, sql, p_id);
    }

    /**
     * 通过教师教工号、密码查询教师，返回教师实体用于登录
     *
     * @param p_id
     * @param p_passward
     */
    @Override
    public Teacher queryStudentByIDAndPassward(String p_id, String p_passward) {
        String sql = "SELECT * from p_teacher where p_id = ? and p_passward = ?;";
        return queryForone(Teacher.class, sql, p_id,md5(p_passward));
    }
}
