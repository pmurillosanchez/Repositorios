/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matricesjosema;

/**
 *
 * @author Pablo
 */
public class DayOneApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] matriz = new double[3][3];
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        for (int i = 0; i < matriz[0].length; i++) {
           calcularMaximo(matriz[i]);
        }
        System.out.println("La suma de la diagonal principal es:"+sumaDiagonal(matriz));
    }
    public static double sumaDiagonal(double[][] matriz){
        double res=0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i==j)
                    res+=matriz[i][j];
            }
        }
        return res;
    }
    public static void calcularMaximo(double[] matriz){
        double max=0.0;
        for (int i = 0; i < matriz.length; i++) {
            if(max<matriz[i]){
                max=matriz[i];
            }
        }
        System.out.println("La temperatura maxima es "+max);
    }
    public static void rellenarMatriz(double[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=Math.random()*(matriz.length*matriz[0].length);
            }           
        }
    }
    public static void imprimirMatriz(double[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("("+matriz[i][j]+")");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
    
}
