package com.example.bookstore.pojo;

public class Admin {
    private int id;
    private String a_name;
    private String a_id;
    private String a_passward;
    private String a_power;

    public Admin(int id, String a_name, String a_id, String a_passward, String a_power) {
        this.id = id;
        this.a_name = a_name;
        this.a_id = a_id;
        this.a_passward = a_passward;
        this.a_power = a_power;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", a_name='" + a_name + '\'' +
                ", a_id='" + a_id + '\'' +
                ", a_passward='" + a_passward + '\'' +
                ", a_power='" + a_power + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getA_passward() {
        return a_passward;
    }

    public void setA_passward(String a_passward) {
        this.a_passward = a_passward;
    }

    public String getA_power() {
        return a_power;
    }

    public void setA_power(String a_power) {
        this.a_power = a_power;
    }
}
