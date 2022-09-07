/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contarvalores;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ContarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tecleado=sc.next();
        char []letras = tecleado.toCharArray();
        char []conjuntoLetras = letrasDiferentes(letras);
        mostrarRepeticion(letras,conjuntoLetras);
    }
    public static char[] crearArrayLetras(){
        Scanner sc = new Scanner(System.in);
        StringBuilder cadena = new StringBuilder();
        char tecleado = sc.next().charAt(0);
        while(tecleado != 'x'){
            cadena.append(tecleado);
            tecleado = sc.next().charAt(0);
        }
        return cadena.toString().toCharArray();
    }
    public static char[] letrasDiferentes(char []letras){
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < letras.length ; i++) {
            if(!comprobarCaracteres(cadena.toString().toCharArray(), letras[i])){
                cadena.append(letras[i]);
            }
        }
        return cadena.toString().toCharArray();
    }
    public static boolean comprobarCaracteres(char []letras, char letra){
        boolean comprobar = false;
        for (int i = 0; i < letras.length && !comprobar; i++) {
            if(letras[i]==letra)
                comprobar = true;
        }
        return comprobar;
    }
    public static void mostrarRepeticion(char []cadena, char []letras){
        for (int i = 0; i < letras.length; i++) {
            System.out.print("La "+letras[i]+" aparece:"+ contarCaracteres(letras[i], cadena)+" veces");
            System.out.println();
        }
        
    }
    public static int contarCaracteres(char letra, char cadena[]){
        int contador = 0;
        for(char caracter : cadena){
            if(caracter==letra)
                contador++;
        }
        return contador;
    }
    
}
