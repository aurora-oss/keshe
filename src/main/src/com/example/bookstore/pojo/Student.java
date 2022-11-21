package com.example.bookstore.pojo;

public class Student {
    private int id;
    private String s_name;
    private String s_id;
    private String s_password;
    private String s_Faculties;
    private String s_major;
    private String s_power;

    public Student(int id, String s_name, String s_id, String s_password, String s_Faculties, String s_major, String s_power) {
        this.id = id;
        this.s_name = s_name;
        this.s_id = s_id;
        this.s_password = s_password;
        this.s_Faculties = s_Faculties;
        this.s_major = s_major;
        this.s_power = s_power;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", s_name='" + s_name + '\'' +
                ", s_id='" + s_id + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_Faculties='" + s_Faculties + '\'' +
                ", s_major='" + s_major + '\'' +
                ", s_power='" + s_power + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getS_Faculties() {
        return s_Faculties;
    }

    public void setS_Faculties(String s_Faculties) {
        this.s_Faculties = s_Faculties;
    }

    public String getS_major() {
        return s_major;
    }

    public void setS_major(String s_major) {
        this.s_major = s_major;
    }

    public String getS_power() {
        return s_power;
    }

    public void setS_power(String s_power) {
        this.s_power = s_power;
    }
}
