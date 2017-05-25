<%-- 
    Document   : mostrarelementos
    Created on : 01-may-2017, 0:04:50
    Author     : camilo
--%>

<%@ include file="header.jsp" %>

    <h1>Mostrar Elementos<h1>
    <form method="POST" action="./MostrarElementos">
         <input type="submit" value="Mostrar Elementos" />
    </form>
    <c:if test="${not empty elementos}">
        <table class="tg">
            <tr><th width="80">Codigo</th>
                <th width="120">Nombre</th>
                
            </tr>
            <c:forEach items="${elementos}" var="element">
                <tr><td>${element.getCodigo()}</td>
                    <td>${element.getNombre()}</td>
  
                    
                </tr>
            </c:forEach>
        </table>
    </c:if>
    

    <%@ include file="footer.jsp" %>
