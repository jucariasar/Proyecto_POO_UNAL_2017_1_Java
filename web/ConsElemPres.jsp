<%-- 
    Document   : ConsElemPres
    Created on : 21-may-2017, 17:14:07
    Author     : Usuario
--%>

<%@ include file="header.jsp" %>

    <h1>Mostrar Elementos<h1>
    <form method="POST" action="./ConsElemPres">
         <input type="submit" value="Elementos Prestados" />
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
