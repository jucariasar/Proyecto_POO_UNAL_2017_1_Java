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
import modelos.Elemento;
import modelos.Empleado;


@WebServlet(name = "MostrarEmpleados", urlPatterns = {"/MostrarEmpleados"})
public class MostrarEmpleados extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("mostrarempleados.jsp");
        view.forward(request, response);
      
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Empleado> empleados = new ArrayList<>();
        if (null != session.getAttribute("Elemento")) {
            empleados = (ArrayList<Empleado>) session.getAttribute("Empleado");
        }
       
       
        request.setAttribute("empleados", empleados);
        RequestDispatcher view = request.getRequestDispatcher("mostrarempleados.jsp");
        view.forward(request, response);
       
    }


}
