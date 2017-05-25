<%-- 
    Document   : mostrarelementos
    Created on : 01-may-2017, 0:04:50
    Author     : camilo
--%>

<%@ include file="header.jsp" %>

    <h1>Mostrar Empleados<h1>
    <form method="POST" action="./MostrarEmpleados">
         <input type="submit" value="Mostrar Empleados" />
    </form>
    <c:if test="${not empty empleados}">
        <table class="tg">
            <tr><th width="80">Numero Documento</th>
                <th width="120">Nombre Completo</th>
               
                <th width="120">Email</th>
                <th width="120">Roll</th>
                
            </tr>
            <c:forEach items="${empleados}" var="emp">
                <tr><td>${emp.getIdent()}</td>
                    <td>${emp.getNombre()} ${emp.getApellido()}</td>
                    <td>${emp.getEmail()}</td>
                    <td>${emp.getRoll()}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    

    <%@ include file="footer.jsp" %>
