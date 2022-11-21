package com.example.bookstore.dao.impl;

import com.example.bookstore.dao.BookDao;
import com.example.bookstore.pojo.Book;
import org.junit.Test;

public class BookDaoImplTest {

    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void getBook() throws Exception {
        if(bookDao.getBook("Hello") == null) {
            System.out.println("BookDao.getBook()为空");
        }

    }
}