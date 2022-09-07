/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nov24;

/**
 *
 * @author Pablo
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(moverCaracteres());
    }
    /*
    public static void crearListaCaracteres(){
        String []cadena = new String[93];
        int contador = 25;
        for (int i = 0; i < cadena.length; i++) {
             cadena[i] = new Character((char)++contador).toString();
        }
        imprimirCaracteres(cadena);
    }
    public static void imprimirCaracteres(String cadena[]){
        int contador = 0;
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(cadena[++contador]);
            }
            System.out.println("\n");
        }
    }
    */
    
    public static String moverCaracteres(){
        String cadena ="hola";
        StringBuilder nuevaCadena = new StringBuilder();
        int asciiValue;
        for (int i = 0; i < cadena.length(); i++) {
            asciiValue = cadena.charAt(i) + 1;
            nuevaCadena.append(Character.toChars(asciiValue));
        }
        return nuevaCadena.toString();
    }
}
