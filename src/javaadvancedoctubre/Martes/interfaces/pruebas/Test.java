
package javaadvancedoctubre.Martes.interfaces.pruebas;

import javaadvancedoctubre.Martes.interfaces.Drawable;
import javafx.scene.shape.Circle;

public class Test {
    public static void main(String[] args) {
        Drawable d = (Drawable) new Circle();
        d.draw();
    }
}
