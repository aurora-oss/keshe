package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.BookDao;
import com.example.bookstore.pojo.Book;

import java.util.List;


public class BookDaoImpl extends BaseDao implements BookDao {
    @Override
    public int deleteBook(String book) {
        String sql = "Delete from t_book where title = ?;";
        return update(sql,book);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update t_book set title = ?,author = ?,price = ?,sales = ?,imag =?,stock=? where id = ?;";
        return update(sql,book.getTitle(),book.getAuthor(),book.getPrice(),book.getSales(),book.getImag(),book.getStock(),
        book.getTitle());
    }

    @Override
    public int saveBook(Book book) {
        String sql = "insert into t_book(title, author,price,sales,imag,stock) values (?,?,?,?,?,?);";
        try {
            return update(sql,book.getTitle(),book.getAuthor(),book.getPrice(),book.getSales(),book.getImag(),book.getStock());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Book getBook(String bookId) {
        String sql = "SELECT * from t_book where title = ?;";
        return queryForone(Book.class, sql, bookId);
        }

    @Override
    public List<Book> getBookList() {
        String sql = "select * from t_book";
        return queryForList(Book.class,sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from t_book;";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    @Override
    public List<Book> queryForPageItems(int pageNo, int pageSize) {
        String sql = "select * from t_book limit ?,?";
        return queryForList(Book.class,sql,pageNo,pageSize);
    }
}
