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
@WebServlet(name = "BookAddServlet", urlPatterns = "/add")
public class BookAddServlet extends HttpServlet
{
    private BookService bookService = new BookService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String bookName = request.getParameter("bookName");
        String author = request.getParameter("author");
        String description = request.getParameter("description");
        bookService.add(bookName, author, description);
        request.getRequestDispatcher("/list").forward(request, response);
    }
}
