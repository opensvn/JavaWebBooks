## Java Web 项目之图书管理系统

## 1.项目介绍

   - 管理员的登录操作
   - 对图书的 CRUD 操作
   - 主要的技术实现
     - jsp + servlet + jdbc + mysql
     - bootstrap + jquery + ajax

**都是 Java Web 里最基础的知识, 万丈高楼平地起, 不要沉迷框架, 夯实基础.**

## 2.项目功能截图

### 2.1 管理员登录
![](pics/Snipaste_2018-04-14_20-56-24.png)

### 2.2 添加图书
![](pics/Snipaste_2018-04-14_21-05-50.png)

### 2.3 所有图书列表
![](pics/Snipaste_2018-04-14_21-08-47.png)

### 2.4 搜索图书
![](pics/Snipaste_2018-04-14_21-10-42.png)

### 2.5 编辑图书
![](pics/Snipaste_2018-04-14_21-11-28.png)

## 3.准备

### 1.jar包
- jstl.jar
- standard.jar
- mysql-connector-java.jar

### 2.建包
- dao
- entity
- service
- servlet
- utils

### 3.建表
- 数据库名：java_web_books
- 表：
```
create table books
(
  id          int auto_increment primary key,
  book_name   varchar(255) null,
  author      varchar(255) null,
  description varchar(255) null
)engine = InnoDB;
```
## 4.一些说明
> 没有使用 iframe 而选择用 Ajax. 最上面的那部分相当于导航栏, 点击相应的按钮进入对应的功能界面, 而导航栏不变. 

### 4.1 首页的部分代码(已适当删减便于阅读, 下同)
```
<div align="center">
    <button id="add">添加图书</button>
    <button id="list">图书列表</button>
    <button id="search">搜索图书</button>
</div>
<br>
<div id="bottom">
</div>
<script>
    $(function ()
    {
        $("#add").click(function ()
        {
            $("#bottom").load("add.jsp");
        });
        $("#list").click(function ()
        {
            $("#bottom").load("/list");
        });
        $("#search").click(function ()
        {
            $("#bottom").load("search.jsp");
        });
        $("#bottom").load("/list");
    })
</script>
```
这样就实现在导航栏下面显示不同的功能页面

### 4.2 点编辑按钮时的一些骚操作
> 在图书列表点编辑某本书时, 实现在导航栏下方显示编辑页面而不跳转(如图)

![](pics/Snipaste_2018-04-14_21-11-28.png)
关键代码
```
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
```
思路：在从数据库获取图书显示到页面时, 给每一个编辑按钮设定一个和图书 id 值一样的 id 属性, 这样就可以获取要编辑的那本图书的内容到编辑页面上, 还保持导航栏不变
