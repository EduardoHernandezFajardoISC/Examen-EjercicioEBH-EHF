//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package examencuarentena;
public class SubdesbordamientoPila extends Exception{

    public SubdesbordamientoPila(){
        super("No se puede sacar elementos de una pila vacia");
    }

}