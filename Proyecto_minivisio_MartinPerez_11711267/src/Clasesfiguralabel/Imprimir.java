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
public class Imprimir extends JLabel {
    
    
    
    private boolean conVariable;

    public boolean isConVariable() {
        return conVariable;
    }

    public void setConVariable(boolean conVariable) {
        this.conVariable = conVariable;
    }
    
    
    
    
    
    

    @Override
    public String toString() {
        return "Imprimir";
    }
    
    
    
    
    
}