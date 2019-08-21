<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cars list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lexend+Giga&display=swap" rel="stylesheet">
</head>
<body style="background-color: lightgreen">

<div class="container">

    <br>
    <h2 style="font-family: 'Lexend Giga', sans-serif">Cars list</h2>
    <br>

    <table class="table">
        <tr>
            <th>Id</th>
            <th>Branch</th>
            <th>Model</th>
        </tr>
        <c:forEach items="${requestScope.cars}" var="car" varStatus="highlighter">
                <tr>
            <c:if test="${highlighter.index mod 2 eq 0}">
                <tr style="background-color: limegreen">
            </c:if>
                <td>
                    <c:out value="${car.id}" />
                </td>
                <td>
                    <c:out value="${car.branch}" />
                </td>
                <td>
                    <c:out value="${car.model}" />
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>