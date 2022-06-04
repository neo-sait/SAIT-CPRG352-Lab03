<%-- 
    Document   : arithmeticcalculator
    Created on : 2-Jun-2022, 10:42:09 PM
    Author     : neo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <h1>Arithmetic Calculator</h1>
    
    <body>
        <form method="POST" action="arithmetic">
        <label>First:</label>
        <input type="text" name="firstIn" value="${firstIn}">
        <br>
        <label>Second:</label>
        <input type="text" name="secondIn" value="${secondIn}">
        <br>
        <input type="submit" value="+" name="operation">
        <input type="submit" value="-" name="operation">
        <input type="submit" value="*" name="operation"> 
        <input type="submit" value="%" name="operation"> 
        
    </form>
        <p>Result: ${answer}
        <br>
        <a href="/Calculators/age">Age Calculator</a>
        </p>
    </body>
</html>
