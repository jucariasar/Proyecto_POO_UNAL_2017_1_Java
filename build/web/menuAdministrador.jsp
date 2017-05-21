<%-- 
    Document   : menu_administrador
    Created on : 14-may-2017, 15:46:01
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Menu Administrador</title>
		<style type="text/css">
			
			* {
				margin:0.4px;
				padding:1px;
                                
			}
			
			#header {
				margin:auto;
				width:500px;
				font-family:Arial, Helvetica, sans-serif;
			}
			
			ul, ol {
				list-style:none;
			}
			
			.nav > li {
                                
				float:left;
                                background-color:#f07800;
				color: #ffffff;
				text-decoration:none;
				padding:8px 10px;
				display:block;
			}
			
			.nav li a {
				background-color:#f07800;
				color: #ffffff;
				text-decoration:none;
				padding:8px 10px;
				display:block;
			}
			
			.nav li a:hover {
				background-color:#ffffff;
                                color: #f07800;
			}
			
			.nav li ul {
                                
				display:none;
				position:fixed;
				min-width:140px;
			}
			
			.nav li:hover > ul {
				display:list-item;
			}
			
			.nav li ul li {
				position:relative;
			}
			
			.nav li ul li ul {
                            
				right:-120px;
				top:0px;
			}
			
		</style>
	</head>
	<body>
            <body>
                
                <form name="link"><select name="menu">
                            <option value="">Administrador Almacen</option>
                            <option value="MenuEmpleado">Empleado</option>
                        </select>  <input onclick="location=document.link.menu.options[document.link.menu.selectedIndex].value;" type="button" value="Ir" /><span style="line-height: 2em;"> </span></form>            
                
            </body>
            <div id="header">
                <ul class="nav">
                    <li>Consultas
                        <ul>
                            <li><a href="MostrarElementos">Inventario de Elementos</a></li>
                            <li><a href="">Base de Datos de Empleados</a></li>
                            <li><a href="">Elemento mas Prestado</a></li>
                            <li><a href="">cinco Elementos mas Prestados</a></li>
                            <li><a href="">Empleado con mas elementos Prestados</a></li>
                            <li><a href="">Roll que mas Presta</a></li>
                            <li><a href="">Mostrar Historial</a></li>
			</ul>
                    </li>
                    <li>Registros
			<ul>
                            <li><a href="">Registrar Empleado</a></li>
                            <li><a href="RegistroElemento">Registrar Elemento</a></li>
                            </li>
			</ul>
                    </li>
                    <li>Borrados 
			<ul>
                            <li><a href="BorrarUsuarios">Borrar Empleado</a></li>
                            <li><a href="">Borrar Elemento</a></li>
                        </ul>
                    </li>
                    <li>Prestamos 
			<ul>
                            <li><a href="">Prestar Elementos</a></li>
                            <li><a href="">Recibir Elementos</a></li>
			</ul>
                    </li>
        
            </div>
	</body>
</html>