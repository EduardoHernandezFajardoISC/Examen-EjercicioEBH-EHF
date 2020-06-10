//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package examencuarentena;
import java.util.Random;
import ExamenCuarentena.*;
public class ExamenCuarentena {
 public static void main(String args[]){

       Random Spwaner = new Random();

       PilaMade listaMadera = new PilaMade(30);
       PilaHil listaHilo =new PilaHil(30);
       PilaRes listaResina = new PilaRes(30);
       

        int m=0,h=0,r=0; 
        int mad = 0, hil = 0, res = 0, bas = 0, cue = 0, ca = 0; 

        int mesas=0,bastones=0,cuerdas=0,cañas=0,barcos=0;
        for(int i=1;i<=30;i++){

            System.out.println("------------Dia: "+ i +"-------------");
            
              try{
                int n = Spwaner.nextInt(3);
                if(n == 0){
                    System.out.println("Encontro 1 de madera");
                    listaMadera.apilar(n);
                    mad++;
                    m++;
                }else if(n == 1){
                    System.out.println("Encontro 1 de hilo");
                    listaHilo.apilar(n);
                    hil++;
                    h++;
                }else if(n == 2){
                    System.out.println("Encontro 1 de resina ");
                    listaResina.apilar(n);
                    res++;
                    r++;
                }
                     
                if(mad == 4){
                    listaMadera.sacar();
                    listaMadera.sacar();
                    listaMadera.sacar();
                    listaMadera.sacar();
                    mad = mad - 4;
                    mesas++;
                    System.out.println("Crafteaste una mesa");
                }

                if(mesas== 1 && mad == 2){
                    listaMadera.sacar();
                    listaMadera.sacar();
                    mad = mad - 2;
                    bas++;
                    bastones++;
                    System.out.println("Crafteaste un baston");
                }
               
                if(mesas == 1){
                    if(hil >= 4 && res >= 1){
                        listaHilo.sacar();
                        listaHilo.sacar();
                        listaHilo.sacar();
                        listaHilo.sacar();
                        
                        
                        hil = hil - 4;
                        res = res - 1;
                        cue++;
                        cuerdas++;
                        System.out.println("Crafteaste una cuerda");
                    }
                }

                if(mesas == 1){
                    if(cue >=1 && bas >= 1){
                        cue = cue - 1;
                        bas = bas - 1;
                        ca++;
                        cañas++;
                        System.out.println("Crafteaste una caña");
                    }
                }

                if (mesas == 1 && ca >= 1)
                {
                    ca = ca - 1;
                    barcos++;
                    System.out.println("Has crafteado un barco");
                }

         
                 }catch(DesbordamientoPila err){
                System.out.println(err.getMessage());
            }catch (SubdesbordamientoPila er){
                System.out.println(er.getMessage());
            }
        } 

        System.out.println("--------¡Usted obtuvo!------[minecraft dungeons]");
        System.out.println("Madera " + m);
        System.out.println("Resina " + r);
        System.out.println("Hilo " + h);
        System.out.println();
        System.out.println("----------¡Usted crafteo!----------[minecraft dungeons]");
        System.out.println("Cañas "+cañas);
        System.out.println("Mesas "+mesas);
        System.out.println("Bastones "+bastones);
        System.out.println("Cuerdas "+cuerdas);
        System.out.println("Barcos "+barcos);
        System.out.println("Es hora de que salgas a a aventura con tus herramientas, ¡suerte viajero!");
    } 

}
