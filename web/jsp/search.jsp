<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/search" method="post">
    <label>
        <input name="searchText" type="text">
    </label>
    <br>
    <label>
        根据书名搜索：
        <input type="radio" name="searchType" value="bookName" checked>
    </label><br>
    <label>
        根据作者搜索：
        <input type="radio" name="searchType" value="author">
    </label>
    <br>
    <input value="搜索" type="submit">
</form>
</body>
</html>
