<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Admin Page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<div id="home-menu-ver">
    <form action="addItem" method="post">
        <input type="submit" value="Add Food Items" autofocus="autofocus"/>
    </form>

    <form action="redirectedAddMealPage" method="post">
        <input type="submit" value="Add Meal Description" autofocus="autofocus"/>
    </form>

    <form action="viewHomePage" method="GET">
        <input type="submit" value="Home" autofocus="autofocus"/>
    </form>
</div>
</body>
</html>