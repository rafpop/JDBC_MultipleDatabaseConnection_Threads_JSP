<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Page with form to create a car</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lexend+Giga&display=swap" rel="stylesheet">
</head>

<body style="background-color: lightgreen">
<div class="container">
    <br>
    <h2 style="font-family: 'Lexend Giga', sans-serif">Write a data of new vehicle</h2>
    <br>
    <form method="post" action="create">
        <div class="form-group">
            <input type="text" class="form-control" name="branch"
                   placeholder="Write a vehicle branch" required>
        </div>

        <div class="form-group">
            <input type="text" class="form-control" name="model" placeholder="Write a vehicle model"
                   required>
        </div>
        <br>
        <button class="btn btn-primary" type="submit">Send to database</button>
    </form>
</div>
</body>
</html>