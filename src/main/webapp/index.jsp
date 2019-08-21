<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Car Database</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lexend+Giga&display=swap" rel="stylesheet">

    <style>

        .container {

        display: grid;
        grid-template-areas: "text text"
                             "break break"
                             "left right";
        grid-template-rows: 1fr 1fr 1fr;
        grid-template-columns: 1fr 1fr;
        justify-items: center;
        }

        .item1 {

            grid-area: text;
        }

        .item2 {

            grid-area: left;
        }

        .item3 {

            grid-area: right;
        }

        .item4 {

            grid-area: break;
        }

    </style>
</head>

<body style="background-color: lightgreen">

    <br>
    <br>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Car Database</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lexend+Giga&display=swap" rel="stylesheet">

        <style>

            .container {

                display: grid;
                grid-template-areas: "text text"
                "break break"
                "left right";
                grid-template-rows: 1fr 1fr 1fr;
                grid-template-columns: 1fr 1fr;
                justify-items: center;
            }

            .item1 {

                grid-area: text;
            }

            .item2 {

                grid-area: left;
            }

            .item3 {

                grid-area: right;
            }

            .item4 {

                grid-area: break;
            }

        </style>
    </head>

    <body style="background-color: lightgreen">

    <br>
    <br>
    <div class="container">
        <div class="item1">
            <h3 style="font-family: 'Lexend Giga', sans-serif">Create or read cars from multiple databases</h3>
        </div>
        <br>
        <div class="item2">
            <a class="btn btn-primary" href="create" role="button">Create a car</a>
        </div>
        <div class="item3">
            <a class="btn btn-primary" href="read" role="button">Read cars</a>
        </div>
    </div>
    </body>
    </html>
