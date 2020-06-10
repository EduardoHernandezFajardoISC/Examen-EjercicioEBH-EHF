//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package examencuarentena;
import examencuarentena.DesbordamientoPila;
import examencuarentena.SubdesbordamientoPila;

public class PilaDos {
       
    private ListaEnlazada Esquina;
        
    public PilaDos(){
     Esquina=new ListaEnlazada();
    }
    
    public void apilar(int n)throws DesbordamientoPila{
    Esquina.agregarAlInicio(new Nodo(null,n));
    
    }
     
    public Nodo sacar()throws SubdesbordamientoPila{
        
  Nodo esacar= Esquina.EliminarAlInicio();
    return esacar;
    }
    

}
