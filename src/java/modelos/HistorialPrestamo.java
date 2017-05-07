/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.*;


/**
 *
 * @author Usuario
 */
public class HistorialPrestamo {
    ArrayList<String> Historial = new ArrayList<String>();
    private int idEmpleado=0;
    private String nomEmpleado="";
    private String nomElemento="";
    private int codElemento=0;
    private Date fechaPrestamo=null;
    private Date fechaDevolucion=null;
    public HistorialPrestamo(int idEmpleado,String nomEmpleado, String nomElemento, int codElemento,Date fechaPrestamo,Date fechaDevolucion){
        this.idEmpleado = idEmpleado;
        this.nomEmpleado=nomEmpleado;
        this.nomElemento=nomElemento;
        this.codElemento=codElemento;
        this.fechaPrestamo=fechaPrestamo;
        this.fechaDevolucion=fechaDevolucion;
    }

    
}
