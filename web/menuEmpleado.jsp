<%-- 
    Document   : menuEmpleado
    Created on : 21-may-2017, 11:18:31
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <style>
        table {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: auto;
        }

        td, th {
            border: 1px solid #f07800;
            text-align: left;
            padding: 8px 10px;
        }
        tr:nth-child(even) {
            background-color: #f07800;
        }
    </style>
    <body>
    <center>
        <table style="width:auto">
            <tr>
                <th>Opciones:</th>
            </tr>
            <tr>
                <td><a href="">Consultar Elementos Disponibles</a></td>
            </tr>
            <tr>
                <td><a href="">Consultar Elementos Prestados</a></td>
            </tr>
            <tr>
                <td><a href="">Cancelar Reserva de Elementos</a></td>
            </tr>
        </table>
        </center>
    </body>
</html>
