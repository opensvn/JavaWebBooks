package com.servlet;

import com.entity.Books;
import com.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author JohnsonZheng
 */
@WebServlet(name = "BookListServlet", urlPatterns = "/list")
public class BookListServlet extends HttpServlet
{
    private BookService bookService = new BookService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<Books> list = bookService.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/jsp/list.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}
