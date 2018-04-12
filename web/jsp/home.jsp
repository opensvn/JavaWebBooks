<%@ page contentType="text/html;charset=UTF-8" %>
<%-- 当试图直接输入地址进入管理界面时，会对是否有登录状态进行判断，没有就会重定向到登录页面 --%>
<%
    if (request.getSession().getAttribute("admin")==null)
    {
        response.sendRedirect("/index.jsp");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>图书管理系统</h1>
</body>
</html>
