package modelos;

import java.util.*;

public class Empleado {

    public static List<Empleado> empleados = new ArrayList<Empleado>();

    private int ident = 0;
    private String nombre = "";
    private String apellido = "";
    private int numElementPres = 0;
    private String roll = "";
    private String email = "";

    public Empleado(int ident, String nombre, String apellido, String roll, String email) {
        setIdent(ident);
        setNombre(nombre);
        setApellido(apellido);
        setRoll(roll);
        setEmail(email);

    }

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
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return "Empleado{" + "ident=" + ident + ", nombre=" + nombre + ", Apellido=" + apellido + ", numElementPres=" + numElementPres + ", roll=" + roll + ", email=" + email + '}';
    }

}
