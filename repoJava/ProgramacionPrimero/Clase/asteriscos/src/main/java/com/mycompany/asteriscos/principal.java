/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.asteriscos;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        arbolDeNavidad(8);
        rombo(7);
    }
    public static void piramideRecursiva (int numeroCaracteres, String cadenaDePartida, String cadenaActual) {

        if (cadenaActual.length() == numeroCaracteres) {
            System.out.println("" + cadenaActual);
        }
        else {
            System.out.println("" + cadenaActual);
            cadenaActual = cadenaActual.concat(cadenaDePartida);
            piramideRecursiva(numeroCaracteres, cadenaDePartida, cadenaActual);
        }
    }
    public static void arbolDeNavidad(int n){
        int i,j,k;
        n=10; //Modifica este parámetro si quieres
        for(i=1; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n-(n/2); i++){
            for(j=n+(n/2); j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){
                System.out.print("*");}
            System.out.println("");
        }
    }
    public static void escalera(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void rombo(int n){
       for(int i = 0 ; i < n ; i++){
           System.out.println();
           for(int j = 0 ; j < n-i-1; j++){
               System.out.print(" ");
           }
           for(int j = 0; j < 2*i+1; j++){
               System.out.print("*");
           }
       }
       for(int j=n-2 ; j>=0 ; j--){
           System.out.println();
           for(int i = 0 ; i <n-j-1;i++)
               System.out.print(" ");
           for(int i = 0 ; i < 2*j+1 ; i++)
               System.out.print("*");
       }
    }
}
