/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasearboles;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;

/**
 *
 * @author mjper
 */
public class ArbolClase extends JTree {
    private String nombre;
    private ArbolClase heredero;
    private boolean Herencia;

    public ArbolClase() {
        super();
    }

    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArbolClase getHeredero() {
        return heredero;
    }

    public void setHeredero(ArbolClase heredero) {
        this.heredero = heredero;
    }

    public boolean isHerencia() {
        return Herencia;
    }

    public void setHerencia(boolean Herencia) {
        this.Herencia = Herencia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
