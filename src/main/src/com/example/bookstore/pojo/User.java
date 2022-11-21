package com.example.bookstore.pojo;

public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String real_name ;
    private String tel ;
    private String sex ;
    private String date;

    public User(Integer id, String name, String password, String email, String real_name, String tel, String sex, String date) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.real_name = real_name;
        this.tel = tel;
        this.sex = sex;
        this.date = date;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", real_name='" + real_name + '\'' +
                ", tel='" + tel + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
