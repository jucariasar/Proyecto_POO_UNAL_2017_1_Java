<%@ include file="header.jsp" %>

    <h1>Registro de Elementos</h1>
    <form method="POST" action="./RegistroElemento">
        Codigo: <input type="number" name="codigo" /><br /><br />
        Nombre: <input type="text" name="nombre" /><br /><br />
        Ubicación: <input type="text" name="ubicacion"><br /><br />
        Valor: <input type="number" name="valor"><br /><br />
         <input type="submit" value="Guardar" />
    </form>
    
    <c:if test="${!empty elementos}">Elemento Guardado Con Éxito</c:if>

    <%@ include file="footer.jsp" %>