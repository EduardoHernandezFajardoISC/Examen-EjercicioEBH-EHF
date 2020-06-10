//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package examencuarentena;

public class PilaHil {
  private int Esquina[];
    private int indice;

   
    public PilaHil(int n){
       
        Esquina = new int[n];
        indice=0;
    }
    public void apilar(int num)throws DesbordamientoPila{
        if(this.llena()){
            throw new DesbordamientoPila();
        }
        Esquina[indice]=num;
        indice++;
    }

    public int sacar()throws SubdesbordamientoPila{

        if (this.vacia()){
            throw new SubdesbordamientoPila();
        }
        int esacar;
        esacar=Esquina[indice-1];
        indice--;
  
        return esacar;
    }

    public boolean vacia(){
        if(indice==0){
            return true;
        }
        return false;


    }

    public boolean llena(){
        if(indice==Esquina.length){
            return true;
        }
        return false;

    }

    public int capacidad(){
        return Esquina.length;
    }

    public int cantidad(){
        return indice-1;
    }
  
}
