/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clasesfiguralabel.*;
import javax.swing.JLabel;

/**
 *
 * @author mjper
 */
public class Codigo {

    JLabel lb = new JLabel();

    public Codigo() {
    }

    public String Inicioc(Inicio i) {
        String codigo = "";
        if (i.getTipo().equals("Inicio")) {
            codigo = "#include<stdio.h>\n"
                    + "#include<math.h\n"
                    + "#include <iostream.h>\n\n"
                    + "int main(){\n";
        } else if (i.getTipo().equals("Fin")) {
            codigo = "\n\n"
                    + "system (\"pause\");\n"
                    + "return 0;\n"
                    + "}";
        }
        return codigo;

    }//Fin metodo

    public String Entrada_Salidac(Entrada_Salida es) {
        String ess = "\n";

        for (Variable t : es.getListva()) {
            ess += t.getTipo() + " " + t.getNombre() + ";\n";
        }
        ess = "\n";

        return ess;
    }

    public String Condicionalc(Condicional co) {
        //Condicional, Ciclo
        String codigo = "";
        if (co.getTipo().equals("Condicional")) {
            codigo += "\n\n"
                    + "if(" + co.getText() + "){\n";
        } else if (co.getTipo().equals("Ciclo")) {
            codigo += "\n\n"
                    + "while(" + co.getText() + "){\n";
        }

        return codigo;
    }

    public String imprimir(Imprimir im) {
        /*
        int
     char
        bool
        float
          long int

         */
        String codigo = "";
        if (im.isConVariable()) {
            //String[] tokens = im.getText().split(",");
            if (im.getVariable().getTipo().equals("int") || im.getVariable().getTipo().equals("long int")) {
                codigo+= "\n"
                        + "printf(\""+im.getText()+" %i\\n\""+","+im.getVariable().getNombre()+";";
                
            }else if(im.getVariable().getTipo().equals("char")){
                codigo+="\n"
                        + "printf(\""+im.getText()+" %c\\n\""+","+im.getVariable().getNombre()+";";
                
            }else if(im.getVariable().getTipo().equals("float")){
                codigo+="\n"
                        + "printf(\""+im.getText()+" %f\\n\""+","+im.getVariable().getNombre()+";";
            }else if(im.getVariable().getTipo().equals("double")){
                codigo+="\n"
                        + "printf(\""+im.getText()+" %lf\\n\""+","+im.getVariable().getNombre()+";";
            }else{
                codigo+="\n"
                        + "printf(\""+im.getText()+" \\n\""+";";
            }
        }//Fin if is con variables
        else{
            codigo+="\n"
                        + "printf(\""+im.getText()+" \\n\""+";";
        }

        return codigo;

    }//Fin merodo imprimir
    
    public String procesosc(Procesos pr){
        String codigo="";
        
        codigo+="\n"
                + pr.getText()+";";
        
        return codigo;
    }

}//Fn del clase
