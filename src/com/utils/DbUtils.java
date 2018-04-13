package com.utils;

import java.sql.*;

/**
 * @author JohnsonZheng
 */
public class DbUtils
{
    /**
     * 注册驱动的方法
     */
    private static void loadDriver()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 获得连接的方法
     */
    public static Connection getConnection()
    {

        Connection conn = null;
        try
        {
            loadDriver();
            conn = DriverManager.getConnection("jdbc:mysql:///java_web_books?useSSL=false", "root", "123456");
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 释放资源的方法
     */
    public static void close(ResultSet rs)
    {
        if (rs != null)
        {
            try
            {
                rs.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }

    }

    public static void close(Statement stmt)
    {
        if (stmt != null)
        {
            try
            {
                stmt.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }

    }

    public static void close(PreparedStatement ps)
    {

        if (ps != null)
        {
            try
            {
                ps.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
    }

    public static void close(Connection conn)
    {

        if (conn != null)
        {
            try
            {
                conn.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

}
