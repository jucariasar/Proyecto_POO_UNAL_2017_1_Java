<%-- 
    Document   : cincoMasPrest
    Created on : 24/05/2017, 09:32:23 PM
    Author     : pablo.castrillon
--%>

<%@ include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cinco Elementos Mas Prestados</title>
        <link rel="stylesheet" type="text/css" href="css/estilosLogin.css" />
    </head>
    <body>
    
    <form method="GET" action="./CincoMasPrest">
        
    <c:if test="${not empty mensaje}">
        <table class="tg">
            <tr><th width="140">Los Cinco Elementos Mas Prestados Son:</th>
                
            </tr>
            <c:forEach items="${mensaje}" var="elem">
                <tr><td width="140">${elem.getNombre()} N° veces prestado ${elem.getContador()}</td>
                </tr>
            </c:forEach>
        </table>
        <c:if test="${empty mensaje}">
            <p>No Hay Elementos Prestados</p>
        </c:if>    </c:if>
    
    </form> 
    </body>

    <%@ include file="footer.jsp" %>

