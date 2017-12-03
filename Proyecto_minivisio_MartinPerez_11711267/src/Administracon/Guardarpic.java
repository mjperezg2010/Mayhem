/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracon;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mjper
 */
public class Guardarpic {
    
     private JPanel panelprincipal = new JPanel();
    private File archivo = null;
    BufferedImage Imagen;
    int elegir;

    public Guardarpic(JPanel p) {
        panelprincipal=p;
    }

    

    

    public void Creacion() {
        
        this.Imagen = new BufferedImage(panelprincipal.getWidth(), panelprincipal.getHeight(), BufferedImage.TYPE_INT_RGB);
        
        Graphics G = Imagen.getGraphics();
        panelprincipal.paintAll(G);
    }

    public boolean Escribirla() {
        try{
        archivo = null;
        JFileChooser jfc = new JFileChooser();
        //Extensiones
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen PNG", "PNG");
        jfc.addChoosableFileFilter(filtro);
        FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Imagen JPG-JPEG", "JPEG");
        jfc.addChoosableFileFilter(filtro1);
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagen GIF", "GIF");
        jfc.addChoosableFileFilter(filtro2);
        FileNameExtensionFilter filtro3 = new FileNameExtensionFilter("Archivo PDF", "PDF");
        jfc.addChoosableFileFilter(filtro3);
        
        String imagen;
        
        elegir = jfc.showSaveDialog(panelprincipal);
        if (jfc.getFileFilter().getDescription().equals("Imagen PNG")) {
            imagen = "PNG";
        }else if (jfc.getFileFilter().getDescription().equals("Imagen JPG-JPEG")) {
            imagen = "JPEG";
        }else if (jfc.getFileFilter().getDescription().equals("Imagen GIF")) {
            imagen = "GIF";
        }else if (jfc.getFileFilter().getDescription().equals("Archivo PDF")) {
            JOptionPane.showMessageDialog(null, "Todavía en Desarrollo", "En Desarrollo", 0);
            return false;
        }else{
            imagen = "PNG";
        }
        archivo = new File(jfc.getSelectedFile().getPath() + "." + imagen);
        try {
            //ESTE GUARDA LA IMAGEN
            ImageIO.write(Imagen, imagen, archivo);
            JOptionPane.showMessageDialog(null, "Archivo " + imagen + " guardado correctamente.", "Guardar", JOptionPane.OK_OPTION);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar Archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }catch(Exception e){  
        }
        return true;
    }
    
}
