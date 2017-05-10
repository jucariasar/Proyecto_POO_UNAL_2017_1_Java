/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.HashMap;

/**
 *
 * @author Sistematizacion
 */
public class Mensaje {
    
  
    public static HashMap<String, String> mensaje = new HashMap<String,String>();
    
    public Mensaje(){
        mensaje.put("empMasElementPrestados", "El Empleado con mas Elementos Prestados es: ");
        mensaje.put("empMasHaPrestElement", "El empleado que mas ha prestado elementos es:");
        mensaje.put("empMasValorPrestado", "El Empleado con mas Valor($) Prestado es:");
        mensaje.put("noEmpConElementPrest", "Ningun Empleado ha Prestado Elementos");
        mensaje.put("noElementPrest", "Ningun elemento ha sido prestado");
        mensaje.put("totalValorPrestado", "El valor total prestado por el empleado actualmente es:");
        mensaje.put("msjListaEmpleados", "La base de datos actual de empleados es:");
        mensaje.put("msjRollEstrella", "El roll que mas ha prestado elementos es:");
        mensaje.put("msj2RollEstrella", "N° veces que han prestado:");
        mensaje.put("msj1RegistEmp", "Ingrese su Numero de Identificacion:");
        mensaje.put("msj2RegistrarEmp", "Ingrese su Nombre:");
        mensaje.put("msj3RegistrarEmp", "Ingrese su Apellido:");
        mensaje.put("msj4RegistrarEmp", "Ingrese su Email:");
        mensaje.put("msj5RegistrarEmp", "Ya existe un empleado con este numero de identificacion");
        mensaje.put("msj1RegistrarAdminAlmacen", "Empleado Administrador del almacen");
        mensaje.put("msj2RegistrarAdminAlmacen", "Establezca su Usuario:");
        mensaje.put("msj3RegistrarAdminAlmacen", "Establezca el Password:");
        mensaje.put("msjOpcion", "Ingrese su opcion:");
        
        

        //mensaje.put("", "");
        
    }
    
}