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
            if (document.getElementById("searchText").value === null || document.getElementById("bookName").value === "")
            {
                alert("请输入搜索内容");
                return false;
            }
        }
    </script>
</head>
<body>
<h3 align="center">搜索</h3>
<div id="bottom" style="height: auto;width: auto" align="center">
    <form target="_blank" id="form" action="${pageContext.request.contextPath}/search" onsubmit="return checkNull()">
        <label>
            <input id="searchText" name="searchText" type="text" class="form-control" placeholder="输入关键字">
        </label>
        <br>
        <div class="radio">
            <label>
                <input type="radio" name="searchType" value="bookName" checked>
                根据书名搜索
            </label>
        </div>
        <div class="radio">
        <label>
            <input type="radio" name="searchType" value="author">
            根据作者搜索
        </label>
        </div>
        <button id="submit" class="btn btn-default">搜索</button>
    </form>
</div>
</body>
</html>
