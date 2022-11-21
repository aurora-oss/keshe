package com.example.bookstore.dao;

import com.example.bookstore.dao.impl.StudentDaoImpl;
import com.example.bookstore.pojo.Student;
import org.junit.Test;


public class StudentDaoTest {
    private static StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void queryStudentByID() {
        System.out.println(studentDao.queryStudentByID("2020904017"));
    }

    @Test
    public void queryStudentByIDAndPassward() {
        System.out.println(studentDao.queryStudentByIDAndPassward("2020904017","liu123456"));
    }

    @Test
    public void saveStudent() {
//        insert into p_student(s_name, s_id,s_password,s_Faculties,s_major,s_power) values (?,?,?,?,?,?);
        System.out.println(studentDao.saveStudent(new Student(0,"monster","2020904017","liu123456","信息工程学院","软件工程","0")));
    }
}