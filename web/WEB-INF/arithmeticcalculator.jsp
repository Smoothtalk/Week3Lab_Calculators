<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 21, 2020, 2:51:58 PM
    Author     : 775653
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator!</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text"name="second" value="${second}"><br>
            <input type="submit" name="op" value="+">
            <input type="submit" name="op" value="-">
            <input type="submit" name="op" value="*">
            <input type="submit" name="op" value="%">
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
