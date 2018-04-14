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
@WebServlet(name = "BookSearchServlet", urlPatterns = "/search")
public class BookSearchServlet extends HttpServlet
{
    private BookService bookService = new BookService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String searchText = request.getParameter("searchText");
        String searchType = request.getParameter("searchType");
        String bookName = "bookName";
        String author = "author";
        if (bookName.equals(searchType))
        {
            List<Books> list = bookService.findByName(searchText);
            request.setAttribute("list", list);
            request.getRequestDispatcher("/jsp/searchList.jsp").forward(request, response);
        }
        if (author.equals(searchType))
        {
            List<Books> list = bookService.findByAuthor(searchText);
            request.setAttribute("list", list);
            request.getRequestDispatcher("/jsp/searchList.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}
