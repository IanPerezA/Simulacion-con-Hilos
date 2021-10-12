/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionhilos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ian_I
 */
public class Accesos2 {
public Accesos2 (Graphics g,int x, int y,String nombre){
    
    g.setColor(Color.BLUE);
    g.fillRect(x, y, 40, 40);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, 40, 40);
    g.drawString(nombre, x+5, y+25);
}    
}
