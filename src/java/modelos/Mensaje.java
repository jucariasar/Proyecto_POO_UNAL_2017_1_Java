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
        mensaje.put("errorNegativeNumber", "Error no puede ingresar numero negativos");
    }
    
}