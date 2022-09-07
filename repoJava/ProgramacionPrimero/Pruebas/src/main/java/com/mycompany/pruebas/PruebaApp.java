/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pruebas;

import java.util.Calendar;

/**
 *
 * @author Pablo
 * @date 1 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class PruebaApp {
    public static void main(String[] args) {
       Calendar fecha1 = Calendar.getInstance();
       int mes = (int) fecha1.get(Calendar.MONTH) +1 ;
       System.out.println(mes);
      System.out.println("Anio:"+fecha1.get(Calendar.YEAR));
//
//    String contrasenas[]=new String[5];
//        System.out.println(contrasenas.length);
//    imprimirArray(contrasenas);
//    moverContrasenas(contrasenas);
//    imprimirArray(contrasenas);
    }
    public static void moverContrasenas(String[] contrasenas){
        for (int i = 0; i < contrasenas.length-1; i++)
            contrasenas[i]=contrasenas[i+1];
        contrasenas[contrasenas.length-1]="";
}
    public static void imprimirArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
}
