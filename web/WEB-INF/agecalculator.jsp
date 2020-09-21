<%-- 
    Document   : agecalculator.jsp
    Created on : Sep 20, 2020, 7:02:37 PM
    Author     : 775653
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${output}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
