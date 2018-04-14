<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div id="bottom" style="height: auto;width: auto">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>id</th>
            <th>书名</th>
            <th>作者</th>
            <th>描述</th>
            <th>操作</th>
        </tr>
        </thead>
        <c:forEach items="${list}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookName}</td>
                <td>${book.author}</td>
                <td>${book.description}</td>
                <td>

                    <button id="${book.id}" class="btn btn-info">编辑
                        <script>
                            $(function ()
                            {
                                $("#${book.id}").click(function ()
                                {
                                    $("#bottom").load("${pageContext.request.contextPath}/edit?id=" + $("#${book.id}").attr("id"));
                                })
                            })
                        </script>
                    </button>
                    <a href="${pageContext.request.contextPath}/delete?id=${book.id}">
                        <button class="btn btn-danger">删除</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
