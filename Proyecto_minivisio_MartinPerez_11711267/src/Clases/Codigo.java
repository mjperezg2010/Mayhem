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
            codigo = "#include<iostream>\n"
                    + "#include<math.h>\n"
                    + "using namespace std;\n\n"
                    + "int main(){\n";
        } else if (i.getTipo().equals("Fin")) {
            codigo = "\n\n"
                    + "\n"
                    + "return 0;\n"
                    + "}";
        }
        return codigo;

    }//Fin metodo

    public String Entrada_Salidac(Entrada_Salida es) {
        String ess = "\n";

       ess+="\n"
                + es.getText()+";";
        ess += "\n";

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
        

        
            codigo+="\n"
                        + "cout<< \""+im.getText()+";";
        
        

        return codigo;

    }//Fin merodo imprimir
    
    public String procesosc(Procesos pr){
        String codigo="";
        
        codigo+="\n"
                + pr.getText()+";";
        
        return codigo;
    }

}//Fn del clase
