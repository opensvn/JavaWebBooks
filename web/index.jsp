<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>$Title$</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div style="text-align: center" class="well col-centered">
    <form class="form-inline" action="${pageContext.request.contextPath}/AdministratorServlet" method="post">
        <div class="form-group">
            <label>管理员：</label>
            <input name="name" type="text" class="form-control" placeholder="admin">
        </div>
        <div class="form-group">
            <label>
                密码：
            </label><input class="form-control" name="password" type="password" placeholder="123456">
        </div>
        <button type="submit" class="btn btn-default">登录</button>
    </form>
</div>
</body>
</html>
