<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
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
<div align="center">
    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/add"
          onsubmit="return checkNull()">
        <div class="form-inline" align="center">
            <label>书名：
                <input class="form-control" id="bookName" name="bookName" type="text">
            </label>
        </div>
        <div class="form-inline" align="center">
            <label>
                作者：<input class="form-control" name="author" type="text">
            </label>
        </div>
        <div class="form-inline" align="center">
            <label>
                描述：<textarea class="form-control" name="description" cols="30" rows="10"></textarea>
            </label>
        </div>
        <input class="btn btn-default" type="submit" value="提交">
        <input class="btn btn-default" type="reset" value="重置">
    </form>
</div>
</body>
</html>
