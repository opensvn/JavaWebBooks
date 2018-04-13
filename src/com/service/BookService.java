package com.service;

import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.entity.Books;

import java.util.List;

/**
 * @author JohnsonZheng
 */
public class BookService
{
    private BookDao bookDao = new BookDaoImpl();

    public List<Books> findAll()
    {
        return bookDao.findAll();
    }

    public void add(String bookName, String author, String description)
    {
        bookDao.add(bookName, author, description);
    }
}