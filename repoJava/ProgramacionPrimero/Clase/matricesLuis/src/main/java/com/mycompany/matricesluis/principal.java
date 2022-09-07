/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matricesluis;

/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        int matrizA[][] = rellenarMatriz();    
        int matrizB[][] = rellenarMatriz();
        int matrizSol[][] = mulMatrices(matrizA, matrizB);
        System.out.println("MatrizA\n"+imprimirMatriz(matrizA));
        System.out.println("MatrizB\n"+imprimirMatriz(matrizB));
        System.out.println("Matriz Solucion\n"+imprimirMatriz(matrizSol));
    }
    public static int[][] rellenarMatriz(){
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = (int) Math.round(Math.random()*9);
            }
        }
        return matriz;
    }
        public static int[][] mulMatrices(int matrizA[][], int matrizB[][]){
        int matrizSol[][] = new int[matrizA.length][matrizB[0].length];
        int col= 0;
        int aux = 0;
        int j=0;
        for (int i = 0; i < matrizSol.length ; i++) {
            i = aux;
            if(col<matrizSol.length){
                matrizSol[i][j] += matrizA[i][col] * matrizB[col][i];
                col++;
            }else if(col==matrizSol.length){
                j++;
                System.out.print(j);
                col = 0;
            }else
                j=0;
                aux++;
        }      
        return matrizSol;
    }
    public static String imprimirMatriz(int matriz[][]){
        String res = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                res += matriz[i][j];
            }
            res+="\n";
        }
        return res;
    }
    public static int patata(int num){
        return num;
    }
    
}
