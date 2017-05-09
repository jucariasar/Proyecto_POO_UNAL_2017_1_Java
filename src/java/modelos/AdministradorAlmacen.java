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
        System.out.printf("\n¿Empleado Administrador del almacen?\n\n1. Si.\\n2. No.");
        System.out.printf("\\nIngrese su Opcion: ");
        Scanner entrada = new Scanner(System.in);
        op = entrada.nextInt();

        if (op == 1) {
            AdministradorAlmacen admin;
            empleado = new AdministradorAlmacen();
            admin = (AdministradorAlmacen) empleado;
            System.out.printf("\nEstablezca el usuario: ");
            texto = entrada.nextLine();
            admin.setUsuario(texto);
            System.out.printf("Establezca el Password: ");
            texto = entrada.nextLine();
            admin.setPassword(texto);
            // Implementar forma apropiada de escoger el roll
        } else {
            empleado = new Administrativo();
            empleado.setRoll(RollTipoArea.rollEmpleado.get("2"));
        }

        System.out.printf("Ingrese su Numero de Identificacion: ");
        op = entrada.nextInt();
        empleado.setIdent(op);

        while ((Empleado.buscarEmpleadoPorId(listaE, op)) != null) {
            System.out.printf(" \n!!! Ya existe un empleado con este numero de identificacion !!!\n");
            System.out.printf("Ingrese su Numero de Identificacion: ");
            op = entrada.nextInt();
        }

        System.out.printf("Ingrese su Nombre: ");
        texto = entrada.nextLine();
        empleado.setNombre(texto);
        System.out.printf("Ingrese su Apellido: ");
        texto = entrada.nextLine();
        empleado.setApellido(texto);
        System.out.printf("Ingrese su Email: : ");
        texto = entrada.nextLine();
        empleado.setEmail(texto);
        // Implementar forma apropiada de escoger el grado
        listaE.add(empleado);
    }

}
