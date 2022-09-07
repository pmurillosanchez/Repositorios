/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraysclase;

/**
 *
 * @author Pablo
 */
public class Ejercicio4_1PDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayPositivos = {1,3,1,34,1,4,5,1,3,4,5,6,1,3,5,7,4,3,3,2};
        media5en5(arrayPositivos);
    }
    public static void media5en5(int[] arrayPositivos){
        int contador = 1;
        int suma=0;
        for (int i = 0; i < arrayPositivos.length; i++) {        
            suma+=arrayPositivos[i];
            if(contador%5!=0)
                System.out.print(arrayPositivos[i]+" ");
            else{
                System.out.println("Media="+suma/5);
                suma=0;
            }
            contador++;
        }
    }
    
    
}
