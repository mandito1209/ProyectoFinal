
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class Jugador {
    
    HashSet palabrasGuardadas=new HashSet<>();

    public Jugador() {
        
    }
    //se pide al usuario el ingreso de una palabra
        public boolean ingresoPalabras(String palabra){
            boolean siGuarda;
            palabra=palabra.toUpperCase();
            if(palabrasGuardadas.add(palabra)){
                siGuarda=true;
            }else{
                siGuarda=false;
            }
            return siGuarda;
        }
    
}
