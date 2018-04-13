package com.dao;

import com.entity.Books;
import com.utils.DbUtils;

import java.sql.*;
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

    @Override
    public void add(String bookName, String author, String description)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        try
        {
            conn = DbUtils.getConnection();
            ps = conn.prepareStatement("insert into books(book_name, author, description) values (? ,?, ?)");
            ps.setString(1, bookName);
            ps.setString(2, author);
            ps.setString(3, description);
            ps.executeUpdate();
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            DbUtils.close(ps);
            DbUtils.close(conn);
        }
    }
}
