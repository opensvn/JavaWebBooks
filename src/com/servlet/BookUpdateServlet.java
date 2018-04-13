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
@WebServlet(name = "BookUpdateServlet", urlPatterns = "/update")
public class BookUpdateServlet extends HttpServlet
{
    private BookService bookService = new BookService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String id = request.getParameter("id");
        String bookName = request.getParameter("bookName");
        String author = request.getParameter("author");
        String description = request.getParameter("description");
        bookService.update(id, bookName, author, description);
        response.sendRedirect("/jsp/home.jsp");
    }

}
