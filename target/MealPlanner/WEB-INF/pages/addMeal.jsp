<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<form action="addMealDesc" METHOD="POST">

    <bold>SELECT MEAL TYPE</bold>
    <br>

    <select name="select">
        <option value="Breakfast">Breakfast</option>
        <option value="Lunch">Lunch</option>
        <option value="Evening Snacks">EveningSnacks</option>
    </select>
    <br>

<table>
    <br>
    <bold>SELECT FOOD ITEM</bold>
    <tbody>
    <br>
    <c:forEach var = "foodItem" items = "${foodItemList}">
        <tr>
            <input type="checkbox" name="foodList" value="${foodItem.foodItemName}">${foodItem.foodItemId}. ${foodItem.foodItemName}&nbsp;
            <br>
        </tr>
    </c:forEach>
    <br>

    SELECT DATE <br>
    <INPUT TYPE="date" NAME="date" SIZE="25">
    </tbody>
    <br>
    <br>
    <input type="Submit" value="Submit">

</table>
</form>
</body>
</html>

