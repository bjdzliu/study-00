<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
please login
<form actoin="loginController.do" method="get">
    用户名: <input type="text" name="user"> <br/>
    密码: <input type="text" name="pwd"> <br/>
    <input type="submit" value="提交">

</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>