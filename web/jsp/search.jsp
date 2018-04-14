<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
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
<div id="bottom" style="height: auto;width: auto">
    <form target="_blank" id="form" action="${pageContext.request.contextPath}/search" onsubmit="return checkNull()">
        <label>
            <input id="searchText" name="searchText" type="text">
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
        <button id="submit">搜索</button>
    </form>
</div>
</body>
</html>
