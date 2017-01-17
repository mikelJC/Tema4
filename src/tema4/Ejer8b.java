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
public class Ejer8b {
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    
    int f [] = {1,2,3,4,5,6,8,9,10,8};
    boolean h [] = new boolean [10];
    int i,e;
    
        for(i=1;i<11;i++){                          //recorro del 1-10
           for(e=0;e<f.length;e++){                 //recorro F
               if(f[e]==i && h[i-1]==false){        //si F[e] es igual a i
                h[i-1]=true;                      
               }
           }
        }
    
        for(i=0;i<h.length;i++){
            if(h[i]==false){
                System.out.println(i+1);
            }
        }
    }
}