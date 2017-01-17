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
 * Codifica un programa Java que lea un array de 10 elementos v[ ] .
    • Crea un array nuevo con los 5 primeros elementos del array v[].
    • Visualiza el array v ordenado.
    • Busca un valor en el array ordenado, utilizando la búsqueda binaria.
 */
public class Ejer12 {
        public static void main(String[] argm){
        Scanner tec= new Scanner (System.in);
        
        int v [] = {9,3,1,7,5,4,6,8,10,2}; //posiciones 0,1,2,3,4,5,6,7,8,9
        
        crearArray5(v);
        ordenarArray(v);

        }
        
        static void crearArray5(int v[]){   
            int n[] = new int [5];
            //crear array de los 5 primeros de v[]
            for(int i=0;i<5;i++){
                n[i]=v[i];
            }
            //mostrar array
            for(int i=0;i<n.length;i++){
                System.out.print(n[i]+" ");
            } 
        }
        
        static void ordenarArray(int v[]){

            int i,j;
            int mayor;
            boolean sw = false;
            //mostrar array inicial
            System.out.println("\n Array inicial");
            for(i=0;i<v.length;i++){
                System.out.print(v[i]+" ");
            }
            
            
            //ordena array
            for(i=0;i<v.length && sw==false;i++){
                        sw=true;
                for(j=1;j<v.length-i;j++){
                    if(v[j-1]>v[j]){
                        mayor = v[j-1];
                        v[j-1]=v[j];
                        v[j]=mayor;
                        sw=false;
                    }
                }
            }
        }    
}
