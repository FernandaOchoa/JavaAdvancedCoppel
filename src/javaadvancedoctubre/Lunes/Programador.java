
package javaadvancedoctubre.Lunes;
/*
Herencia: Es un mecanismo que permite que un objeto adquiera
todas las propiedades y comportamientos de un objeto padre.

La idea de la herencia es que puedas crear nuevas clases a partir
de las ya existentes.

Existen diversas clasificaciones de relacion en la herencia:

Relaciones entre clases: Asociacion, Composicion, Agregacion
y Herencia.

Hay un termino que permite distinguir los distintos tipos
de relaciones, llamado ACOPLAMIENTO.

*- Medida de dependencia que hay entre 2 modulos,
existen grados de acoplamiento (bajo/alto).
*- Cada clase y metodo hace una sola cosa y la hace bien
(COHESION), Numero de tareas que tiene cada clase o metodo.

Es deseable que 2 o mas modulos de un programa mantengan
alta cohesion y bajo acoplamiento.

Relaciones entre clases:
Asociacion (Es Un): Cuando entre 2 o mas classes se da una
interaccion que no modifica en nada el comportamiento de los
objetos antes o despues de terminada la relacion.
La asociacion es un modo de interaccion entre objetos donde
uno utiliza los servicios de otro a corto plazo.

La asociacion es una relacion de objetos debilmente acoplados.

Agregacion (Tiene UN): Es una relacion entre objetos que
afecta el comportamiento entre llos, mientras que dura la
relacion. Es decir, un objeto depende de los revicios de
otro a largo plazo.

Composicion (Contiene un): Cuando un objeto complejo usa otros
objetos permanentemente. La composicion es una relacion entre
objetos cuya escencia tiene sentido solo cuando ellos estan
acoplados.
Por ultimo podemos decir que la composicion es un tipo de
agregacion a muy largo plazo.

Herencia: Cuando un objeto tiene las caracteristicas de otro
permanentemente, tendremos una relacion entre objetos
intimamente acoplaos cuya existencia depende de un ancestro
padre.

*/

class Empleado {
    float salario = 40000;
}

public class Programador extends Empleado{
    int bono = 10000;
    
    public static void main(String[] args) {
        String msg="";
        Programador p = new Programador();
        msg+="El salario del programador es "+p.salario;
        System.out.println(msg);
        System.out.println("El bono es: "+p.bono);
    }
}
