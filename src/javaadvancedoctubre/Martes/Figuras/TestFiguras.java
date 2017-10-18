
package javaadvancedoctubre.Martes.Figuras;

class Shape{
    void draw(){
        System.out.println("Drawing....");
    }
}
class Rectangle extends Shape {
    void draw(){
        System.out.println("Dibujando un rectangulo");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("Dibujando un circulo");
    }
}

class Triangle extends Shape {
    void draw(){
        System.out.println("Dibujando un triangulo");
    }
}
public class TestFiguras {
    public static void main(String[] args) {
        Shape s;
        s= new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
