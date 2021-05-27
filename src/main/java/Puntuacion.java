import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class Puntuacion {
    private int puntosTotales;
    private ArrayList<String> arrayPalabras;
    private ArrayList<String> puntos;

    public Puntuacion() {
        puntosTotales = 0;
    }
    
    
    public void agregaPuntos(String palabraIngresada, boolean siEsVerdadero)
    {
        arrayPalabras=new ArrayList();
        puntos=new ArrayList();
        arrayPalabras.add(palabraIngresada);
        if(siEsVerdadero){
            puntos.add("+1");
            puntosTotales++;
        }else{
            puntos.add("-1");
            puntosTotales--;
        }
    }
    
     public void mostrarResultado()
     {
       System.out.println("La puntuacion y palabras son");
       for(int i=0;i<arrayPalabras.size();i++){
           System.out.println(arrayPalabras.get(i)+":"+puntos.get(i));
       }
       System.out.println("El total de puntos es: "+ puntosTotales);
     }
    
}
