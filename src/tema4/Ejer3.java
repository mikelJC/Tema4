 

//Codifica un programa Java que lea las temperaturas del mes de Enero y calcule y visualice:
//- Temperatura media
//- La temperatura más baja
//- Cuantos días han tenido temperaturas superiores a la media





package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer3 {
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    int i=0;
    double dias, menor, media;
    double temperaturas [] = new double [10];
    
        leerTemperaturas(temperaturas);
        media = temperaturaMedia(temperaturas);
        menor = temperaturaBaja(temperaturas);
        dias = mayorMedia(temperaturas, media);
        
        
        System.out.println("La media es: "+media);
        System.out.println("La temperatura más baja es: "+menor);
        System.out.println("Cantidad de días superiores a la media: "+dias);
    }
    
    
    
    static void leerTemperaturas(double t[]){
        Scanner tec= new Scanner (System.in);
        for(int i=0;i<t.length;i++){
        System.out.println("Introduce la temperatura del "+ (i+1) +" de Enero" );
        t[i] = tec.nextDouble();
        }
    }
    
    
    
    static double temperaturaMedia(double t[]){ 
         double suma = 0, sumamedia;
         for(int i=0; i<t.length;i++){
            suma=suma+t[i];
         }
         sumamedia = suma/t.length;
         return sumamedia;
    }
    
    
    
    
    static double temperaturaBaja(double t[]){
        double menor;
        int pmenor=0;
        menor = t[0];
        for(int i=0; i<t.length; i++){
            if(t[i] <menor){
            menor=t[i];
            pmenor=i;
            }
        }
        return t[pmenor];
    }
    
    
    static double mayorMedia(double t[], double media){
        int contador=0;
        for (int i=0; i<t.length;i++){
         if(t[i]>media){
             contador++;  
         }
        }
        return contador;
    }
    
    
    
}
