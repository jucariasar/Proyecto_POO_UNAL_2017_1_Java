package modelos;

import java.util.*;

public class Empleado {

    private int ident;
    private String nombre;
    private String apellido;
    private int numElementPres;
    private int numRestriccion;
    private String roll;
    private int contador;
    private String email;
    private ArrayList<Elemento> elementos = new ArrayList<>();
    
    public Empleado()
    {
        this.ident = 0;
        this.nombre = null;
        this.apellido = null;
        this.numElementPres = 0;
        this.numRestriccion = 0;
        this.roll = null;
        this.contador = 0;
        this.email = null;
    }

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

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

    public int getNumRestriccion() {
        return numRestriccion;
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
            System.out.println(Mensaje.mensaje.get("empMasElementPrestados"));
            System.out.printf("\n %s %s >> N° elementos prestado: %s\n", emp.getNombre(),
                    emp.getApellido(), emp.getNumElementPres());
        }
        else
        {
            System.out.printf("\n %s\n", Mensaje.mensaje.get("noEmpConElementPrest"));
        }
        
    }
    
    public static void masValorPrestado(List<Empleado> listaE){
    
        double mayor = 0;
        Empleado emp = null;
        for(Empleado e : listaE){
            double suma = 0;
            for (Elemento j : emp.getElementos())
            {
                if (j.getEstadoActual().equals(RollTipoArea.estadoElemento.get("2")))
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
            System.out.printf("\n %s %s %s\n", Mensaje.mensaje.get("empMasValorPrestado"),emp.getNombre(),
                    emp.getApellido());
            System.out.printf("\n %s %f", Mensaje.mensaje.get("totalValorPrestado"), mayor);
        }
        if(emp == null)
            System.out.printf("\n %s\n", Mensaje.mensaje.get("noEmpConElementPrest"));
    }
    
    
    public static void listadoEmpleados(List<Empleado> listaE){
        System.out.printf("\n %s \n", Mensaje.mensaje.get("msjListaEmpleados"));
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
            System.out.printf("\n %s\n", Mensaje.mensaje.get("EmpMasHaPrestElement"));
            System.out.printf("\n%s %s >> N° veces que ha prestado: %d", emp.getNombre(),
                    emp.getApellido(), emp.getContador());
        }
        else
            System.out.printf("\n %s\n", Mensaje.mensaje.get("noElementPrest"));
    }
    
    public static void rollEstrella(List<Empleado> listaE){
        int elemPrest1 = 0;
        int elemPrest2 = 0;
        int elemPrest3 = 0;
        int elemPrest4 = 0;
        
        for(Empleado e : listaE){
            if(e.getRoll().equals(RollTipoArea.rollEmpleado.get("1")))
                elemPrest1 = e.getContador() + elemPrest1;
            else if(e.getRoll().equals(RollTipoArea.rollEmpleado.get("2")))
                elemPrest2 = e.getContador() + elemPrest2;
            else if(e.getRoll().equals(RollTipoArea.rollEmpleado.get("3")))
                elemPrest3 = e.getContador() + elemPrest3;
            else if(e.getRoll().equals(RollTipoArea.rollEmpleado.get("4")))
                elemPrest4 = e.getContador() + elemPrest4;
        } 
        
        int roll = Math.max(elemPrest1, Math.max(elemPrest2, Math.max(elemPrest3, elemPrest4)));
        if (roll > 0) {
            if (roll == elemPrest1) {
                System.out.printf("%s \n", Mensaje.mensaje.get("msjRollEstrella"));
                System.out.printf("\n%s >> %s %d", RollTipoArea.rollEmpleado.get("1"), Mensaje.mensaje.get("msj2RollEstrella"), 
                        elemPrest1);
            } 
            else if (roll == elemPrest2) {
                System.out.printf("%s \n", Mensaje.mensaje.get("msjRollEstrella"));
                System.out.printf("\n%s >> %s %d", RollTipoArea.rollEmpleado.get("2"), Mensaje.mensaje.get("msj2RollEstrella"), 
                        elemPrest1);
            } 
            else if (roll == elemPrest3) {
                System.out.printf("%s \n", Mensaje.mensaje.get("msjRollEstrella"));
                System.out.printf("\n%s >> %s %d", RollTipoArea.rollEmpleado.get("3"), Mensaje.mensaje.get("msj2RollEstrella"), 
                        elemPrest1);
            } 
            else if (roll == elemPrest4) {
                System.out.printf("%s \n", Mensaje.mensaje.get("msjRollEstrella"));
                System.out.printf("\n%s >> %s %d", RollTipoArea.rollEmpleado.get("4"), Mensaje.mensaje.get("msj2RollEstrella"), 
                        elemPrest1);
            }
        } 
        else 
        {
            System.out.printf("\n %s\n", Mensaje.mensaje.get("noElementPrest"));
        } 
    }
}
