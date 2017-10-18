
package javaadvancedoctubre.Lunes;
/*
Constructor: Artefacto utilizado para inicializar los objetos
Es un conjunto de instrucciones diseñadp para inicializar una 
instancia de una clase.
En su declaracion o encabezado puede aceptar paramentros.

Bob b = new Bob();
Bob() <- Hace referencia al constructor por omision

Antes de su ejecucion, bob, es nul; al dinal de la llamada "bob"
es un apuntador a un objeto (referencia) con espacio reservado
en RAM para contener sus valores de atributos y sus apuntadores a 
metodos.

¿por que el constructor no es un metodo?
No se puede llamar al constructor usando el operador de indireccion
Carece de un valor de retorno distinto a un apuntador
No puede ser REDEFINIDO()
No puede ser declarado con un TYPE
*/

public class Bob {
    Bob(){
        System.out.println("Soy bob el constructor");
    }
}
