package javaadvancedoctubre.Miercoles;
//Sleep
public class Test extends Thread {
    public void run(){
        for(int i = 1; i<5; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
    
    public static void main(String[] args) {
        Test t1 = new Test(),t2 = new Test();
        t1.start();        
        t2.start();
      
    }
}
