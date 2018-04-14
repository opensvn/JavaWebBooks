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
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<h1 align="center">图书管理系统</h1>
<br>
<div align="center">
    <button id="add" class="btn btn-primary">添加图书</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button id="list" class="btn btn-primary">图书列表</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button id="search" class="btn btn-primary">搜索图书</button>
</div>
<br>
<div id="bottom" style="height: auto;width: auto">
    <iframe>

    </iframe>
</div>
<script>
    $(function ()
    {
        $("#add").click(function ()
        {
            $("#bottom").load("add.jsp");
        });
        $("#list").click(function ()
        {
            $("#bottom").load("/list");
        });
        $("#search").click(function ()
        {
            $("#bottom").load("search.jsp");
        });
        $("#bottom").load("/list");
    })
</script>
</body>
</html>
