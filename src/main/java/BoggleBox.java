
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class BoggleBox {
    String array2D[][]=new String[5][5];
   ArrayList<DadoBoggle> arrayBoggle=new ArrayList();
   String[] arrayPalabrasIngles= new String[] {"QBZJXK", "TOUOTO","OVWGR","AAAFSR","AUMEEG","HHRLDO","NHDTHO","LHNROD","AFAISR","YIFASR","TELPCI","SSNSEU","RIYPRH","DORDLN","CCWNST","TTOTEM","SCTIEP","EANDNN","MNNEAG","UOTOWN","AEAEEE","YIFPSR","EEEEMA","ITITIE","ETILIC"};
   String[] arrayPalabrasEspañol= new String[] {"QBZJXL","TOUOTO","OVCRGR","AAAFSR","AUMEEO","EHLRDO","NHDTHO","LHNROD","ADAISR","UIFASR","TELPCI","SSNSEU","RIYPRH","DORDLN","CCÑNST","TTOTEM","SCTIEP","EANDNN","MNNEAG","UOTOÑN","AEAEEH","YIFPSR","EEEEMA","ITATIE","ETILAC"};
    public BoggleBox(int idioma)
    {
        
         switch(idioma)
    {
        case 1: 
            for(int i=0;i<25;i++)
            {
                DadoBoggle tempIngles=new DadoBoggle(arrayPalabrasIngles[i]);
                tempIngles.lanzar();
                arrayBoggle.add(tempIngles);
            }
            break;
        case 2: 
            for(int i=0;i<25;i++)
            {
                DadoBoggle tempEspañol=new DadoBoggle(arrayPalabrasEspañol[i]);
                tempEspañol.lanzar();
                arrayBoggle.add(tempEspañol);
            }
            break;
        default:
            System.out.println("Error, no existe esa opcion");
    }
         Collections.shuffle(arrayBoggle);
         for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
                 int num=(j*5)+i;
                 DadoBoggle tempString=arrayBoggle.get(num);
                 array2D[i][j]=tempString.getCara();
             }
         }
    }
    
   public void mostrarBoggleBox()
   {
       for(int i=0;i<array2D.length;i++){
             for(int j=0;j<array2D.length;j++){
            System.out.print(array2D[i][j]+" ");
             }
             System.out.println();
   }
    
}
   
   public boolean checarPalabra(String palabra)
   {
       boolean siVerifica=false;
       ArrayList<String> arrayPalabrasBoggle=new ArrayList();
       palabra=palabra.toUpperCase();
       for(int i=0;i<5;i++){
           StringBuffer sb= new StringBuffer();
           for(int j=0;j<5;j++){
               int numTemp=(j*5)+i;
               sb=sb.append(arrayBoggle.get(numTemp).getCara());
           }
           arrayPalabrasBoggle.add(sb.toString());
       }
        for(int i=0;i<5;i++){
           StringBuffer sb= new StringBuffer();
       for(int j=0;j<5;j++){
               int numTemp=(i*5)+j;
               sb=sb.append(arrayBoggle.get(numTemp).getCara());
           }
           arrayPalabrasBoggle.add(sb.toString());
       }
      for(int i=0;i<arrayPalabrasBoggle.size();i++)
      {
          if(palabra.contains(arrayPalabrasBoggle.get(i))){
              siVerifica=true;
          }
      }
       return siVerifica;
   }
}
