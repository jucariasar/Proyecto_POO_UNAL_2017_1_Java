<%-- 
    Document   : consultarDisp
    Created on : 25/05/2017, 01:39:10 PM
    Author     : pablo.castrillon
--%>

<%@ include file="header.jsp" %>

    <h1>Mostrar Elementos<h1>
    <form method="POST" action="./ConsultarDisp">
         <input type="submit" value="Elementos Disponibles" />
    </form>
    <c:if test="${not empty elementos}">
        <table class="tg">
            <tr><th width="80">Codigo</th>
                <th width="120">Nombre</th>
                <th width="120">Estado Actual</th>
                
            </tr>
            <c:forEach items="${elementos}" var="element">
                <tr><td>${element.getCodigo()}</td>
                    <td>${element.getNombre()}</td>
                    <td>${element.getEstadoActual()}</td>
  
                    
                </tr>
            </c:forEach>
        </table>
    </c:if>
    

    <%@ include file="footer.jsp" %>
