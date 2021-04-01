<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/4/1
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>图书管理系统</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">

    <style>
        h3,th,td{
            text-align: center;
        }
        table th{
            background-color: aqua;
        }
    </style>
</head>
<body>
<div class="container">
<h3>书籍列表</h3>
    <div>
        <a href="${pageContext.request.contextPath}/book/toAddBook"><button type="button" class="btn btn-primary" style="float: right;margin: 5px">新增书籍</button></a>
    </div>
    <table class="table table-bordered table-hover table-striped">
        <tr>
            <th>书籍编号</th>
            <th>书籍名称</th>
            <th>书籍数量</th>
            <th>书籍描述</th>
            <th>操作</th>
        </tr>
        <c:forEach var="book" items="${books}" varStatus="">
            <tr>
                <td>${book.bookID}</td>
                <td>${book.bookName}</td>
                <td>${book.bookCounts}</td>
                <td>${book.detail}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookID}"  class="btn btn-info btn-sm">修改</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/book/deleteBookById?id=${book.bookID}"  class="btn btn-danger btn-sm">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
