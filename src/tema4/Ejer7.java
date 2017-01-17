/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Carga un vector de 15 elementos T(I) y a partir de él crea otro N(J) de 15 elementos de la siguiente forma:
//N(1) = T(1)
//N(2) = T(1) + T(2)
//:
//N(15) = T(1) + T(2) + T(3)+ ….T(15)



package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer7 {
    
    public static void main(String[] argm){
        
        int T [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int N [] = new int [15];
        int i;
        N[0]= T[0];
        
        for( i=1; i<T.length;i++){
                N[i] = T[i]+N[i-1];
        }
        
        
        
        for(i=0;i<N.length;i++){
            System.out.println(N[i]);
        }
        
    }
 
}
