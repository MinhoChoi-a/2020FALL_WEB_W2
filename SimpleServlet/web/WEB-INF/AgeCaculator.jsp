<%-- 
    Document   : HelloWorldForm
    Created on : 21-Sep-2020, 10:18:03 AM
    Author     : minho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age: </label><input type="text" name="age" value="${calAge}">
            <br>
            <button type="submit">Age next birthday</button>
            <br>
            <p>${message}</p>
            <a href="/simpleservlet/arithmatic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
