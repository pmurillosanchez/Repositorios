/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.dibujo;

/**
 *
 * @author Pablo
 * @date 3 nov 2021
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Dibujo {
    public static String pintaLinea(int n, char c){
        String cadena="";
        for (int i = 0; i < n; i++) {
            cadena+=c;
        }
        return cadena;
    }
    public static String pintaCuadrado(int lado, char c){
        String cadena = "";
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                cadena+=c;
            }
            cadena+="\n";
        }
        return cadena;
    }
    public static String piramide(int altura, char c){
        String cadena = "";
        for (int i = 1; i <= altura; i++) {
            //Espacios en blanco
            for (int j = 1; j <= altura-i; j++) {
                cadena+=" ";
            }
            for(int asteriscos = 1; asteriscos <=(i*2)-1;asteriscos++){
                cadena+=c;
            }
            cadena+="\n";
        }
        return cadena;
    }
    public static String piramideInvertida(int altura, char c){
        String cadena ="";
        for(int j=altura-2 ; j>=0 ; j--){
           for(int i = 0 ; i <altura-j-1;i++)
               cadena+=" ";
           for(int k = 0 ; k < 2*j+1 ; k++)
               cadena+=c;
           cadena+="\n";
       }
        return cadena;
    }
    public static String rombo(int altura, char c){
        String cadena ="";
        cadena +=piramide(altura,c);
        cadena +=piramideInvertida(altura,c);
       return cadena;
    }
}
