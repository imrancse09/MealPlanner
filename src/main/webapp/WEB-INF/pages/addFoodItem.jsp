<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Food Item</title>
    <style> .error {
        color: red
    } </style>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<div id="headings"><h1 align="center"> New Food Item Form </h1></div>
<div id="login-form">
    <form:form method="POST" commandName="foodItem" action="submit">
        <br>
        ADD NEW FOOD:
        <br>
        <table border="1">
            <tr>
                <td>Item name:</td>
                <td><form:input path="${foodItem.foodItemName}"></form:input></td>
                <td><form:errors path="foodItemName" cssstyle="color: red" /></td>
                <%--<span id="foodItem.foodItemName.empty" class="error">food item name is required!</span>--%>
            </tr>
            <tr>
                <td>Creation Date:</td>
                <td><form:input path="${foodItem.foodItemCreationDate}" ></form:input></td>
                <td><form:errors path="foodItemCreationDate" cssstyle="color: red" /></td>
                <%--<td><span id="foodItem.foodItemCreationDate.empty" class="error">food item name is required!</span></td>--%>
            </tr>
        </table>
    <p><input type="submit" value="ADD ITEM" name="button"></p>
    </form:form>

</div>
</body>
</html>



<%--<h1>New Shop page</h1>--%>
<%--<form:form method="POST" commandname="shop" action="${pageContext.request.contextPath}/shop/create.html">--%>
    <%--<table>--%>
        <%--<tbody>--%>
        <%--<tr>--%>
            <%--<td>Shop name:</td>--%>
            <%--<td><form:input path="name"></form:input></td>--%>
            <%--<td><form:errors path="name" cssstyle="color: red;"></form:errors></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>Employees number:</td>--%>
            <%--<td><form:input path="emplNumber"></form:input></td>--%>
            <%--<td><form:errors path="emplNumber" cssstyle="color: red;"></form:errors></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><input value="Create" type="submit"></td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
        <%--</tr>--%>
        <%--</tbody>--%>
    <%--</table>--%>
<%--</form:form>--%>