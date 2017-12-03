/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasearboles;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author mjper
 */
public class CodigoA {
    private JTree arbolito;

    public CodigoA(JTree t) {
        arbolito=t;
    }
    
    
    
    
    public String codigo(){
        String codigo="";
        
        DefaultTreeModel modelo = (DefaultTreeModel)arbolito.getModel();
        DefaultMutableTreeNode raiz =(DefaultMutableTreeNode)modelo.getRoot();
        String[] tokens=arbolito.getName().split(",");
        String hijos= "";
        for (int i = 1; i < tokens.length; i++) {
            hijos+=tokens[i];
        }
        
        codigo+=
                "#include <iostream> \n"
                    + "using namespace std;\n\n" + "class " +tokens[0] +": "+hijos+ " \n"
                    + "{ \n";
        
        //Atributos
        codigo+="\n"
                + "//Atributos\n\n"
                + "";
        for (int i = 0; i < raiz.getChildAt(0).getChildCount(); i++) {
            codigo+=raiz.getChildAt(0).getChildAt(i)+"\n";
            
            
        }
        codigo+="\n"
                + "//Metodos\n\n";
        
        for (int i = 0; i < raiz.getChildAt(1).getChildCount(); i++) {
            codigo+= raiz.getChildAt(1).getChildAt(i)+"\n";
        }
        codigo+="\n\n}";
        
        
        
        
        return codigo;
        
        
    }
    
    
    
    
    
    
    
    
    
}
