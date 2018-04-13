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
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<h1>图书管理系统</h1>
<br>
<button id="add">添加图书</button>
<button id="list">图书列表</button>
<button id="search">搜索图书</button>
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
