
package modelos;

import java.util.Scanner;
import java.util.List;

public class Operario extends Empleado{
    
    public static final int MAX_OP  = 6;
    
    private String tipo;
    
    public Operario()
    {
        super();
        setTipo(null);
    }
    
    public Operario(int ident, String nombre, String apellido, int numElementPrest,
            String roll, String email, String tipo)
    {
        super(ident, nombre, apellido, numElementPrest, roll, email);
        setTipo(tipo);
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("%s\nTipo: %s", super.toString(), getTipo());
    }
    
    
    public void registrarEmpleado(List<Empleado> listaEmp)
    {
        String texto;
        int op;
        Scanner entrada = new Scanner(System.in);
        Operario empleado = new Operario();
        System.out.printf("%s ", Mensaje.mensaje.get("msj1RegistEmp"));
        op = entrada.nextInt();
        empleado.setIdent(op);
        while((Empleado.buscarEmpleadoPorId(listaEmp, op)) != null)
        {
            entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
            System.out.printf(" \n!!! %s !!!\n", Mensaje.mensaje.get("msj5RegistrarEmp"));
            System.out.printf("%s ", Mensaje.mensaje.get("msj1RegistEmp"));
            op = entrada.nextInt();
            empleado.setIdent(op);
        }
        entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
        System.out.printf("%s ", Mensaje.mensaje.get("msj2RegistrarEmp"));
        texto = entrada.nextLine();
        empleado.setNombre(texto);
        entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
        System.out.printf("%s ", Mensaje.mensaje.get("msj3RegistrarEmp"));
        texto = entrada.nextLine();
        empleado.setApellido(texto);
        entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
        System.out.printf("%s : ", Mensaje.mensaje.get("msj4RegistrarEmp"));
        texto = entrada.nextLine();
        empleado.setEmail(texto);
        // Implementar forma apropiada de escoger el tipo de Operario
        listaEmp.add(empleado);
              
    }    
    
 
}
