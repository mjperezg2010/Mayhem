/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesfiguralabel;

import javax.swing.JLabel;

/**
 *
 * @author mjper
 */
public class Condicional extends Figura {
    private String tipo;

    public Condicional() {
        tipo="Condicional";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
    @Override
    public String toString() {
        return "Condicional";
    }
    
    
}
