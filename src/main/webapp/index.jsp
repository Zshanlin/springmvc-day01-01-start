<%--
  Created by IntelliJ IDEA.
  User: zsl
  Date: 25/8/2021
  Time: 下午 3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>springMVC day01</h1>
<%--<a href="user/hello?username=zsl" >点击跳转</a>--%>
<form action="user/saveUser" method="post">
    姓名:<input type="text" name="uname"></br>
    年龄:<input type="text" name="age"></br>
    生日:<input type="text" value=""></br>
    <input type="submit" value="提交">
</form>
</body>
</html>
