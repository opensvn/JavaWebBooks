package com.servlet;

import com.entity.Books;
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
@WebServlet(name = "BookEditServlet", urlPatterns = "/edit")
public class BookEditServlet extends HttpServlet
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
        Books book = bookService.findOne(id);
        request.setAttribute("id", book.getId());
        request.setAttribute("bookName", book.getBookName());
        request.setAttribute("author", book.getAuthor());
        request.setAttribute("description", book.getDescription());
        request.getRequestDispatcher("/jsp/edit.jsp").forward(request, response);
    }
}
