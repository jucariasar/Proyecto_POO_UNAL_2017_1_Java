<%-- 
    Document   : borrarelemento
    Created on : 21/05/2017, 12:25:11 PM
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar Elemento</title>
        <link rel="stylesheet" type="text/css" href="css/estilosLogin.css" />
    </head>
    <body>
        <form method="POST" action="./Login">
            <h1> Borrar Elemento </h1>
            <label for="">Digite Codigo Del Elemento </label><br>         
            <input type="text" name="CE" placeholder="Codigo Elemento" required><br/>
            <input type="submit" value="Entrar">
           
            <c:if test="${not empty mensaje}">
                <p>${mensaje}</p>
            </c:if><br/>
        </form>
    </body>
</html>

