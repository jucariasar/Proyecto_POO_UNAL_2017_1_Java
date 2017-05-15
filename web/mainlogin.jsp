<%-- 
    Document   : mainlogin
    Created on : 14-may-2017, 14:37:51
    Author     : camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link rel="stylesheet" type="text/css" href="css/estilosLogin.css" />
    </head>
    <body>
        <form method="POST" action="./Login">
            <label for="">Iniciar Sesión</label><br>
            
            <input type="text" name="email" placeholder="E-mail" required><br/>
            <input type="password" name="id" placeholder="N° de Documento" required><br/>
            
            <input type="submit" value="Entrar">
             <c:if test="${not empty mensaje}">
              <p>${mensaje}</p>
            </c:if><br/>
        </form>

       


    </body>
</html>
