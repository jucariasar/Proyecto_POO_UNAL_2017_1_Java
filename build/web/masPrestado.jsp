<%-- 
    Document   : masPrestado
    Created on : 24/05/2017, 07:59:13 PM
    Author     : pablo.castrillon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elemento mas Prestado</title>
        <link rel="stylesheet" type="text/css" href="css/estilosLogin.css" />
    </head>
    <body>
        <form method="GET" action="./MasPrestado">
            <h1>Elemento mas Prestado </h1>
            
            <output type="text" name="masPrestado" ><br/>
            
            
            <c:if test="${not empty msj}">
                <p>${msj}</p>
            </c:if><br/> 
        
           
        </form>
            
    </body>
</html>
