
package modelos;

import java.util.HashMap;


public class RollTipoArea {
        public static HashMap<String, String> rollEmpleado = new HashMap<String,String>();
        public static HashMap<String, String> tipoOperario = new HashMap<String,String>();
        public static HashMap<String, String> areaIngeniero = new HashMap<String,String>();
    
    public RollTipoArea(){
        rollEmpleado.put("1", "Administrador Almacen");
        rollEmpleado.put("2", "Administrativo");
        rollEmpleado.put("3", "Ingeniero Tecnico");
        rollEmpleado.put("4", "Operario");
        
        tipoOperario.put("1", "Mecanico");
        tipoOperario.put("2", "Electrico");
        tipoOperario.put("3", "Electronico");
        
        areaIngeniero.put("1", "Mantenimiento");
        areaIngeniero.put("2", "Produccion");
        areaIngeniero.put("3", "Calidad");
    }
    
}