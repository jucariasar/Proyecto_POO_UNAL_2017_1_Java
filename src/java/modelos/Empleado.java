package modelos;

import java.util.*;

public class Empleado {

    private int ident = 0;
    private String nombre = "";
    private String apellido = "";
    private int numElementPres = 0;
    private int numRestriccion = 0;
    private String roll = "";
    private int contador = 0;
    private String email = "";
    private List<Elemento> elementos = new ArrayList<>();

    public Empleado(int ident, String nombre, String apellido, int numElementPres, 
            String roll, String email) {
        setIdent(ident);
        setNombre(nombre);
        setApellido(apellido);
        setNumElementPres(numElementPres);
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

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public void getNumRestriccion(int numRestriccion) {
        this.numRestriccion = numRestriccion;
    }

    public void setNumRestriccion(int numRestriccion) {
        this.numRestriccion = numRestriccion;
    }
    
    public void addElemento(Elemento elemento){
    
        elementos.add(elemento);
    }
    
    public void delElemento(Elemento elemento)
    {
        elementos.remove(elemento);
    }
    

    @Override
    public String toString() {
        return String.format("Nombre Completo: %s %s\nN° Identificacion: %d\nE-mail: %s\nRoll: %s",
                getNombre(), getApellido(), getIdent(), getEmail(), getRoll());
    }
    
    
    public static void imprimirEmpleados(List<Empleado> listaEmp)
    {
        for(Empleado emp : listaEmp)
        {
            System.out.println(emp);
        }
        
    }
    
    public static Empleado buscarEmpleadoPorId(List<Empleado> listaEmp, int id)
    {
        for(Empleado emp : listaEmp)
        {
            if(emp.getIdent() == id)
                return emp;
        }
        return null;
    }

    
    public static void masElemPrestados(List<Empleado> listaE)
    {
        int elementPrest = 0;
        Empleado emp = null;
        for(Empleado e : listaE)
        {
            if(e.getNumElementPres() > elementPrest)
            {
                elementPrest = e.getNumElementPres();
                emp=e;
            }
        }
        if(emp != null)
        {
            System.out.println("El empleado con mas elementos prestados es: ");
            System.out.printf("\n %s %s >> N° elementos prestado: %s\n", emp.getNombre(),
                    emp.getApellido(), emp.getNumElementPres());
        }
        else
        {
            System.out.printf("\nNingun empleado ha prestado elementos\n");
        }
        
    }
    
    public static void masValorPrestado(List<Empleado> listaE){
    
        double mayor = 0;
        Empleado emp = null;
        for(Empleado e : listaE){
            double suma = 0;
            for (Elemento j : emp.getElementos())
            {
                if (j.getEstadoActual() == "Prestado")
                {
                    suma = j.getValor() + suma;
                }
                
            }
            if(suma > mayor){
                mayor = suma;
                emp = e;
            }
        }
        if(emp != null)
        {
            System.out.printf("\n El empleado con mas Valor Prestado es: %s %s\n", emp.getNombre(),
                    emp.getApellido());
            System.out.printf("\n El valor total prestado por el empleado actualmente es: %f", mayor);
        }
        if(emp == null)
            System.out.printf("\n Aun no han sido prestado elementos con valor \n");
    }
    
    
    public static void listadoEmpleados(List<Empleado> listaE){
        System.out.printf("\nLa base de datos actual de empleados es: \n");
        for(Empleado emp : listaE)
            System.out.println(emp);
    }
    
    
    public static void masHaPrestado(List<Empleado> listaE){
        int elemPrest = 0;
        Empleado emp = null;
        
        for(Empleado e : listaE){
            if(e.getContador() > elemPrest){
                elemPrest = e.getContador();
                emp = e;
            }
        }
        if(emp != null){
            System.out.printf("\nEl empleado que mas ha prestado elementos es: \n");
            System.out.printf("\n%s %s >> N° veces que ha prestado: %d", emp.getNombre(),
                    emp.getApellido(), emp.getContador());
        }
        else
            System.out.printf("\n Ningun elemento ha sido prestado\n");
    }
    
    public static void rollEstrella(List<Empleado> listaE){
        int elemPrest1 = 0;
        int elemPrest2 = 0;
        int elemPrest3 = 0;
        int elemPrest4 = 0;
        
        for(Empleado e : listaE){
            if(e.getRoll().equals(RollEmpleado.tiposEmpleado.get("1")))
                elemPrest1 = e.getContador() + elemPrest1;
            else if(e.getRoll().equals(RollEmpleado.tiposEmpleado.get("2")))
                elemPrest2 = e.getContador() + elemPrest2;
            else if(e.getRoll().equals(RollEmpleado.tiposEmpleado.get("3")))
                elemPrest3 = e.getContador() + elemPrest3;
            else if(e.getRoll().equals(RollEmpleado.tiposEmpleado.get("4")))
                elemPrest4 = e.getContador() + elemPrest4;
        } 
        
        int roll = Math.max(elemPrest1, Math.max(elemPrest2, Math.max(elemPrest3, elemPrest4)));
        if (roll > 0) {
            if (roll == elemPrest1) {
                System.out.printf("El roll que mas ha prestado elementos es: \n");
                System.out.printf("\n%s >> N° veces que han prestado: %d", RollEmpleado.tiposEmpleado.get("1"),
                        elemPrest1);
            } 
            else if (roll == elemPrest2) {
                System.out.printf("El roll que mas ha prestado elementos es: \n");
                System.out.printf("\n%s >> N° veces que han prestado: %d", RollEmpleado.tiposEmpleado.get("2"),
                        elemPrest2);
            } 
            else if (roll == elemPrest3) {
                System.out.printf("El roll que mas ha prestado elementos es: \n");
                System.out.printf("\n%s >> N° veces que han prestado: %d", RollEmpleado.tiposEmpleado.get("3"),
                        elemPrest3);
            } 
            else if (roll == elemPrest4) {
                System.out.printf("El roll que mas ha prestado elementos es: \n");
                System.out.printf("\n%s >> N° veces que han prestado: %d", RollEmpleado.tiposEmpleado.get("4"),
                        elemPrest4);
            }
        } 
        else {
            System.out.printf("\n Ningun elemento ha sido prestado\n");
        } 
    }
}
