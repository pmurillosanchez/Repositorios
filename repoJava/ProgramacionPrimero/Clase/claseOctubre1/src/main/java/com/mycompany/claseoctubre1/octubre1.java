/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseoctubre1;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Pablo
 */
public class octubre1 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int dimension = 0 ;
        dimension = sc.nextInt();//
        int matriz2[][] = new int[5][dimension];
        for(int i = 0 ; i<matriz2.length;i++){
            for(int j=0;j<matriz2.length;j++){
                matriz2[i][j]= generarNumAleatorio(0,9);
            }
        }
        
        //int a,b = 0;
        //int resta = 0;
        //a = sc.nextInt();
        //boolean bisiesto = false;
        //bisiesto = esBisiesto(a);
        //System.out.print(bisiesto);
        //b = sc.nextInt();
        //System.out.print(calcularResta(a,b));
        //int array [] = new int[3];
        int matriz[][] = new int[3][3];
        int contador = 0;
        System.out.print(matriz.length);
        for(int i = 0 ; i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=contador;
                contador++;
            }
        }
    }
    public static int generarNumAleatorio(int minimo, int maximo){
        return(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
*/      Scanner sc = new Scanner(System.in);
        int numero = 0;
        int matriz[][]= new int[3][3];
        for(int i = 0 ; i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]= sc.nextInt();
            }
        }
    }
        public static void comprobarFila(Scanner sc, int matriz[][]){
            int fila = 0;
            do{
                System.out.print("elija una fila");
                fila = sc.nextInt();//0
            }while(fila < matriz.length && fila <=0);
            sumaFila(matriz, fila);
        }
        public static int sumaFila(int matriz[][], int fila){
            int suma = 0 ;
            for(int j = 0 ; j<matriz.length;j++){
                suma += matriz[fila][j];
            }
            return suma;
        }

     
        public static int sumaColumna(int matriz[][], int columna){
            int suma = 0;
            for(int i=0; i<matriz.length; i++){
                suma += matriz[i][columna];
            }
            return suma;
        }
        //matriz.length = 3
        public static int sumaDiagonal(int matriz[][]){
            int suma = 0;
            for(int i=0, j=0; i<matriz.length; i++, j++){
                suma += matriz[i][j];
            }            
            return suma;
        }
        public static int sumaDiagonalInversa(int matriz[][]){
            int suma = 0;
            for(int i=0, j=matriz.length; i<matriz.length ; i++, j--){
                suma += matriz[i][j];
            }            
            return suma;
        }
        public static double media(int [][]matriz){
            double media = 0;
            int suma = 0;
            for(int i=0; i<matriz.length; i++){
                for(int j = 0 ; j<matriz.length;j++){
                    suma += matriz[i][j];
                }
            }
            media = suma/matriz.length*matriz.length;            
            return media;
        }
    
    public static int calcularResta(int a, int b){
        int resta = 0;
        if(a>b)
            resta = a-b;
        else
            resta = b-a;
        return resta;
    }
    public static boolean esBisiesto(int anio){
        boolean bisiesto = false;
        if(anio%4==0)
            bisiesto = true;
        else if(anio%100==0)
            bisiesto = false;
        else if(anio%400==0)
            bisiesto = true;
        return bisiesto;
    }
    
    
}
