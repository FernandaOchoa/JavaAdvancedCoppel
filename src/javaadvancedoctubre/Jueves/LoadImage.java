package javaadvancedoctubre.Jueves;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;



public class LoadImage extends Thread {
     String imagen;
    public void run(){
        try{
            display("dinocat.png");
            Thread.sleep(1000);
            display("witch.jpg");
            Thread.sleep(1000);
            display("octomortem.jpg");
            
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
    
    public void display(String imagen){
        this.imagen = imagen; 
        JFrame f = new JFrame("Load");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.add(new LoadImageApp(imagen));
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args) throws IOException {
        LoadImage t1 = new LoadImage();
        t1.start();
        Hola t = new Hola();
        t.PlayMusic("onlyone.wav");
    }
}
