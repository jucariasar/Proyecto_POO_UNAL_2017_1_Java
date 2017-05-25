<%-- 
    Document   : CancReseElem
    Created on : 21-may-2017, 17:13:31
    Author     : Usuario
--%>

<%@ include file="header.jsp" %>

<h1>Mostrar Elementos Reservados<h1>
        <form method="GET" action="./CancReseElem">
             <input type="submit" value="Mostrar Elementos Reservados" />
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
        </form>
        <form method="POST" action="./CancReseElem">
            <label for="">Ingrese el codigo del elemento</label><br>

            <input type="text" name="codigo" placeholder="Codigo del Elemento:" required><br/>
            <input type="submit" name="id" value="Cancelar Reserva">
            <c:if test="${not empty mensaje}">
                <p>${mensaje}</p>
            </c:if><br/>        </form>



        <%@ include file="footer.jsp" %>
