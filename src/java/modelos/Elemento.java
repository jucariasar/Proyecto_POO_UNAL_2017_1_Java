/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import modelos.Administrativo;
//import modelos.Operario;
//import modelos.IngenieroTecnico;
/**
 *
 * @author camilo
 */
public class Elemento {

    private int codigo;
    private String nombre;
    private String ubicacion;
    private Date fechaPrestamo;
    private int contador = 0;
    private double valor;
    private String estadoActual;

    public Elemento(int codigo, String nombre, String ubicacion, int valor, String estadoActual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fechaPrestamo = null;
        this.valor = valor;
        this.contador = this.contador + 1;
        this.estadoActual = estadoActual;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public int getContador() {
        return contador;
    }

    public double getValor() {
        return valor;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setCondigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEstadoActual(String estadoActual) {
        if (!estadoActual.equals("Disponible")
                || !estadoActual.equals("Prestado")
                || !estadoActual.equals("Reservado")) {
            // enviar mensaje de error. 
        } else {
            this.estadoActual = estadoActual;
        }

    }

    @Override
    public String toString() {
        return "Elemento{" + "codigo=" + codigo + ", nombre=" + nombre
                + ", ubicacion=" + ubicacion + ", fechaPrestamo=" + fechaPrestamo
                + ", contador=" + contador + ", valor=" + valor + ", estadoActual=" + estadoActual + '}';
    }

    // Devuelve String de atributos seleccionados, parecido a ToString
    public String str_Inventario() {
        return ("Nombre de elemento es: " + nombre
                + ", Codigo Del Elemento: " + codigo + ", La Ubicación del Elemento es: " + ubicacion
                + ", El estado actual del elemento es: " + estadoActual);
    }

    // Devuelve String con la url completa para ver los detalles de un elemento con un id especifico.
    public String obtenerDireccion() {
        String dir = "http://localhost:8084/almacen/Busqueda?codigo=" + this.getCodigo();

        return dir;
    }

    public static Elemento buscar_por_id(List<Elemento> elements, int id_a_buscar) {
        for (Elemento e : elements) {
            if (e.getCodigo() == id_a_buscar) {
                return e;
            }
        }
        return null;
    }

    // Verifica la lista de elementos que estan reservados.
    public static boolean verificarReserva(ArrayList<Elemento> ListaElementos) {

        for (Elemento element : ListaElementos) {
            if (element.getEstadoActual().equals("Reservado")) {
                return true;
            }
        }
        return false;
    }

    // Cancela los Elementos Reservados. 
    public static void cancelarReserva(ArrayList<Elemento> ListaElementos) {

        for (Elemento element : ListaElementos) {
            if (element.getEstadoActual().equals("Reservado")) {
                element.setEstadoActual("Disponible");
            }
        }

    }

    // Verificar que elementos estan prestados. 
    public static boolean verificarPrestamo(ArrayList<Elemento> ListaElementos) {
        for (Elemento element : ListaElementos) {
            if (element.getEstadoActual().equals("Prestado")) {
                return true;
            }
        }
        return false;
    }

    // Metodo que verifica que elementos estan disponibles
    public static boolean verificarDisponibles(ArrayList<Elemento> ListaElementos) {
        for (Elemento element : ListaElementos) {
            if (element.getEstadoActual().equals("Disponible")) {
            }
            return true;
        }
        return false;
    }

    // Buscar por identificacion.
    public static Elemento buscarElementoPorId(ArrayList<Elemento> ListaElementos, int cod) {
        for (Elemento element : ListaElementos) {
            if (element.getCodigo() == cod) {
                return element;
            }
        }
        return null;
    }

    // verifica que elementos estan disponibles en la lista 
    public static String elemetosDisponibles(ArrayList<Elemento> ListaElementos) {

        for (Elemento element : ListaElementos) {
            if (element.getEstadoActual().equals("Disponible")) {
                return element.str_Inventario();
            }
        }
        return null;
    }

    // retorna el lsitado de los elementos 
    public static String inventarioElementos(ArrayList<Elemento> ListaElementos) {
        for (Elemento element : ListaElementos) {
            return element.str_Inventario();
        }
        return null;
    }
    // 

    public static String elementosPrestados(ArrayList<Elemento> ListaElementos) {
        int c = 0;
        for (Elemento element : ListaElementos) {
            if (element.getEstadoActual().equals("Prestado")) {
                c++;
                return element.str_Inventario();
            }
        }
        if (c == 0) {
            return "No hay elementos prestados ";
        }
        return "";
    }

// Gaurdad datos en un archivo de texto plano.
    public static void guardarDatosEntxt(int m) {

        try {
            File Archivo = new File("elementos.txt");
            FileWriter escribirTxt = new FileWriter(Archivo, true);

            for (int i = 0; i < m; i++) {
            }

            //escribirTxt.write(str);
            escribirTxt.close();
        } catch (Exception e) {
            System.out.println("Error al crear TXT");
        }

    }

    // Metodo para prestar algun elemento que este disponible
    public static void prestarElementos(ArrayList<Elemento> ListaElementos, Empleado emp, int cod) {

        String MENSAJE = "";
        Date Fecha = new Date();

        if (verificarDisponibles(ListaElementos)) {
            if (((emp instanceof Administrativo) && (emp.getNumRestriccion() < Administrativo.MAX_AD))
                    || ((emp instanceof Operario) && (emp.getNumRestriccion() < Operario.MAX_OP))
                    || ((emp instanceof IngenieroTecnico) && (emp.getNumRestriccion() < IngenieroTecnico.MAX_IT))) {
                // Codigo del elemento a prestar 
                Elemento element;
                element = Elemento.buscarElementoPorId(ListaElementos, cod);
                if ((element != null) && (element.getEstadoActual().equals("Disponible"))) {
                    emp.getElementos().add(element);
                    emp.setContador(emp.getContador() + 1);
                    emp.setNumElementPres(emp.getNumElementPres() + 1);
                    emp.setNumRestriccion(emp.getNumRestriccion() + 1);
                    element.setContador(element.getContador() + 1);
                    element.setEstadoActual("Prestado");

                    element.setFechaPrestamo(Fecha);
                    HistorialPrestamo.agregarAHistorial(emp, element);
                    // Desea prestar mas elementos

                } else if ((element != null) && (element.getEstadoActual().equals("Prestado"))) {
                    MENSAJE = "Prestado";
                } else if ((element != null) && (element.getEstadoActual().equals("Reservado"))) {
                    MENSAJE = "Prestado";
                } else {
                    MENSAJE = "No Regisitrado";
                }

            } else {
                MENSAJE = "El Usuario no esta autorizado para prestar mas elementos";
            }
        } else {
            MENSAJE = "Elementos no disponible en le inventario";
        }

    }
    public static void recibirElementos(Empleado emp, int cod){
      String MENSAJE = "";
      Elemento.elementosPrestados(emp.getElementos());
      if (emp.getNumElementPres()< 0 ){
         Elemento element = Elemento.buscarElementoPorId(emp.getElementos(), cod);
         if (element != null){
             element.setEstadoActual("Disponible");
             emp.setNumElementPres(emp.getNumElementPres() - 1);
             emp.setNumRestriccion(emp.getNumRestriccion() - 1);
             HistorialPrestamo.agregarFechaEntrega(emp, element);
             element.setFechaPrestamo(null);
             emp.getElementos().remove(element);
             
         }else{
             MENSAJE = "Codigo No Encontrado";
         }
      }else{
          MENSAJE = "No tiene elementos prestados";
      } 
  
    }
        
     public static void asentarReserva (ArrayList <Elemento> listElementosEmp,Empleado emp){
         Date Fecha = new Date();
         for (Elemento element: listElementosEmp ){
             if (element.getEstadoActual().equals("Reservado")){
                 element.setEstadoActual("Prestado");
                 element.setContador(element.getContador()+1);
                 element.setFechaPrestamo(Fecha);
                 emp.setNumElementPres(emp.getNumElementPres()+1);
                 emp.setContador(emp.getContador() + 1 );
                 HistorialPrestamo.agregarAHistorial(emp, element);
             }
         
         }
         
     }
}
