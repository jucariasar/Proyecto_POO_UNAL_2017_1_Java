<%-- 
    Document   : borrarusuario
    Created on : 21/05/2017, 11:29:47 AM
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar Usuario</title>
        <link rel="stylesheet" type="text/css" href="css/estilosLogin.css" />
    </head>
    <body>
        <form method="POST" action="./BorrarUsuarios">
            <h1> Borrar Usuario </h1>
            
            <label for="">Digite Cedula </label><br>         
            <input type="text" name="id" placeholder="N° de Documento" required><br/>
            <input type="submit" value="Entrar">
            
            <c:if test="${not empty mensaje}">
              <p>${mensaje}</p>
            </c:if><br/> 
            
           
        </form>
            
    </body>
</html>
