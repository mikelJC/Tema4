/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



//Desarrolla un algoritmo que cargue un vector de 30 elementos y 
//cambie el mayor elemento a la posición del menor
//y el menor a la posición del mayor.

//Desarrolla un algoritmo que cargue un vector de 30 elementos y cambie el mayor elemento a la posición del menor
//y el menor a la posición del mayor.


package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer6 {
    
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    int f [] = {2,1,3,4,5,6,7,9,8};
    int menorp, mayorp, mayor=0;

    mayorp = numeromayor(f);
    menorp = numeromenor(f);
    
    
    mayor = f[mayorp];
    
    f[mayorp] = f[menorp];
    f[menorp] = mayor;
    
        for(int i=0;i<f.length;i++){
            System.out.print(f[i]+",");
        }
    }
    
    
    
    
    
    
    
    static int numeromenor(int f[]){
        int menor=f[0];
        int menorp=0;
        
        for (int i=0; i<f.length; i++ ){
            if(f[i]<menor){
                menor = f[i];
                menorp = i;
            }
        }
        return menorp;
    }
    
    static int numeromayor(int f[]){
        int mayor=0;
        int mayorp=0;
        
        for (int i=0; i<f.length; i++ ){   
            if(f[i]>mayor){
                mayor = f[i];
                mayorp = i;
            }
        }
        return mayorp;
    } 

}
