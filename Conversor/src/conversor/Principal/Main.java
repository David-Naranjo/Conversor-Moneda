/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor.Principal;

import conversor.Controlador.Controlador;
import conversor.Modelo.Operacion;
import conversor.Vista.Formulario;

/**
 *
 * @author AUXILIARSC
 */
public class Main {
    
    public static void main(String [] args){
    Formulario f =  new Formulario();
    Operacion o =  new Operacion();
     
    new Controlador(o,f);     
    }
    
}
