/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


//Escribir un método que reciba un array y un número entero y devuelva cuántas veces aparece ese número en el
//array.


import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer9 {
    
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    
     int f [] = {1,2,3,4,5,6,8,9,10,8};
     int i;
     int contador=0;
     int numero=8;
     
        for(i=0;i<f.length;i++){
            if(f[i]==numero){
                contador=contador+1;
            }
        }
        
        System.out.println(contador);
        
        
    }
}
