//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package examencuarentena;

public class Nodo {
    public Nodo Siguiente;
    private int Data;
    
    public Nodo(Nodo Sig, int Data){
    this.Siguiente= Sig;
    this.Data=Data;
    }
    
    public int obtenerData(){
    return Data;
    }
    public void ColocarData(int Data){
    this.Data=Data;
    }
    
    public String toString(){
    
    return "Data: "+Data;
    }

}
