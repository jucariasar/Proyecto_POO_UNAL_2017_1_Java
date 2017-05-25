<%-- 
    Document   : datosborrarusuario
    Created on : 21/05/2017, 01:17:40 PM
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css.css" />
    </head>
    <body>
        <form method="POST" action="./BorrarUsuarios">
             <table class="tg">
                   <tr>
                           <th width="150">Id</th>
                           <th width="150">Nombre</th>
                           <th width="150">Apellido</th>
                           <th width="150">Roll</th>
                           <th width="150">Email</th>

                </tr>
                <c:if test="${not empty empleadob}">
                    <tr>
                        <td>${empleadob.getIdent()}</td>
                        <td>${empleadob.getNombre()}</td>
                        <td>${empleadob.getApellido()}</td>
                        <td>${empleadob.getRoll()}</td>
                        <td>${empleadob.getEmail()}</td>
                    </tr>    
                </c:if><br/> 
                
               <input type="submit" id = "borrar" value="Borrar" name = "borrar"> </input>
               <button onclick="volver()">Cancelar</button>            </table>

        </form>




    </body>
</html>
