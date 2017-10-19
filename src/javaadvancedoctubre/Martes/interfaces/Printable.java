
package javaadvancedoctubre.Martes.interfaces;

public class Printable implements print {
    public void print(){
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        Printable p = new Printable();
        p.print();
    }
}
