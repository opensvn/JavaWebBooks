package com.dao;

import com.entity.Books;
import com.utils.DbUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JohnsonZheng
 */
public class BookDaoImpl implements BookDao
{

    @Override
    public List<Books> findAll()
    {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        List<Books> list = new ArrayList<>();
        Books books;
        try
        {
            conn = DbUtils.getConnection();
            statement = conn.createStatement();
            rs = statement.executeQuery("select * from books");
            while (rs.next())
            {
                books = new Books();
                books.setId(rs.getInt("id"));
                books.setBookName(rs.getString("book_name"));
                books.setAuthor(rs.getString("author"));
                books.setDescription(rs.getString("description"));
                list.add(books);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            DbUtils.close(rs);
            DbUtils.close(statement);
            DbUtils.close(conn);
        }
        return list;
    }
}
