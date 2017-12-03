/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracon;

import Clasesfiguralabel.Figura;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author mjper
 */
public class AdminFlujo {
    private ArrayList<Figura> listaf = new ArrayList();
    private File archivo = null;

    public AdminFlujo(String path) {
        archivo= new File(path);
        
        
    }
    
     public void setFigura(Figura f){
        this.listaf.add(f);
    }

    public ArrayList<Figura> getListaf() {
        return listaf;
    }

    public void setListaf(ArrayList<Figura> listaf) {
        this.listaf = listaf;
    }
    
    
    
    


    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminFlujo{" + "listaf=" + listaf + ", archivo=" + archivo + '}';
    }
    
    
     public void cargararchivo(){
        try {
            listaf = new ArrayList();
            Figura temp;
        if (archivo.exists()){
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                while ((temp=(Figura)objeto.readObject())!=null) {
                    listaf.add(temp);
                    
                }
                
            } catch (Exception e) {
                //Encontro el final del archivo
            }
            objeto.close();
            entrada.close();
            
        }//Fin if
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//Fin metod cargar archivo
    
    public void escribirArchivo() throws IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw= null;
        
        try {
            fw= new FileOutputStream(archivo);
            bw= new ObjectOutputStream(fw);
            
            for (Figura t : listaf) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    
    
    
    
}
