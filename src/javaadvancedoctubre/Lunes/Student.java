/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package javaadvancedoctubre.Lunes;

public class Student {
    int id;
    String nombre;
    int edad;
    
    //Default
    Student(){  System.out.println("Soy un Constructor ");  }
    
    //Con 2 parametros
    Student(int i, String n){
        id= i;
        nombre = n;
    }
    //Con 3 parametros
    Student (int a, String b, int c){
        id = a;
        nombre = b;
        edad = c;
    }
    void display(){  System.out.println(id+" "+nombre);  }
    
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student(111, "Sofia");
        Student student3 = new Student(222, "Paloma", 21);
        
        student.display();
        student2.display();
        student3.display();
    }
}
