package com.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 手动添加一些数据
 *
 * @author JohnsonZheng
 */
public class AddDate
{
    public static void main(String[] args)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        try
        {
            conn = DbUtils.getConnection();
            ps = conn.prepareStatement("insert into books(book_name, author, description) values (?, ?, ?)");
            for (int i = 1; i < 101; i++)
            {
                ps.setString(1, "book" + i);
                ps.setString(2, "author" + i);
                ps.setString(3, "describe something");
                ps.executeUpdate();
            }
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
