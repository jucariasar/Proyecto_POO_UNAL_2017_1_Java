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
/**
 *
 * @author pablo.castrillon
 */
@WebServlet(name = "MasPrestado", urlPatterns = {"/MasPrestado"})
public class MasPrestado extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Elemento> elementos = new ArrayList<>();
        if (null != session.getAttribute("Elemento")) {
            elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
        }
        String mensaje = Elemento.masPrestado((ArrayList<Elemento>) elementos);
        
        
            req.setAttribute("msj", mensaje);
            RequestDispatcher view = req.getRequestDispatcher("masPrestado.jsp");
            view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            RequestDispatcher view = req.getRequestDispatcher("menuAdministrador.jsp");
            view.forward(req, resp);

        
            
        }
        
        
        
    }

    
