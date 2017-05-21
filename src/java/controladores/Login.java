/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.AdministradorAlmacen;
import modelos.Almacen;
import modelos.Elemento;
import modelos.Empleado;


@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(); // Para que se crea el objeto session acá ??
        List<Elemento> elementos = new ArrayList<>();
        List<Empleado> empleados = new ArrayList<>();
        if (null != session.getAttribute("Elemento")) {
            elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
            empleados = (ArrayList<Empleado>) session.getAttribute("Empleado");
        }
        
        
        RequestDispatcher view = request.getRequestDispatcher("mainlogin.jsp");
        view.forward(request, response); 
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession();
            List<Elemento> elementos = new ArrayList<>();
            List<Empleado> empleados = new ArrayList<>();
            int contador = Almacen.controlFicticios;
            
            if(null == session.getAttribute("ctrlFictios")){
                session.setAttribute("ctrlFictios", contador);
                Almacen.crearDatosFicticios();
            }
            
            if (null != session.getAttribute("Elemento")) {
                elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
                empleados = (ArrayList<Empleado>) session.getAttribute("Empleado");
            }
            
            String email = request.getParameter("email");
            int id = Integer.parseInt(request.getParameter("id"));
            elementos = Almacen.elementos;
            empleados = Almacen.empleados;
            session.setAttribute("Elemento", elementos);
            session.setAttribute("Empleado", empleados);
            
            
            Empleado e1 = Empleado.buscarEmpleadoPorId(Almacen.empleados, id);
            
            String mensaje;
            
            if (e1 == null || !e1.getEmail().equals(email))
            {
                mensaje = "Usuario y/o Documento Invalido";
                
                request.setAttribute("mensaje", mensaje);
                
                RequestDispatcher view = request.getRequestDispatcher("mainlogin.jsp");
                view.forward(request, response); 
                
            }
            else if(e1 instanceof AdministradorAlmacen && e1.getEmail().equals(email))
            {
                        RequestDispatcher view = request.getRequestDispatcher("menuAdministrador.jsp");
                        view.forward(request, response); 
            }        
    }

}
