/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracon;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private BufferedImage Imagen;
    private int elegir;
    private String nombrediagrama="";
    private JFileChooser jfc = new JFileChooser();

    public Guardarpic(JPanel p,String n) {
        panelprincipal=p;
        nombrediagrama=n;
    }

    

    

    public void Creacion() {
        
        this.Imagen = new BufferedImage(panelprincipal.getWidth(), panelprincipal.getHeight(), BufferedImage.TYPE_INT_RGB);
        
        Graphics G = Imagen.getGraphics();
        panelprincipal.paintAll(G);
    }

    public boolean Escribirla() {
        try{
        archivo = null;
        
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
            PDF();
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

    public BufferedImage getImagen() {
        return Imagen;
    }
    
    
    
    
    
    public void PDF() {
        //String ruta = jfc.getSelectedFile().getPath();
        try {
           /* try {
                ImageIO.write(Imagen, "png", new File(Path + "1" + ".png"));
            } catch (IOException ex) {
                Logger.getLogger(panelprincipal.getName()).log(Level.SEVERE, null, ex);
            }*/
            Image imagen = Image.getInstance(jfc.getSelectedFile().getPath() + "#" + ".png");
            imagen.scaleAbsolute(500, 400);
            imagen.setAlignment(Element.ALIGN_CENTER);
            FileOutputStream archivo = new FileOutputStream(jfc.getSelectedFile().getPath() + ".PDF");
            Document d = new Document();
            PdfWriter.getInstance(d, archivo);
            PDF creacion = new PDF();
            d.open();
            d.setPageSize(PageSize.LETTER);
            d.add(creacion.setTitulo(nombrediagrama));
            //doc.add(new Paragraph("                                                  Carlos Wilfredo Romero Maradiaga \n"));
            d.add(imagen);
           // doc.add(pdf.getCuerpo("\nCódigo Generado:\n"));
           /* if (codigo.length()<2) {
                doc.add(pdf.getCuerpo("Para poder visualizar el código, primero debe generarlo desde el Sistema y vuelva a guardar el archivo."));
            } else {
                doc.add(pdf.getCuerpo(codigo));
            */
            d.close();
            JOptionPane.showMessageDialog(null, "El PDF se genero excelente", "Excelente", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
    }
    
}
