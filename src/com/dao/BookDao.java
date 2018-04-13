package com.dao;

import com.entity.Books;

import java.util.List;

/**
 * @author JohnsonZheng
 */
public interface BookDao
{
    /**
     * 查找所有图书
     *
     * @return 所有图书
     */
    List<Books> findAll();
}
