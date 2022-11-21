package com.example.bookstore.pojo;

public class TiTle {
    private int id;
    private int d_epithesis;
    private String d_coaching;
    private String d_open;
    private String d_task;
    private String d_translate;
    private String d_thesis;
    private String d_reply;
    private String d_subordinate;
    private String d_datetime;

    public TiTle(int id, int d_epithesis, String d_coaching, String d_open, String d_task, String d_translate, String d_thesis, String d_reply, String d_subordinate, String d_datetime) {
        this.id = id;
        this.d_epithesis = d_epithesis;
        this.d_coaching = d_coaching;
        this.d_open = d_open;
        this.d_task = d_task;
        this.d_translate = d_translate;
        this.d_thesis = d_thesis;
        this.d_reply = d_reply;
        this.d_subordinate = d_subordinate;
        this.d_datetime = d_datetime;
    }

    public TiTle() {
    }

    @Override
    public String toString() {
        return "TiTle{" +
                "id=" + id +
                ", d_epithesis=" + d_epithesis +
                ", d_coaching='" + d_coaching + '\'' +
                ", d_open='" + d_open + '\'' +
                ", d_task='" + d_task + '\'' +
                ", d_translate='" + d_translate + '\'' +
                ", d_thesis='" + d_thesis + '\'' +
                ", d_reply='" + d_reply + '\'' +
                ", d_subordinate='" + d_subordinate + '\'' +
                ", d_datetime='" + d_datetime + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getD_epithesis() {
        return d_epithesis;
    }

    public void setD_epithesis(int d_epithesis) {
        this.d_epithesis = d_epithesis;
    }

    public String getD_coaching() {
        return d_coaching;
    }

    public void setD_coaching(String d_coaching) {
        this.d_coaching = d_coaching;
    }

    public String getD_open() {
        return d_open;
    }

    public void setD_open(String d_open) {
        this.d_open = d_open;
    }

    public String getD_task() {
        return d_task;
    }

    public void setD_task(String d_task) {
        this.d_task = d_task;
    }

    public String getD_translate() {
        return d_translate;
    }

    public void setD_translate(String d_translate) {
        this.d_translate = d_translate;
    }

    public String getD_thesis() {
        return d_thesis;
    }

    public void setD_thesis(String d_thesis) {
        this.d_thesis = d_thesis;
    }

    public String getD_reply() {
        return d_reply;
    }

    public void setD_reply(String d_reply) {
        this.d_reply = d_reply;
    }

    public String getD_subordinate() {
        return d_subordinate;
    }

    public void setD_subordinate(String d_subordinate) {
        this.d_subordinate = d_subordinate;
    }

    public String getD_datetime() {
        return d_datetime;
    }

    public void setD_datetime(String d_datetime) {
        this.d_datetime = d_datetime;
    }
}
