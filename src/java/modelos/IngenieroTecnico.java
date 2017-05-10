
package modelos;

import java.util.List;
import java.util.Scanner;

public class IngenieroTecnico extends Empleado{
    
    public static final int MAX_IT  = 4;
    
    String areaEncargada;
    
    public IngenieroTecnico()
    {
        super();
        setArea(null);
    }
    
    public IngenieroTecnico(int ident, String nombre, String apellido,
            int numElementPrest, String roll, String email, String area){
        super(ident, nombre, apellido, numElementPrest, roll, email);
        setArea(area);
    }

    public String getArea() {
        return areaEncargada;
    }

    public void setArea(String areaEncargada) {
        this.areaEncargada = areaEncargada;
    }

    @Override
    public String toString() {
        return String.format("%s\nArea Encargada: %s", super.toString(), getArea());
    }
    
 
    public void registrarEmpleado(List<Empleado> listaEmp)
    {
        String texto;
        int op;
        Scanner entrada = new Scanner(System.in);
        IngenieroTecnico empleado = new IngenieroTecnico();
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
        // Implementar forma apropiada de escoger el área
        listaEmp.add(empleado);
              
    }
}
