<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2021/4/1
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
  <head>
    <title>首页</title>
      <style>
          a{
              text-decoration: none;
              color: #0f0f0f;
              font-size: 20px;
          }
          h3{
              width: 240px;
              height: 40px;
              margin: 100px auto;
              line-height: 40px;
              text-align: center;
              background-color: aqua;
              border-radius: 5px;
          }
      </style>
  </head>
  <body>
  <h3>
      <a href="${pageContext.request.contextPath}/book/allBooks">点击进入书籍展示页面</a>
  </h3>
  </body>
</html>
