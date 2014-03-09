<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Successful</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<div id="home-menu-ver">
Food Item Added Successfully<br>
<form action="redirectedUserPage" method="post">
    <input type="submit" value="Add Another Food Item"/>
</form>

<form action="toAdminPage">
    <input type="submit" value="Admin Page"/>
</form>

<form action="/loginPage" method="GET">
    <input type="submit" value="logout"/>
</form>
</div>
</body>
</html>