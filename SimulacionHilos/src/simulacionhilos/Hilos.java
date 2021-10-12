
package simulacionhilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class Hilos extends Thread {
 private String nombre;
 private  int tiempo;
 JPanel panel;
 public static int iteracion =0;
 
 public Hilos(String nombre,int tiempo,JPanel p){
     this.tiempo=tiempo;
     this.nombre=nombre;
     this.panel=p;
 }
 public int getIteracion() {
        System.out.println("Publicando lo que retorna el get 1:" + iteracion);
        return iteracion;
        
    }
    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }
 
 
 public void run(){
     int x=10;
     int y=60;
     for (int i = 1; i <= 50; i++) {
         Accesos A1 = new Accesos(panel.getGraphics(),x,y,nombre);
     try {
         Thread.sleep(tiempo);
     } catch (InterruptedException ex) {
         Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
     }
     x+=50;
     if (i%5==0){
         x=10;
         y+=60;
     }
     iteracion++;
    setIteracion(iteracion);
//         System.out.println("Iteracion hilo 1: "+ iteracion);
     }
 }
 
   

}
