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
<table class="table table-hover">
    <thead>
    <tr>
        <td>id</td>
        <td>书名</td>
        <td>作者</td>
        <td>描述</td>
    </tr>
    </thead>
    <c:forEach items="${list}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.bookName}</td>
            <td>${book.author}</td>
            <td>${book.description}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
