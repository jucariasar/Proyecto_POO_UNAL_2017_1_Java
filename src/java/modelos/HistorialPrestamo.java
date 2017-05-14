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
    static List<HistorialPrestamo> historial = new ArrayList<HistorialPrestamo>();
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

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public String getNomElemento() {
        return nomElemento;
    }

    public void setNomElemento(String nomElemento) {
        this.nomElemento = nomElemento;
    }

    public int getCodElemento() {
        return codElemento;
    }

    public void setCodElemento(int codElemento) {
        this.codElemento = codElemento;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        
        this.fechaDevolucion = fechaDevolucion;

    }

    @Override
    public String toString() {
        return (" Nombre del Empleado: " + getNomEmpleado() + "N° Identificacion: " + getIdEmpleado() + "Nombre del Elemento: " + getNomElemento() + " Codigo Elemento: " + getCodElemento() + " Fecha Prestamo: " + getFechaPrestamo() + " Fecha Devolucion: " + getFechaDevolucion() );
        
    }
    
    
    public static void agregarAHistorial(Empleado emp, Elemento element){
        HistorialPrestamo h=new HistorialPrestamo(emp.getIdent(),emp.getNombre(),element.getNombre(),element.getCodigo(),null,element.getFechaPrestamo());
        historial.add(h);
    }
    
    public static void agregarFechaEntrega(Empleado emp, Elemento elemento){
        for (HistorialPrestamo h: historial){
            if (elemento.getFechaPrestamo().equals(h.getFechaPrestamo()) && emp.getIdent()==h.getIdEmpleado()){
                h.setFechaDevolucion(new Date());
            }
        }
    }
    
    public static void mostrarHistorial(){
        for (HistorialPrestamo h: historial){
            System.out.println(h);
        }
    }
}
