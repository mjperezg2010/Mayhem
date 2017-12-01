/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesfiguralabel;

import Clases.Variable;
import javax.swing.JLabel;

/**
 *
 * @author mjper
 */
public class Imprimir extends Figura {
    private Variable variable;
    
    
    private boolean conVariable;

    public boolean isConVariable() {
        return conVariable;
    }

    public void setConVariable(boolean conVariable) {
        this.conVariable = conVariable;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }
    
    
    
    
    
    

    @Override
    public String toString() {
        return "Imprimir";
    }
    
    
    
    
    
}
