/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionhilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Ian_I
 */
public class Hilos2 extends Thread {
 private String nombre;
 private  int tiempo;
 JPanel panel;
 public  int iteracion2;
 

 public Hilos2(String nombre,int tiempo,JPanel p){

     this.tiempo=tiempo;
     this.nombre=nombre;
     this.panel=p;
 }

    public int getIteracion2() {
        System.out.println("Publicadno lo que retorna el get 2: " + iteracion2
        );
        return iteracion2;
    }

    public void setIteracion2(int iteracion) {
        this.iteracion2 = iteracion;
    }
 
 
 public void run(){
     int x=400;
     int y=60;
     for (int i = 1; i <= 50; i++) {
         Accesos2 A2 = new Accesos2(panel.getGraphics(),x,y,nombre);
     try {
         Thread.sleep(tiempo);
     } catch (InterruptedException ex) {
         Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
     }
     x+=50;
     if (i%5==0){
         x=400;
         y+=60;
     }
     iteracion2++;
     setIteracion2(iteracion2);
//         System.out.println("iteracion hilo 2: " +iteracion2);
     }
     
    
 }
  
 
 
}

