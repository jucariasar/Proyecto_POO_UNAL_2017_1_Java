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

/**
 *
 * @author camilo
 */
@WebServlet(name = "Busqueda", urlPatterns = {"/Busqueda"})
public class Busqueda extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Elemento> elementos = new ArrayList<Elemento>();
        if (null != session.getAttribute("Elemento")) {
            elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
            Elemento e
                    = Elemento.buscar_por_id(elementos, Integer.parseInt(request.getParameter("codigo")));

            request.setAttribute("elemento", e);

        }

        //request.setAttribute("elementos", elementos);
        RequestDispatcher view = request.getRequestDispatcher("busqueda.jsp");
        view.forward(request, response);
    }

}
