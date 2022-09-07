/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clases;

/**
 *
 * @author Pablo
 */
public class MatricesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int[] multiplicacionInversa(int[] vector, int[] vector1){
        int multiplicado[] = new int[vector.length];
        for (int i = 0; i < vector.length ; i++) {
            multiplicado[i]=vector[i]*vector1[vector.length-i-1];
        }
        return multiplicado;
    }
}
