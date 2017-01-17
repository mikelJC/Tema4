/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Introducir una secuencia de 50 números, cuyos valores están comprendidos entre 1 y 10. Queremos saber al final
//que números del 1 al 10 no han sido introducidos.


package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer8 {
    
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    
    int f [] = {1,2,3,4,5,6,8,9,10,8};
    int h [] = {0,0,0,0,0,0,0,0,0,0};
    int i,e;
    
//    leerArray(f);
    
        for(i=0; i<f.length; i++){
            for(e=0; e<11;e++){
                if(f[i]==e){
                    h[e-1]++;
                }
            }
        }
        
        for(i=0;i<h.length;i++){
            System.out.println(h[i]);
        }
        
        for(i=0;i<h.length;i++){
            if(h[i]==0){
                System.out.println("Este número no ha sido introducido: " + i);
            }
        }  
    }

    
//    static void leerArray(int f[]){
//       Scanner tec= new Scanner (System.in);
//        for(int i=0;i<f.length;i++){
//        System.out.println("Introduce un número del 1 al 10" );
//        f[i] = tec.nextInt();
//        }  
//    }
    
    
}
