
package modelos;

import java.util.ArrayList;
import java.util.List;
import modelos.*;

public class Almacen {
    
    public static List<Empleado> empleados = new ArrayList<>();
    public static List<Elemento> elementos = new ArrayList<>();
    public static int controlFicticios = 0;
    
    public static void crearDatosFicticios(){
        
        RollTipoArea.inicializar();
        
        
        AdministradorAlmacen e1 = new AdministradorAlmacen();
        e1.setIdent(1);
        e1.setNombre("Pablo");
        e1.setApellido("Castrillon");
        e1.setNumElementPres(0);
        e1.setRoll(RollTipoArea.rollEmpleado.get("1"));
        e1.setEmail("pc@unal.edu.co");
        e1.setGrado(10);
        e1.setUsuario("pcastrillon");
        e1.setPassword("1234");
        empleados.add(e1);
        
        AdministradorAlmacen e2 = new AdministradorAlmacen();
        e2.setIdent(2);
        e2.setNombre("Jaider");
        e2.setApellido("Peralta");
        e2.setNumElementPres(0);
        e2.setRoll(RollTipoArea.rollEmpleado.get("1"));
        e2.setEmail("jp@unal.edu.co");
        e2.setGrado(10);
        e2.setUsuario("jperalta");
        e2.setPassword("4567");
        empleados.add(e2);
        
        Administrativo e3 = new Administrativo();
        e3.setIdent(3);
        e3.setNombre("Yeison");
        e3.setApellido("Ortiz");
        e3.setNumElementPres(0);
        e3.setRoll(RollTipoArea.rollEmpleado.get("2"));
        e3.setEmail("jo@unal.edu.co");
        e3.setGrado(10);
        empleados.add(e3);
        
        IngenieroTecnico e4 = new IngenieroTecnico();
        e4.setIdent(4);
        e4.setNombre("Carlos");
        e4.setApellido("Tamayo");
        e4.setNumElementPres(0);
        e4.setRoll(RollTipoArea.rollEmpleado.get("3"));
        e4.setEmail("ct@metalmecanica.com");
        e4.setArea(RollTipoArea.areaIngeniero.get("2"));
        empleados.add(e4);
        
        Operario e5 = new Operario();
        e5.setIdent(5);
        e5.setNombre("Luis");
        e5.setApellido("Ospina");
        e5.setNumElementPres(0);
        e5.setRoll(RollTipoArea.rollEmpleado.get("4"));
        e5.setEmail("lo@metalmecanica.com");
        e5.setTipo(RollTipoArea.tipoOperario.get("1"));
        empleados.add(e5);
        
        Elemento element1 = new Elemento();
        element1.setCodigo(25);
        element1.setNombre("Taladro");
        element1.setUbicacion("A5");
        element1.setFechaPrestamo(null);
        element1.setValor(250);
        element1.setEstadoActual(RollTipoArea.estadoElemento.get("1"));
        elementos.add(element1);
        
        Elemento element2 = new Elemento();
        element2.setCodigo(35);
        element2.setNombre("Monitor LED");
        element2.setUbicacion("B4");
        element2.setFechaPrestamo(null);
        element2.setValor(125);
        element2.setEstadoActual(RollTipoArea.estadoElemento.get("2"));
        elementos.add(element2);
        
        Elemento element3 = new Elemento();
        element3.setCodigo(45);
        element3.setNombre("Multimetro");
        element3.setUbicacion("C1");
        element3.setFechaPrestamo(null);
        element3.setValor(120);
        element3.setEstadoActual(RollTipoArea.estadoElemento.get("1"));
        elementos.add(element3);
        
        Elemento element4 = new Elemento();
        element4.setCodigo(55);
        element4.setNombre("Pistola Neumatica");
        element4.setUbicacion("A5");
        element4.setFechaPrestamo(null);
        element4.setValor(250);
        element4.setEstadoActual(RollTipoArea.estadoElemento.get("1"));
        elementos.add(element4);
        
    
    }
    
}
