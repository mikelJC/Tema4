/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Codifica un programa Java que lea un array de 15 elementos y visualice la suma de los elementos que ocupan la
//posición par. ( 0, 2, 4 … )

package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer1 {
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    int i=0;
    int f [] = new int [15];
    int sumap;
    
    System.out.println("Introduce un array de 15 digitos");
    
    leerArray(f);
    sumap = sumarpares(f);
    }
    
    
    
    
    
    static void leerArray(int f[]){
        Scanner tec= new Scanner (System.in);
        for(int i=0;i<f.length;i++){
        System.out.println("Introduce un número" );
        f[i] = tec.nextInt();
        }  
    }
    
    
    static int sumarpares (int f[]){
        int suma=0;
        
        for(int i=1; i<f.length; i=i+2){
         suma= suma+f[i];
        }
        return suma;
    }
    
    
    
    
}