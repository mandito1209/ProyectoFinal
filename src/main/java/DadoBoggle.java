/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class DadoBoggle extends Dados {
    private String letras;
    public DadoBoggle(String letras) {
        //super(caras, numero);
        this.letras=letras;
    }
    
    //@Override
    public String getCara() {
        return letras.substring(numero,numero+1); 
    }

    @Override
    public String toString()
    {
        return letras.substring(numero,numero+1); 
    }
    
    
}
