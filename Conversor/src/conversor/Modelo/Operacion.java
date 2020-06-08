/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor.Modelo;

import java.text.DecimalFormat;

/**
 *
 * @author AUXILIARSC
 */
public class Operacion
{
    private Double dinero,moneda,resultado;
    

    public Operacion() {
        super();
    }

    public Operacion(Double dinero, Double moneda, Double resultado) {
        super();
        this.dinero = dinero;
        this.moneda = moneda;
        this.resultado = resultado;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public Double getMoneda() {
        return moneda;
    }

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public void convertirDolarPeso(){
        moneda = 4000.0;
        resultado = dinero*moneda;
    }
    
    public void convetrtirPesoDolar(){
        moneda =  4000.0;
        resultado = dinero / moneda;
    }
}
