/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
    /*
        Scanner sc = new Scanner(System.in);
        int dinero = sc.nextInt();
        int apuesta = 0;
        int numeroJugado = 0;
        String color;
        double numRandom =0;
        while(apuesta < dinero && apuesta==-1){
            System.out.print("escriba su apuesta");
            apuesta = sc.nextInt();
            dinero -= apuesta;
            System.out.print("elija un numero");
            numeroJugado = sc.nextInt();
            numRandom = Math.random();
            if(numeroJugado == Math.trunc(numRandom)){
                apuesta *= 10;
            else
                apuesta = 0;
        }
        }
    */    
    }
    public static void piramide(int n){
        for(int i=0; i<n;i++){
            System.out.println();
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
        }
    }
    public void rellenarMatriz(int []datos, int matriz[][]){
        int contador = 0 ;
        if(datos.length < matriz.length * matriz.length){
            System.out.println("No hay datos suficientes");
        }else{
            for(int i=0; i<matriz.length ; i++){
                for(int j=0 ; j<matriz[0].length ; j++){
                    matriz[i][j] =  datos[contador];
                    contador++;
                }
            }
        }
    }
    public void sumaMatriz(int matriz[][]){
        int suma = 0;
        for(int i=0; i<matriz.length ; i++){
            for(int j=0 ; j<matriz[0].length ; j++){
                suma += matriz[i][j];
            }
        }
    }
    public void productoMatriz(int matriz[][]){
        int producto = 0;
        for(int i=0; i<matriz.length ; i++){
            for(int j=0 ; j<matriz[0].length ; j++){
                producto *= matriz[i][j];
            }
        }
    }
    public void traspuesta(int matriz[][]){
        int aux;
        for(int i=0; i<matriz.length ; i++){
            for(int j=0 ; j<matriz[0].length ; j++){
                if(i<j){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }
        }
    }
    public static void cuentaLetras(String cadena){
        int contador = 0;
        cadena = cadena.toLowerCase();
        for(int i =0 ; i < cadena.length() ; i++){
            if(!comprobar(cadena, cadena.charAt(i))){
                System.out.println("le letra "+cadena.charAt(i)+" no se repite");
            }
        }
    }
    public static boolean comprobar(String cadena, char letra){
        boolean esComprobar = false;
        int contador = 0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==letra){
                contador++;
            }
        }
        if(contador>1){
            System.out.print("La letra"+letra+"se repite"+contador);
            esComprobar = true;
        }else{
            esComprobar = false;
        }
        return esComprobar;
    }
    public static void quitarEspacios(String cadena){
        int contador = 0;
        cadena = cadena.toLowerCase();
        for(int i =0 ; i < cadena.length() ; i++){
          if(!comprobarEspacios(cadena, cadena.charAt(i))){
              
          }
        }
    }
    public static boolean comprobarEspacios(String cadena, char espacio){
        espacio = "";
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==espacio){
                
            }
        }
    }
    public static String eliminaEspacios(String cadena){
        String cadenaSinEspacios = "";
        int i=0,j;
        j = 0;
        while(j!=0){//-1
            j = cadena.indexOf(" ",i);
            if(j!=0){
                cadenaSinEspacios += cadena.substring(i,j);
                i = j+1;//0, 4
            }else{
                cadenaSinEspacios += cadena.substring(i, cadena.length());
            }
        }
        return cadenaSinEspacios;
    }
    System.out.println(text.replaceAll("\\s",""));
    
}
