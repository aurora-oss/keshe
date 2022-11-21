package com.example.bookstore.dao;

import com.example.bookstore.pojo.Admin;
import com.example.bookstore.pojo.TiTle;

public interface TitleDao {
    /**
     保存用户信息
     @param tiTle 教师
     @return -1 表示操作失败，其他表示影响的行数
     */
    int saveTitle(TiTle tiTle);
    /**
     保存用户信息
     @param title 题目名
     @return 通过提目名查询返回Title实体、可通过在公告栏
     */
    TiTle queryTitleByID(String title);
}
