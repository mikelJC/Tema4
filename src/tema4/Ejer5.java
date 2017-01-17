/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Codifica un programa Java que lea un array con las notas de Programación de 20 alumnos, y que escriba :
//- Nota media de la asignatura.
//- Porcentaje de aprobados
//- Cuantas notas inferiores a 2.
//- Si ha habido algún 10.




package tema4;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer5 {
    public static void main(String[] argm){
        
        
        int notas [] = new int [10];
        double ntmedia, porcentaje;
        int inferiores2, dieces;
        
        leerNotas(notas);
        ntmedia = notamedia(notas);
        porcentaje = porcentajeaprobados(notas);
        inferiores2 = inferioresados(notas);
        dieces =  mayoresde10(notas);
        
        
        System.out.println("nota media: " +ntmedia+
                           "\n porcentaje de aprobados: " +porcentaje+"%"+
                           "\n inferiores a 2: " +inferiores2+
                           "\n numero de Dieces: " +dieces
                                    );
        
        
    }
    
    //Comienza leer
    static void leerNotas(int f[]){
        Scanner tec= new Scanner (System.in);
        System.out.println("Introduce números");
        for(int i=0;i<f.length;i++){
        f[i] = tec.nextInt();
        }
    }
    //Termina leer
    
    //nota medias
    static double notamedia(int f[]){
        double media; 
        int suma=0;
    
        for(int i=0; i<f.length; i++){
            suma= suma+f[i];
        }
        media = suma/f.length;
        
    return media;
    }
    //fin nota media
    
    //porcentajes de aprovados   2,3,7,8,9  2s 3a 5t  3*100/5
    static int porcentajeaprobados(int f[]){
        int porcentaje=0;
        int cont=0;
        
        for(int i=0; i<f.length; i++){
            if(f[i]>=5){
                cont++;
            }
        }
        
        porcentaje = (cont*100)/f.length;
        
    return porcentaje;
    }
    //fin de porcentajes
    
    //cuantas notas inferiores a 2
    static int inferioresados(int f[]){
        int cont=0;
        
        for(int i=0; i<f.length; i++){
            if(f[i]<2){
                cont++;
            }
        } 
    return cont;
    }
    //fin cuantas notas inferiores a 2
    
    //si ha habido algun 10
    static int mayoresde10(int f[]){
        int mayores=0;
        int cont=0;
        
        for(int i=0; i<f.length; i++){
            if(f[i]==10){
                cont++;
            }
        } 
    return cont;
    }
    
    //fin ha habido algun 10
    
}
