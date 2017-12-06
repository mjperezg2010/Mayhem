/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesfiguralabel;

import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author mjper
 */
public class Figura extends JLabel implements Serializable {
    private boolean agregado;
    
    private static final long SerialVersionUID = 777L;

    public Figura() {
        super();
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    @Override
    public String toString() {
        return super.getText();
    }
    
     
    
    
    
    
    
}
