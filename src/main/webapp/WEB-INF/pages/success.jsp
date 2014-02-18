<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Successful</title>
</head>
<body>

Food Item Successfully Added
<form action="redirectedUserPage" method="post">
    <!input type="hidden" name="pagenameSuccess" value="success"/>
    <input type="submit" value="Add Another Food Item"/>
</form>

<form action="toAdminPage">

    <input type="submit" value="Admin Page"/>
</form>

<form action="/loginPage" method="GET">

    <input type="submit" value="logout"/>
</form>
</body>
</html>