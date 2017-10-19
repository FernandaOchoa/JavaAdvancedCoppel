
package javaadvancedoctubre.Martes.interfaces;

interface Drawable2{
    void draw2();
}
class Rec implements Drawable2{
    public void draw2(){
        System.out.println("Drawing a rectangle");
    }
}
class Circ implements Drawable2{
    public void draw2(){
        System.out.println("Drawing a circle");
    }
}
public class Test {
    public static void main(String[] args) {
        Drawable2 d = new Circ();
        d.draw2();
    }
}
