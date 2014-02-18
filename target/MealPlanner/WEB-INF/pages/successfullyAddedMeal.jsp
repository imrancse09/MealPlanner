<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>MealSuccessfullyAdded</title>
</head>
<body>

Meal Description Added Successfully<br>
<form action="redirectedAddMealPage" method="post">
    <input type="submit" value="Add Another Meal Description"/>
</form>

<form action="/toAdminPage">
    <input type="submit" value="Admin Page"/>
</form>

<form action="/loginPage" method="GET">
    <input type="submit" value="logout"/>
</form>

</body>
</html>