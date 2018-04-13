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

    /**
     * 添加图书
     *
     * @param bookName    书名
     * @param author      作者
     * @param description 描述
     */
    void add(String bookName, String author, String description);

    /**
     * 删除图书
     *
     * @param id 书的 id
     */
    void delete(String id);

    /**
     * 查找某本图书
     *
     * @param id 书的 id
     * @return 某本图书
     */
    Books findOne(String id);

    /**
     * 更新
     *
     * @param id          书的 id
     * @param bookName    书名
     * @param author      作者
     * @param description 描述
     */
    void update(String id, String bookName, String author, String description);
}
