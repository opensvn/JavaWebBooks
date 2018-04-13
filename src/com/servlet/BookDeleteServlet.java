package com.servlet;

import com.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author JohnsonZheng
 */
@WebServlet(name = "BookDeleteServlet", urlPatterns = "/delete")
public class BookDeleteServlet extends HttpServlet
{
    private BookService bookService = new BookService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String id = request.getParameter("id");
        bookService.delete(id);
        response.sendRedirect("/jsp/home.jsp");
    }
}
