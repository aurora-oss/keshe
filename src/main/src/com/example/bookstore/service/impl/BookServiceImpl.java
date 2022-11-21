package com.example.bookstore.service.impl;

import com.example.bookstore.dao.BookDao;
import com.example.bookstore.dao.impl.BookDaoImpl;
import com.example.bookstore.pojo.Book;
import com.example.bookstore.pojo.Page;
import com.example.bookstore.service.Bookservice;

import java.util.List;

public class BookServiceImpl implements Bookservice {
    private final BookDao bookDao = new BookDaoImpl();


    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int deleteBook(String book) {
        return bookDao.deleteBook(book);
    }

    @Override
    public void saveBook(Book book) {
        bookDao.saveBook(book);
    }

    @Override
    public Book getBook(String bookId) {
        return bookDao.getBook(bookId);
    }

    @Override
    public List<Book> getBookList() {
        return bookDao.getBookList();
    }

    @Override
    public Page<Book> page(int pageNo, int pageSize) {
        Page<Book> page = new Page<Book>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        Integer pageTotalCount = bookDao.queryForPageTotalCount();
        page.setPageTotal(pageTotalCount);
        Integer pageTotal = pageTotalCount/ pageSize;
        if(pageTotalCount % pageSize>0){
           pageTotal+=1;
        }
        page.setPageTotal(pageTotal);
        page.setPageTotalCount(pageTotalCount);
        //求开始索引
        int begin = (pageNo -1)*pageSize;
        List<Book> items = bookDao.queryForPageItems(begin,pageSize);
        page.setItems(items);
        return page;
    }
}
