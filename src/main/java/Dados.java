
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class Dados {
    /**
     * En esta clase se modela un dado de n lados ademas de un metodo para lanzarlo
     */
    protected int caras=6;//numero de caras del dado, se puede observar cuantas son
    protected int numero;//el valor de la cara que esta arriba 

    /**
     * constructor de la clase dados
     * @param lados 
     * @param numero
     */
    public Dados() {
      numero=0;
    }
    
    /**
     * simula el lanzamiento del dado
     */
    public void lanzar()
    {
        Random aleatorio=new Random();
        numero=aleatorio.nextInt(caras);
    }
}
