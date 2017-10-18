
package javaadvancedoctubre.Lunes;
/*
La palabra reservada static es principalmente usada
para la administracion de memoria.
La palabra static puede referirse a:

1.- variable
2.- metodo
3.- bloque
4.- clases anidadas

*/

public class Estudiante {
    int matricula;
    String nombre;
    String msg="";
    static String escuela="ITL";
    
    Estudiante(int matricula, String nombre){
        this.matricula = matricula;
        this.nombre = nombre;
    }
    void display(){ 
        msg+="matricula: "+matricula;
        msg+="\nnombre: "+nombre;
        msg+="\nescuela: "+escuela;
        System.out.println(msg);  
    }
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111, "david");
        Estudiante s2 = new Estudiante(112, "Desiree");
        
        s1.display();
        s2.display();
    }
}
