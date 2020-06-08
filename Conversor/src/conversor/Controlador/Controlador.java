/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor.Controlador;

import conversor.Modelo.Operacion;
import conversor.Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author AUXILIARSC
 */
public class Controlador implements ActionListener{
    
    private Operacion o = null;
    private Formulario f =  null;
    
 
    
    public Controlador(){}
    
    public Controlador(Operacion o,Formulario f){
        super();
        this.o=o;
        this.f=f;
        actionListener(this);
    }
    
    public void actionListener(ActionListener controlador){
        f.btnDolares.addActionListener(controlador);
        f.btnPesos.addActionListener(controlador);
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getActionCommand().equals("Convetir a pesos")){
                String dinero = this.f.txtDinero.getText();
                o.setDinero(Double.parseDouble(dinero));
                o.convertirDolarPeso();
                f.txtResultado.setText(o.getResultado().toString());
            }else if(e.getActionCommand().equals("Convertir a dolares")){
                String dinero = this.f.txtDinero.getText();
                o.setDinero(Double.parseDouble(dinero));
                o.convetrtirPesoDolar();
                f.txtResultado.setText(o.getResultado().toString());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
      
}
