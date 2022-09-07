/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recursividad;

/**
 *
 * @author Pablo
 */
public class EjemploApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimeR(10);
        decToBin(4);
    }
    public static void imprimeR(int numeros){
        System.out.println(numeros);
        if(numeros > 1){
            imprimeR(--numeros);
        }
    }
    public static int factorialRecursivo(int numero){
        int res = 1;
        if(numero!=0)
            res = numero*factorialRecursivo(numero-1);
        return res;
    }
    public static void decToBin(int numero){
        if(numero>1)
            decToBin(numero/2);
        System.out.print(numero%2);
    }
}
