package com.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author JohnsonZheng
 */
@WebServlet(name = "AdministratorServlet", urlPatterns = "/AdministratorServlet")
public class AdministratorServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String name = "admin";
        String password = "123456";
        String getName = request.getParameter("name");
        String getPassword = request.getParameter("password");
        if (name.equals(getName) && password.equals(getPassword))
        {
            request.getSession().setAttribute("admin", name);
            response.sendRedirect("jsp/home.jsp");
        } else
        {
            response.sendRedirect("index.jsp");
        }
    }
}
