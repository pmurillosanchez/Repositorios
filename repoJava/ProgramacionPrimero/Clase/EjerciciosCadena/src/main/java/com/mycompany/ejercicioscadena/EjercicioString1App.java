/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioscadena;

/**
 *
 * @author Pablo
 */
public class EjercicioString1App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "Estoy seguro de que el universo esta lleno de vida inteligente.";
        cadena +=" Simplemente ha sido demasiado inteligente como para venir aqui";
        //ejercicio
        System.out.println(cadena.length());
        System.out.println(cadena.charAt(7)+" "+cadena.charAt(23));
        System.out.println(cadena.substring(23,31));
        System.out.println(cadena.indexOf("y"));
        System.out.println(cadena.toUpperCase());
        if(cadena.startsWith("E")){
            System.out.println("La cadena empieza por E");
        }else
            System.out.println("Nuestra cadena no empieza por E");
    }
    
}
