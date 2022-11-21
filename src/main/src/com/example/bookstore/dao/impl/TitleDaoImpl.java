package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.TitleDao;
import com.example.bookstore.pojo.TiTle;

public class TitleDaoImpl extends BaseDao implements TitleDao {

    /**
     * 保存用户信息
     *
     * @param tiTle 教师
     * @return -1 表示操作失败，其他表示影响的行数
     */
    @Override
    public int saveTitle(TiTle tiTle) {
        return 0;
    }

    /**
     * 保存用户信息
     *
     * @param title 题目名
     * @return 通过提目名查询返回Title实体、可通过在公告栏
     */
    @Override
    public TiTle queryTitleByID(String title) {
        return null;
    }
}
