package modelos;

public class Administrativo extends Empleado {

    public final int MAX_AD  = 2;

    private int grado;

    public Administrativo(int ident, String nombre, String apellido, int numElementPrest,
            String roll, String email, int grado) {
        super(ident, nombre, apellido, numElementPrest, roll, email);
        setGrado(grado);
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    @Override
    public String toString(){
        return String.format("%s\nGrado: %s",super.toString(), getGrado());
    }

}
