
package javaadvancedoctubre.Lunes.simple;

//Herencia Simple
class Animal {
    void eat(){
        System.out.println("comiendo...");
    } 
}  
class Perro extends Animal {
    void ladrar(){
        System.out.println("Ladrando....");
    }
}
class PruebaHerencia{
    public static void main(String[] args) {
        Perro p = new Perro();
        p.eat();
        p.ladrar();
    }
}

