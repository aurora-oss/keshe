package com.example.bookstore.pojo;

public class Teacher {
    private int id;
    private String p_name;
    private String p_id;
    private String p_passward;
    private String p_Faculties;
    private String p_major;
    private String p_power;

    public Teacher(int id, String p_name, String p_id, String p_passward, String p_Faculties, String p_major, String p_power) {
        this.id = id;
        this.p_name = p_name;
        this.p_id = p_id;
        this.p_passward = p_passward;
        this.p_Faculties = p_Faculties;
        this.p_major = p_major;
        this.p_power = p_power;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", p_name='" + p_name + '\'' +
                ", p_id='" + p_id + '\'' +
                ", p_passward='" + p_passward + '\'' +
                ", p_Faculties='" + p_Faculties + '\'' +
                ", p_major='" + p_major + '\'' +
                ", p_power='" + p_power + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_passward() {
        return p_passward;
    }

    public void setP_passward(String p_passward) {
        this.p_passward = p_passward;
    }

    public String getP_Faculties() {
        return p_Faculties;
    }

    public void setP_Faculties(String p_Faculties) {
        this.p_Faculties = p_Faculties;
    }

    public String getP_major() {
        return p_major;
    }

    public void setP_major(String p_major) {
        this.p_major = p_major;
    }

    public String getP_power() {
        return p_power;
    }

    public void setP_power(String p_power) {
        this.p_power = p_power;
    }
}
