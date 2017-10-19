package javaadvancedoctubre.Jueves.io;

import java.io.Console;
import java.io.IOException;
//Solo por consola
public class TestIO12 {
    public static void main(String[] args) throws IOException {
        Console c= System.console();
        System.out.println("Escribe tu nombre: ");
        String n = c.readLine();
        System.out.println("Welcome "+n);
    }
}
