<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <script>
        function checkNull()
        {
            if (document.getElementById("bookName").value === null || document.getElementById("bookName").value === "")
            {
                alert("书名不能为空");
                return false;
            }
        }
    </script>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/add" onsubmit="return checkNull()">
    <label>
        书名：<input id="bookName" name="bookName" type="text">
    </label>
    <br>
    <label>
        作者：<input name="author" type="text">
    </label>
    <br>
    <label>
        描述：<textarea name="description" cols="30" rows="10"></textarea>
    </label>
    <br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
