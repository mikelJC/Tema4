/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Codifica un programa Java que lea un array de 10 elementos y busque el menor, indicando la posición donde se
//encuentra.


package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer2 {
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    int num [] = new int [5];
    int pmenor;
    
    leerArray(num);
    pmenor = nummenor(num);

    
    System.out.println("La posición menor es la "+pmenor);
    System.out.println("El valor de la posición es " + num[pmenor-1]);
    
    }
    
    
    static void leerArray(int f[]){
        Scanner tec= new Scanner (System.in);
        for(int i=0;i<f.length;i++){
        System.out.println("Introduce un número" );
        f[i] = tec.nextInt();
        }
    }
    
    static int nummenor ( int f[]){
    
    int pmenor=0;
    
        for(int i=0; i<f.length; i++){
            if(f[i]<f[pmenor]){
                
                pmenor=i;
            }
        }    return pmenor+1;
    }
    
    
}
