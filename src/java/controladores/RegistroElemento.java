

package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Elemento;


@WebServlet(name = "RegistroElemento", urlPatterns = {"/RegistroElemento"})
public class RegistroElemento extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        HttpSession session = request.getSession(); // Para que se crea el objeto session acá ??
        List<Elemento> products = new ArrayList<Elemento>();
        if (null != session.getAttribute("Elemento")) {
            products = (ArrayList<Elemento>) session.getAttribute("Elemento");
        }

        request.setAttribute("products", products);
        RequestDispatcher view = request.getRequestDispatcher("formularioElemento.jsp");
        view.forward(request, response);   
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        HttpSession session = request.getSession();
        List<Elemento> elementos = new ArrayList<Elemento>();
        if (null != session.getAttribute("Elemento")) {
            elementos = (ArrayList<Elemento>) session.getAttribute("Elemento");
        }
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nombre = request.getParameter("nombre");
        String ubicacion = request.getParameter("ubicacion");
        int valor = Integer.parseInt(request.getParameter("valor"));
        String estado = "Disponible";
        Elemento e = new Elemento(codigo, nombre, ubicacion, valor, estado);
        elementos.add(e);

        session.setAttribute("Elemento", elementos);
        request.setAttribute("elementos", elementos);
        RequestDispatcher view = request.getRequestDispatcher("formularioElemento.jsp");
        view.forward(request, response);
    }
    
    
    }

