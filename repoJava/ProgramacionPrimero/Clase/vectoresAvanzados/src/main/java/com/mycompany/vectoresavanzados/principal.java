/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vectoresavanzados;

import java.util.Arrays;

/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
         diagonales();
        imprimirGrillas();//ejercicio1
    }
    public static void diagonales(){
        int [][]matriz = new int[7][7];
        for(int i = 0; i<matriz.length ; i++){
            for(int j=0;j<matriz.length;j++){
                if(i!=j){
                    matriz[i][j]=0;
                }else{
                    matriz[i][j]=1;
                }
                
            }
        }
        //imprimirMatriz(matriz);
    }
    public static void imprimirGrillas(){
        String [][]matriz = new String[9][9];
        for(int i=0 ; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
               matriz[i][j]= "-";
            }
        }
        imprimirMatriz(matriz);
    }
    public static void imprimirMatriz(String [][]matriz){
        for(int i = 0; i< matriz.length;i++){
            System.out.print("|");
            for(int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j]);
                if(j!=matriz[i].length-1)
                    System.out.print("|");
            }
            System.out.print("|");
            System.out.print("\n");
        }
    }
}