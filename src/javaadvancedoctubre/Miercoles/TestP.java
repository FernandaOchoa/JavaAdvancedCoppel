package javaadvancedoctubre.Miercoles;

//Priority
public class TestP  extends Thread{
    public void run(){
        System.out.println("corriendo un hilo lladado "
                +Thread.currentThread().getName());
        
        System.out.println("corriendo un hilo con prioridad "
                +Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        TestP t1 = new TestP();
        TestP t2 = new TestP();
        
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        
        t1.start();
        t2.start();
        
    }
}
