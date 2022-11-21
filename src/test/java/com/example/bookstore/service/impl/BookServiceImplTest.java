package com.example.bookstore.service.impl;

import com.example.bookstore.pojo.Book;
import com.example.bookstore.pojo.Page;
import com.example.bookstore.service.Bookservice;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceImplTest {
    Bookservice bookService = new BookServiceImpl();

    @Test
    public void Page() throws Exception {
        System.out.println(bookService.page(1,3).getPageTotalCount());
    }

    @Test
    public  void getBook() throws Exception {

       Book book =  bookService.getBook("Helo");
       System.out.println(book);
    }

}