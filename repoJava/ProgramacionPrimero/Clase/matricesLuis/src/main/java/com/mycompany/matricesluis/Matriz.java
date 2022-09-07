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
public class Matriz {
    private final int[][] valores;
    private final int dimensionCol;
    private final int dimensionFil;
    public Matriz(int dimensionCol, int dimensionFil){
        this.valores = new int[dimensionCol][dimensionFil];
        this.dimensionCol = dimensionCol;
        this.dimensionFil = dimensionFil;
    }
    public int getDimensionCol(){
        return dimensionCol;
    }
    public int getDimensionFil(){
        return dimensionFil;
    }
    public void setValor(int i, int j, int valor){
        this.valores[i][j] = valor;
    }
    public int getMatriz(int i, int j){
        if(i<0 || i>=valores.length || j>=valores.length)
            throw new Error("matriz creada incorrectamente");
        return valores[i][j];
    }
    public void imprimirMatriz(){
        for (int i = 0; i < this.dimensionFil; i++) {
            for (int j = 0; j < this.dimensionCol; j++) {
                System.out.print(valores);
            }
            System.out.println();
        }
    }
    public int[][] mulMatrices(int matrizA[][], int matrizB[][]){
        int matrizSol[][] = new int[matrizA.length][matrizB[0].length];
        int col= 0;
        int aux = 0;
        int j=0;
        for (int i = 0; i < matrizSol.length ; i++) {
            i = aux;
            if(col<matrizSol.length && j!= matrizSol.length){
                matrizSol[i][j] += matrizA[i][col] * matrizB[col][i];
                col++;
            }else if(col==matrizSol.length && j!=matrizSol.length){
                j++;
                col = 0;
            }else
                aux++;
                j = 0;
        }      
        return matrizSol;
    }
}
