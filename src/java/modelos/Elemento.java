/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;
import java.util.List;

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
    private int valor;
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
        this.estadoActual = estadoActual;
    }
    
    public String obtenerDireccion()
    {
        String dir = "http://localhost:8084/almacen/Busqueda?codigo=" + this.getCodigo();
        
        return dir;
    }
    
    public static Elemento buscar_por_id(List<Elemento> elements, int id_a_buscar){
        for(Elemento e: elements){
            if(e.getCodigo() == id_a_buscar)
                return e;
        }
        return null;
    }
    
}
