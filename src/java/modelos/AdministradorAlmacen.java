package modelos;

import java.util.List;
import java.util.Scanner;

public class AdministradorAlmacen extends Administrativo {

    private String usuario;
    private String password;

    public AdministradorAlmacen() {
        super();
        setUsuario(null);
        setPassword(null);
    }

    public AdministradorAlmacen(int ident, String nombre, String apellido, int numElementPrest,
            String roll, String email, int grado, String usuario, String password) {
        super(ident, nombre, apellido, numElementPrest, roll, email, grado);
        setUsuario(usuario);
        setPassword(password);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%s\nUsuario: %s\nPassword: %s", super.toString(), getUsuario(), getPassword());
    }

    public static void registrarEmpleado(List<Empleado> listaE) {
        String texto;
        int op;
        Empleado empleado;
        System.out.printf("\n¿%s?\n\n1. Si.\n2. No.", Mensaje.mensaje.get("msj1RegistrarAdminAlmacen"));
        System.out.printf("\n%s ", Mensaje.mensaje.get("msjOpcion"));
        Scanner entrada = new Scanner(System.in);
        op = entrada.nextInt();

        if (op == 1) {
            AdministradorAlmacen admin;
            empleado = new AdministradorAlmacen();
            admin = (AdministradorAlmacen) empleado;
            entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
            System.out.printf("\n%s ", Mensaje.mensaje.get("msj2RegistrarAdminAlmacen"));
            texto = entrada.nextLine();
            admin.setUsuario(texto);
            entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
            System.out.printf("%s ", Mensaje.mensaje.get("msj3RegistrarAdminAlmacen"));
            texto = entrada.nextLine();
            admin.setPassword(texto);
            // Implementar forma apropiada de escoger el roll
        } else {
            empleado = new Administrativo();
            empleado.setRoll(RollTipoArea.rollEmpleado.get("2"));
        }
        entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
        System.out.printf("%s ", Mensaje.mensaje.get("msj1RegistEmp"));
        op = entrada.nextInt();
        empleado.setIdent(op);
        
        while ((Empleado.buscarEmpleadoPorId(listaE, op)) != null) {
            entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
            System.out.printf(" \n!!! %s !!!\n", Mensaje.mensaje.get("msj5RegistrarEmp"));
            System.out.printf("%s ", Mensaje.mensaje.get("msj1RegistEmp"));
            op = entrada.nextInt();
        }
        
        entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
        System.out.printf("%s ", Mensaje.mensaje.get("msj2RegistEmp"));
        texto = entrada.nextLine();
        empleado.setNombre(texto);
        entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
        System.out.printf("%s ", Mensaje.mensaje.get("msj3RegistEmp"));
        texto = entrada.nextLine();
        empleado.setApellido(texto);
        entrada.nextLine(); // Descarta la entrada anterior para volver a utilizar entrada
        System.out.printf("%s ", Mensaje.mensaje.get("msj4RegistEmp"));
        texto = entrada.nextLine();
        empleado.setEmail(texto);
        // Implementar forma apropiada de escoger el grado
        listaE.add(empleado);
    }

}
