/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

//Modificar la función ya vista en clase de fibonacci para que almacene cada uno de los términos calculados en una
//posición de un array.

public class Ejer10 {
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    int largo;
    int i;
    
    
    System.out.println("di el largo del array de fibonacci");
    largo= tec.nextInt();
    
    int h [] = new int [largo];
    h[0]=0;
    h[1]=1;
    
        for(i=2;i<h.length;i++){
            h[i]=h[i-2]+h[i-1];
            System.out.print(h[i]+" ");
        }
    
    } 
}
