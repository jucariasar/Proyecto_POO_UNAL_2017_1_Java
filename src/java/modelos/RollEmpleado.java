
package modelos;

import java.util.HashMap;


public class RollEmpleado {
        public static HashMap<String, String> tiposEmpleado = new HashMap<String, String>();
        
    
    public static void inicializar()
    {
        tiposEmpleado.put("1", "Administrador Almacen");
        tiposEmpleado.put("2", "Administrativo");
        tiposEmpleado.put("3", "Ingeniero Tecnico");
        tiposEmpleado.put("4", "Operario");
    }
    
}
