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
        <h1> Listado de Elementos </h1> 
        <table class="tg">
               <tr>
                   <th width="150">Id</th>
                   <th width="150">Nombre</th>
                   <th width="150">Apellido</th>
                   <th width="150">Roll</th>
                   <th width="150">Email</th>
               </tr>
               <c:forEach items="${empleados}" var="emp">
                   <tr>
                    <td>${emp.getIdent()}</td>
                    <td>${emp.getNombre()}</td>
                    <td>${emp.getApellido()}</td>
                    <td>${emp.getRoll()}</td>
                    <td>${emp.getEmail()}</td>
                  </tr>
                </c:forEach>
          </table>
        <form method="POST" action="./Login">
            <h2> Borrar Elemento </h2>
            <label for="">Digite Codigo Del Elemento </label><br>         
            <input type="text" name="CE" placeholder="Codigo Elemento" required><br/>
            <input type="submit" value="Borrar">           
        </form>
    </body>
</html>

