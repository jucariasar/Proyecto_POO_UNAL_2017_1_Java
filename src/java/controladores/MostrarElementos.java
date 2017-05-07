
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
@WebServlet(name = "MostrarElementos", urlPatterns = {"/MostrarElementos"})
public class MostrarElementos extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("mostrarelementos.jsp");
        view.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Elemento> elementos = new ArrayList<Elemento>();
        if (null != session.getAttribute("Elemento")) {
            elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
        }
       
       
        request.setAttribute("elementos", elementos);
        RequestDispatcher view = request.getRequestDispatcher("mostrarelementos.jsp");
        view.forward(request, response);
    }



}
