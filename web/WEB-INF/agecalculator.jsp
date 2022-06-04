<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
            <label>Enter your age:</label>
            <input type="text" name="ageInput" value="${ageInput}">
            <br> 
            <input type="submit" value="Age next birthday">
        </form>
             
        <p>${message}
        <br>
        <a href="/Calculators/arithmetic">Arithmetic Calculator</a>
        </p>
            
            
    </body>
</html>
