/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracon;

//import com.itextpdf.text.Chunk;
//import com.itextpdf.text.Paragraph;
import com.itextpdf.text.*;
//import java.awt.Font;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;

/**
 *
 * @author mjper
 */
public class PDF {
    
     public PDF() {
    }
    private Font f1 = new Font(Font.FontFamily.HELVETICA, 18, Font.UNDERLINE);
    private Font f2 = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
    //private Font f3 = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);

    public Paragraph setTitulo(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(f1);
        c.setUnderline(1, -1);
        p.add(c);
        return p;
    }

    public Paragraph setCuerpo(String Texto) {
        Paragraph par = new Paragraph();
        Chunk chu = new Chunk();
        par.setAlignment(Element.ALIGN_JUSTIFIED);
        chu.append(Texto);
        chu.setFont(f2);
        par.add(chu);
        return par;
    }
    
    
    
    
}
