package javaadvancedoctubre.Miercoles.carrera;

public class Tortuga extends Thread{
    
    public void run() {
        int i =0;
        System.out.println("Inicia la Tortuga");
        
        while(i<=5){
            try{
                Thread.sleep(500);
                 System.out.println("Da un paso la tortuga");
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
           i++;
        }
        System.out.println("Ya llego la tortuga");
    }
    
}
