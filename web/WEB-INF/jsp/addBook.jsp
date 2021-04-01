<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/4/2
  Time: 2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>图书管理系统</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">

    <style>
        h3{
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h3>新增书籍</h3>
    <div>

        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
<%--            <div class="form-group">
                <label for="bookid">书籍编号</label>
                <input name="bookID" type="text" class="form-control" id="bookid" >
            </div>--%>
            <div class="form-group">
                <label for="bookname">书籍名称</label>
                <input name="bookName" type="text" class="form-control" id="bookname" >
            </div>
            <div class="form-group">
                <label for="bookcounts">书籍数量</label>
                <input name="bookCounts" type="text" class="form-control" id="bookcounts" >
            </div>
            <div class="form-group">
                <label for="detail">书籍描述</label>
                <input name="detail" type="text" class="form-control" id="detail" >
            </div>
            <button type="submit" class="btn btn-primary">提交</button>
        </form>
    </div>
</div>
</body>
</html>
