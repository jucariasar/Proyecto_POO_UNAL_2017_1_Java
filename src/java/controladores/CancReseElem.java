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
 * @author Usuario
 */
@WebServlet(name = "CancReseElem", urlPatterns = {"/CancReseElem"})
public class CancReseElem extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session = request.getSession();
                List<Elemento> elementos = new ArrayList<>();
                if (null != session.getAttribute("Elemento")) {
                    elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
                }
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Elemento> elementos = new ArrayList<>();

        if (null != session.getAttribute("Elemento")) {
            elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Elemento> elementos = new ArrayList<>();

        if (null != session.getAttribute("Elemento")) {
            elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
        }

        int id = Integer.parseInt(req.getParameter("id"));
             session.setAttribute("Elemento", elementos);

       
        String mensaje =  Elemento.cancelarReserva((ArrayList<Elemento>) elementos, id);
        
        if (mensaje == null) {
            req.setAttribute("mensaje", mensaje);
            RequestDispatcher view = req.getRequestDispatcher("CancReseElem.jsp");
            view.forward(req, resp);

        } else {
            req.setAttribute("mensaje", mensaje);
            RequestDispatcher view = req.getRequestDispatcher("CancReseElem.jsp");
            view.forward(req, resp);
           
            
 
        }
        
        
        
    }

    }

    
   

