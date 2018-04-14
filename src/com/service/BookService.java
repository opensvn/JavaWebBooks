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

    public void delete(String id)
    {
        bookDao.delete(id);
    }

    public Books findOne(String id)
    {
        return bookDao.findOne(id);
    }

    public void update(String id, String bookName, String author, String description)
    {
        bookDao.update(id, bookName, author, description);
    }

    public List<Books> findByName(String searchText)
    {
        return bookDao.findByName(searchText);
    }

    public List<Books> findByAuthor(String searchText)
    {
        return bookDao.findByAuthor(searchText);
    }
}
