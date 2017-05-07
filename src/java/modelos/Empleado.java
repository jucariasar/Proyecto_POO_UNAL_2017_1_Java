/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.*;

/**
 *
 * @author Pablo
 */
public class Empleado {
    
    public static List<Empleado> empleados = new ArrayList<Empleado>() {
        //{
        //    add(new Empleado(1,"hjk","dfghjkm","rtyui","sdfgy"));
            
        //}
    };

    private int ident = 0;
    private String nombre = "";
    private String Apellido = "";
    private int numElementPres = 0;
    private String roll = "";
    private String email = "";

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNumElementPres() {
        return numElementPres;
    }

    public void setNumElementPres(int numElementPres) {
        this.numElementPres = numElementPres;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empleado{" + "ident=" + ident + ", nombre=" + nombre + ", Apellido=" + Apellido + ", numElementPres=" + numElementPres + ", roll=" + roll + ", email=" + email + '}';
    }

    public Empleado(int ident,String nombre,String Apellido,String roll,String email) {
        setIdent(ident);
        setNombre(nombre);
        setApellido(Apellido);
        setRoll(roll);
        setEmail(email);       
        
    }

    
    

}
