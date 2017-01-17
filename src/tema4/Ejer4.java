/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Codifica un programa Java que lea un array de 10 elementos e intercambie el elemento mayor con el último.


package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer4 {
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    int num [] = new int [5];
    int pmayor, nummayor, numultimo;
    
    leerArray(num);
    pmayor = posicionmayor(num);
    
    numultimo = num[num.length-1];
    
    num[num.length-1] = num[pmayor];//el valor de mayor en el último
    num[pmayor]= numultimo;
    
    imprimirnum(num);
    }
    
    
static void leerArray(int f[]){
        Scanner tec= new Scanner (System.in);
        System.out.println("Introduce números");
        for(int i=0;i<f.length;i++){
        f[i] = tec.nextInt();
        }
    }
    
    
static int posicionmayor( int f[]){
    
    int pmayor=0;
    
    for(int i=0; i<f.length; i++){
        if(f[i]>f[pmayor]){
            pmayor=i;
        }
    }
    return pmayor;
}

static void imprimirnum( int num[]){

    for(int i=0; i<num.length; i++){
        System.out.println(num[i]);
    }
}

}
