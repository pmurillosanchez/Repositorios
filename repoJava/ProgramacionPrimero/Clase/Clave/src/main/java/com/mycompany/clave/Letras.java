/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.clave;

/**
 *
 * @author Pablo
 * @date 3 nov 2021
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Letras {
    public static String generaLetra(int n){
        int longitud;
        int contador = 0;
        String contrasena ="";
        String []letras= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","y","x","z"};
        if(n<8){
            longitud = 8;
        }else{
            longitud = n;
        }
        while(contador<longitud){
            contrasena += letras[(int) (Math.random() * letras.length)];
            contador++;
        }
        return contrasena;
    }
}
