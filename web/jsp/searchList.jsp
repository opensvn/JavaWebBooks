<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellspacing="1" cellpadding="10">
    <tr>
        <td>id</td>
        <td>书名</td>
        <td>作者</td>
        <td>描述</td>
    </tr>
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
