
package modelos;

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
 
}
