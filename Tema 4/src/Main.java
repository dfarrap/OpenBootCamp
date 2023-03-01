import java.nio.channels.WritableByteChannel;
import java.text.spi.NumberFormatProvider;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {
    public static void main(String[] args) {

    // PARTE UNO    
        int numeroif = -1;
        
        if (numeroif < 0){
            System.out.println("es Negativo");
        }else if(numeroif == 0){
            System.out.println("es Cero");
        }else{
            System.out.println("es Positivo");
        } 
    
    
    
        ///PARTE DOS
        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println("While: "+numeroWhile);
            numeroWhile++;
        } 
    
        //PARTE TRES

        do{System.out.println("doWhile: "+numeroWhile);
            numeroWhile++;}
            while(numeroWhile<3);

        //PARTE CUATRO
        
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
                System.out.print("for: "+numeroFor);
        }

        //PARTE CINCO
        String estacion= "OTOÑO";
        switch(estacion){
            case "VERANO": System.out.print("es:"+ estacion);break;
            case "INVIERNO": System.out.print("es:"+ estacion);break;
            case "OTOÑO": System.out.print("es:"+ estacion);break;
            case "PRIMAVERA": System.out.print("es:"+ estacion);break;
            default: System.out.print("no es ninguna estacion conocidad, es: "+ estacion);
        }

    }


}