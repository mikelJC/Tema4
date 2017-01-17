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
 * 
 * 
    Escribir un método que saque por pantalla el mayor y el menor elemento de un array que recibe como parámetro.
 * 
 * 
 */
public class Ejer11 {
    
    
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    int f [] = {5,2,3,4,5,6,8,9,10,8};
    int i;
    int menor=f[0], mayor=f[0];
    
        for(i=0;i<f.length;i++){
            if(f[i]<menor){
                menor=f[i];
            }
            if(f[i]>mayor){
                mayor=f[i];
            }
        }
        
        System.out.println(menor);
        System.out.println(mayor);
    }
}
