<%-- 
    Document   : busqueda
    Created on : 01-may-2017, 17:26:38
    Author     : camilo
--%>

<%@ include file="header.jsp" %>

    <h1>Busqueda de Elementos</h1>
     <%--<form method="GET" action="./Busqueda">--%>
        <var type="number" name="codigo" /><br /><br />
        <%--<input type="submit" value="Buscar" />--%>
     <%--</form>--%>
    
    <c:if test="${!empty elemento}">Elemento Encontrado con Éxito
        <table class="tg">
            <tr><th width="80">Codigo</th>
                <th width="120">Nombre</th>
                <th width="120">Ubicación</th>
                <th width="120">Valor</th>
                <th width="120">Estado Actual</th>
            </tr>
                <tr><td>${elemento.getCodigo()}</td>
                    <td>${elemento.getNombre()}</td>
                    <td>${elemento.getUbicacion()}</td>
                    <td>${elemento.getValor()}</td>
                    <td>${elemento.getEstadoActual()}</td>
                </tr>
            
        </table>
    </c:if>
    <c:if test="${empty elemento}">Elemento NO encontrado</c:if>

    <%@ include file="footer.jsp" %>