package com.example.bookstore.service;

import com.example.bookstore.pojo.Book;
import com.example.bookstore.pojo.Page;
import java.util.List;

public interface Bookservice {

    void saveBook(Book book);
    Book getBook(String bookId);
    int updateBook(Book book);
    int deleteBook(String Title);
    List<Book> getBookList();
    Page<Book> page(int pageNo, int pageSize);
}
