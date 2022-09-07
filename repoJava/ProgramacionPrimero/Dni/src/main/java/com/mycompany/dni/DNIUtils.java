/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.dni;

/**
 *
 * @author Pablo
 * @date 11 ene 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class DNIUtils {
    //boolean esDNIVALIDO(String Dni) 7-8 caracteres, que solo tenga digitos, utilizar trim para quitar espacios
    //char obtenerLetraDNI(String dni) dividir entre 23 el numero, el resto me da un numero en entre 0-22, me da la posicion de un array para sacar la letra
    final static char[] LETRAS={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    public static boolean esDniValido(String dni){
        boolean comprobar = false;
        char letra;
        dni = dni.trim();
        if(dni.length() == 8){
            comprobar = true;
            for(int i = 0 ; i < dni.length() && comprobar ; i++){
                letra = dni.charAt(i);
                if(!Character.isDigit(letra))
                    comprobar = false;
            }
        }
        return comprobar;
    }
    public static char obtenerLetraDNI(String dni){
        return LETRAS[Integer.parseInt(dni)%23];
    }
    public static char obtenerLetraDNI(int dni){
        return LETRAS[dni%23];
    }
}
