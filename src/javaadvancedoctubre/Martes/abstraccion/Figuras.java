package javaadvancedoctubre.Martes.abstraccion;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
public class Figuras {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
