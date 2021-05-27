
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class BogglePlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean jugadorJugar=true;
        int idiomaIngresado=idioma();
        Jugador jugador= new Jugador();
        BoggleBox bg= new BoggleBox(idiomaIngresado);
        Puntuacion p=new Puntuacion();
        //agregaPuntos(palabraIngresada,siEsVerdadero);
        System.out.println("bienvenido al juego de boggle");
        do{
            bg.mostrarBoggleBox();
            System.out.println("ingresa la palabra que veas");
            String palabraIngresada=obtenerPalabra();
            if(jugador.ingresoPalabras(palabraIngresada)){
                boolean siSeEncuentra=bg.checarPalabra(palabraIngresada);
                if(siSeEncuentra){
                    System.out.println("La palabra ingresada es correcta");
                }else{
                    System.out.println("La palabra ingresada no se encuentra en el sistema");
                }
                p.agregaPuntos(palabraIngresada, siSeEncuentra);
            }else{
                System.out.println("Estas repitiendo la palabra ingresada, intenta de nuevo");
            }
        System.out.println("Desea seguir jugando?");
        jugadorJugar=seguirJugando();
                
        }while(jugadorJugar);
        p.mostrarResultado();

    }
     public static int idioma() {
         int idiomaNum;
         boolean unoDeDos=false;
        Scanner sc = new Scanner(System.in);
        do{
            idiomaNum=0;
            System.out.println("Ingrese el idioma en el que lo desee jugar");
            System.out.println("(1)Ingles");
            System.out.println("(2)Español");
            idiomaNum=sc.nextInt();
            if(idiomaNum==1 || idiomaNum==2){
                unoDeDos=true;
            }else{
                unoDeDos=false;
                System.out.println("No existe la seleccion!!");
            }
        }while(!unoDeDos);
      return idiomaNum;
    }
     
     private static boolean seguirJugando()
     {
         Scanner input=new Scanner(System.in);
         boolean seguir;
         String palabra=input.nextLine();
         palabra=palabra.toUpperCase();
         if(palabra.contains("SI")){
             seguir=true;
         }else{
             seguir=false;
         }
         return seguir;
     }
     
     private static String obtenerPalabra()
     {
         String palabraIngresada;
         Scanner input=new Scanner(System.in);
         palabraIngresada=input.nextLine();
         return palabraIngresada;
     }
     
    
}
