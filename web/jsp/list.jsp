<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div id="bottom" style="height: auto;width: auto">
    <table border="1" cellspacing="1" cellpadding="10">
        <tr>
            <td>id</td>
            <td>书名</td>
            <td>作者</td>
            <td>描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookName}</td>
                <td>${book.author}</td>
                <td>${book.description}</td>
                <td>

                    <button id="${book.id}">编辑
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
                        <button>删除</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
