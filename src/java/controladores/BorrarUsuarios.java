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

/**
 *
 * @author Pablo
 */
@WebServlet(name = "BorrarUsuarios", urlPatterns = {"/BorrarUsuarios"})
public class BorrarUsuarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Empleado> empleados = new ArrayList<>();
        if (null != session.getAttribute("Empleado")) {
            empleados = (ArrayList<Empleado>) session.getAttribute("Empleado");
        }
        RequestDispatcher view = req.getRequestDispatcher("borrarusuario.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        List<Empleado> empleados = new ArrayList<>();

        if (null != session.getAttribute("Empleado")) {
            empleados = (ArrayList<Empleado>) session.getAttribute("Empleado");
        }

        int id = Integer.parseInt(req.getParameter("id"));
             session.setAttribute("Empleado", empleados);

        Empleado e1 = Empleado.buscarEmpleadoPorId(empleados, id);
        String mensaje;
        
        if (e1 == null) {
            mensaje = "Usuario y/o Documento Invalido";
            req.setAttribute("mensaje", mensaje);
            RequestDispatcher view = req.getRequestDispatcher("borrarusuario.jsp");
            view.forward(req, resp);

        } else {
            req.setAttribute("empleadob", e1);
            RequestDispatcher view = req.getRequestDispatcher("datosborrarusuario.jsp");
            view.forward(req, resp);
           
            
 
        }
        
        
        
    }

}
