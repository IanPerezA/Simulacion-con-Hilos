
package simulacionhilos;

import java.awt.Color;
import java.awt.Graphics;


public class Accesos {
Color color; 

public Accesos (Graphics g,int x, int y,String nombre){
    
    g.setColor(Color.RED);
    g.fillRect(x, y, 40, 40);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, 40, 40);
    g.drawString(nombre, x+5, y+25);
}
}
