
package modelos;

public class IngenieroTecnico extends Empleado{
    
    public final int MAX_IT  = 4;
    
    String areaEncargada;
    
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
}
