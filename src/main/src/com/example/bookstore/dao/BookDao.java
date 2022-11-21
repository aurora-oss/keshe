package com.example.bookstore.dao;

import com.example.bookstore.pojo.Book;

import java.util.List;

public interface BookDao {
    /*对书籍进行保存
    return -1表示操作失败，其他为影响的行数
    * */
    public int saveBook(Book book);

    /*通过书籍名称对其进行查询
    * */
    public Book getBook(String bookId);

    public int deleteBook(String book);

    public int updateBook(Book book);

    /*查询列表
    * */
    public List<Book> getBookList();
/*
* 求总记录数*/
    Integer queryForPageTotalCount();

    List<Book> queryForPageItems(int pageNo, int pageSize);
}
