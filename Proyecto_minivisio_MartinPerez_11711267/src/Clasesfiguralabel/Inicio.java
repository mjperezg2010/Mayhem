/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesfiguralabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author mjper
 */
public class Inicio extends Figura{
    private String tipo;

    public Inicio() {
      
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
@Override
    public String toString() {
        return super.getText();
    }
    
    
    
    
    
    
    
}
