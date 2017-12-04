/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracon;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author mjper
 */
public class Imprimirpanel implements Printable{
    private final double posx, posy, width;
    private final int movimiento;
    private final BufferedImage image;
    
    
    public Imprimirpanel(PrinterJob printJob, BufferedImage image) {
        PageFormat pageFormat = printJob.defaultPage();
        this.posx = pageFormat.getImageableX();
        this.posy = pageFormat.getImageableY();
        this.width = pageFormat.getImageableWidth();
        this.movimiento = pageFormat.getOrientation();
        this.image = image;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
       if (pageIndex == 0) {
            int posWidth;
            int posHeight;
            if (movimiento == PageFormat.PORTRAIT) {
                posWidth = (int) Math.min(width, image.getWidth());
                posHeight = posWidth * image.getHeight() / image.getWidth();
            } else {
                posHeight = (int) Math.min(width, image.getHeight());
                posWidth = posHeight * image.getWidth() / image.getHeight();
            }
            graphics.drawImage(image, (int) posx, (int) posy, posWidth, posHeight, null);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }
    
}
