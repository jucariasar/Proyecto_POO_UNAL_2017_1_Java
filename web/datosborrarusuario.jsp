<%-- 
    Document   : datosborrarusuario
    Created on : 21/05/2017, 01:17:40 PM
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css.css" />
    </head>
    <body>
        <form method="POST" action="./Login">
             <table class="tg">
                   <tr>
                           <th width="150">Id</th>
                           <th width="150">Nombre</th>
                           <th width="150">Apellido</th>
                           <th width="150">Roll</th>
                           <th width="150">Email</th>

                    </tr>
              <c:if test="${not empty empleadob}">
              <p>${empleadob}</p>
            </c:if><br/> 
                <td style="left:inherit"> <input type="submit" value="Borrar"> </input></td> 
                <td style="right:inherit"> <input type="submit" value="Cancelar"></input></td> 


        </form>




    </body>
</html>
