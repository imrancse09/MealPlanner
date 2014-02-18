<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.springframework.ui.ModelMap" %>
<%@ page import="net.therap.controller.MealDescriptionController" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
</head>
<body>

<table border="1" width="900">
    <thead>
    <tr colspan = "10">
        <th colspan="150">Meal Description ID</th>
        <th colspan="150">Food Item ID</th>
        <th colspan="150">Food Item Name</th>
        <th colspan="150">Date of the Meal</th>
        <th colspan="150">Meal ID</th>
        <th colspan="150">Meal Name</th>
        <th colspan="150">#Likes</th>
        <th colspan="150">#DisLikes</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach var = "mealDescriptionListVar" items = "${mealDescriptionList}">
    <form action="/countLikeDislike" method=post>

        <tr colspan = "10">

            <td colspan="150">${mealDescriptionListVar.mealDescriptionId}</td>
            <td colspan="150">${mealDescriptionListVar.foodItem.foodItemId}</td>



            <td colspan="150">
                <input type="hidden" name="likeButton3" value="${mealDescriptionListVar.mealDescriptionId}">

                <input type="SUBMIT" name="like" value="Like"><input type="SUBMIT" name="dislike" value="DisLike">${mealDescriptionListVar.foodItemName}
            </td>

            <td colspan="150">${mealDescriptionListVar.mealDescriptionCreationDate}</td>
            <td colspan="150">${mealDescriptionListVar.mealId}</td>
            <td colspan="150">${mealDescriptionListVar.mealName}</td>
            <td colspan="150">${mealDescriptionListVar.likes}</td>
            <td colspan="150">${mealDescriptionListVar.disLikes}</td>
        </tr>
    </form>
    </c:forEach>
    </tbody>
</table>

</body>
<form action="/loginPage" method="GET">
    <input type="submit" value="logout"/>
</form>
</html>