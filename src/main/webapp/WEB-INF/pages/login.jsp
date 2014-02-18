<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>
<form name="login" method="post" action="userPage">
    <input type="hidden" name="pagename" value="login"/>
        Enter name : <input type="text" name="txtName"> <br />
        Enter email : <input type="email" name="txtEmail"> <br />
    <input type="submit" value="login" />
</form>
</body>
</html>