package com.example.bookstore.test;

import com.example.bookstore.dao.BookDao;
import com.example.bookstore.dao.impl.BookDaoImpl;
import com.example.bookstore.pojo.Book;
import org.junit.Test;


public class BookDaoImplTest {
    private static BookDao bookDao = new BookDaoImpl();
    @Test
    public void queryForPageItems() {
        for (Book book: bookDao.queryForPageItems(0,2)){
            System.out.println(book);
        }
    }
    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

}