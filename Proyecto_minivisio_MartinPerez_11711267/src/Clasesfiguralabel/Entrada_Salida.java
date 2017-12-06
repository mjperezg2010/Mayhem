/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesfiguralabel;

import Clases.Variable;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author mjper
 */
public class Entrada_Salida extends Figura{
    ArrayList <Variable> listva = new ArrayList();
    

    public ArrayList<Variable> getListva() {
        return listva;
    }

    public void setListva(ArrayList<Variable> listva) {
        this.listva = listva;
    }

   

    @Override
    public String toString() {
        return super.getText();
    }
    
    
    
    
}//Fin clase
