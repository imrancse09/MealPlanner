<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Add Meal</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<div id="headings"><h1 align="center"> New Meal Form </h1></div>
<div id="login-form">
    <form action="addMealDesc" METHOD="POST">
        <c:if test="${error == true}">
            <div class="error"> Any of the input may have not given. Please try again!</div>
        </c:if>

            <legend>SELECT MEAL TYPE</legend>


        <select name="select">
            <option value="Breakfast">Breakfast</option>
            <option value="Lunch">Lunch</option>
            <option value="Evening Snacks">EveningSnacks</option>
        </select>
        <br>

        <table>
            <br>

                <legend>SELECT FOOD ITEM</legend>
            <tbody>
            <c:forEach var = "foodItem" items = "${foodItemList}">
                <tr>
                    <input type="checkbox" name="foodList" value="${foodItem.foodItemName}">${foodItem.foodItemId}. ${foodItem.foodItemName}&nbsp;
                    <br>
                </tr>

            </c:forEach>
            </tbody>
        </table>
        <br>

                <legend>SELECT DATE</legend>

            <INPUT TYPE="date" NAME="date" SIZE="25">
            <br>
            <br>
            <input type="Submit" value="Submit">
    </form>
</div>
</body>
</html>

