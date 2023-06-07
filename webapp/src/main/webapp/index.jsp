<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<img src="static/img/imag1.png">
</body>

<form action="testRequest" method="get">
    <input type="submit" value="提交">
</form>

<form action="getParamByArgName.do " method="get">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit" value="noRequest">
</form>

</html>
