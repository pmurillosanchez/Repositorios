/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ordenacionbusqueda;

/**
 *
 * @author Pablo
 * @date 13 ene 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Vectores {
    //metodos imprimir con sobrecarga
    public static void imprimirVector(int[] array){
        for(int i : array)
            System.out.print(i);
        System.out.println();
    }
    public static void imprimirVector(double[] array){
        for(double i : array)
            System.out.print(i);
        System.out.println();
    }
    public static void imprimirVector(String[] array){
        for(String i : array)
            System.out.print(i);
        System.out.println();
    }
    public static void imprimirVector(char[] array){
        for(char i : array)
            System.out.print(i);
        System.out.println();
    }
    public static int[] rellenarArrayConUnSoloValor(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
        }
        return array;
    }
    public static double[] rellenarArrayConUnSoloValor(double[] array, double num){
        for (int i = 0; i < array.length; i++) {
            array[i]=num;
        }
        return array;
    }
    public static char[] rellenarArrayConUnSoloValor(char[] array, char caracter){
        for (int i = 0; i < array.length; i++) {
            array[i]=caracter;
        }
        return array;
    }
    
    
}
