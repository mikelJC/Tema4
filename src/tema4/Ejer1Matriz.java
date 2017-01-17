/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer1Matriz {
    public static void main (String[] argm){
     Scanner tec= new Scanner (System.in);
    
    int m [][] = new int[10][10];
     
    rellenar(m);
    visualizarmatriz(m);
    diagonal(m);
    sumafila(m);
    filasietecero(m);
    visualizarmatriz(m);
    
    
    
    }
    
//METODO 1
    static void rellenar (int m[][]){
        Random rng = new Random();
        
        for(int f=0;f<m.length;f++){
            for(int c=0;c<m[f].length;c++){
                m[f][c]=(int)(rng.nextDouble() *10+0);
            }        
        }
    }
//METODO 2   
    static void visualizarmatriz (int m[][]){
        for(int f=0;f<m.length;f++){
            for(int c=0;c<m[f].length;c++){
            System.out.print(m[f][c]);
        }
        System.out.println("");          
        }
    }
//METODO 3  
    static void diagonal(int m[][]){
        for(int f=0;f<m.length;f++){
            for(int c=0;c<m[f].length;c++){
                if(f==c){
                System.out.print(m[f][c]+" ");
                }else{
                System.out.print("X ");
                }
            }
        System.out.println("");
        }
    }
//METODO 4
    static void sumafila(int m[][]){
        int suma=0;
    
        for(int f=0;f<m.length;f++){
            for(int c=0;c<m[f].length;c++){
                suma=suma+m[f][c];
            }
        System.out.println(" ="+suma);
        suma=0;
        }
    }
//METODO 5
    static void filasietecero(int m[][]){
        for(int f=0;f<m.length;f++){
            for(int c=0;c<m[f].length;c++){
                if(f==6){
                    m[f][c]=0;
                }
            }      
        }
    }
    
    
    
    
}
