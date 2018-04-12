<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form action="${pageContext.request.contextPath}/AdministratorServlet" method="post">
  <label>
    管理员：<input name="name" type="text">
  </label>
  <br>
  <label>
    密码：<input name="password" type="password">
  </label>
  <br>
  <input type="submit" value="登录">
</form>
  </body>
</html>
