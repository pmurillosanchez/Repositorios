/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vectoresrepaso;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el tamaño del vector 1");
        int tamVector1 = sc.nextInt();
        System.out.println("Dame el tamaño del vector 2");
        int tamVector2 = sc.nextInt();
        int[] vector1 = rellenarVector(tamVector1);
        int[] vector2 = rellenarVector(tamVector2);
        imprimirVector(vector1);
        imprimirVector(vector2);
        int tamMayor=vector2.length;
        int tamMenor=vector1.length;
        if(vector1.length >= vector2.length)
            imprimirVectores(vector1, vector2);
        else
            imprimirVectores(vector2,vector1);
    }
    public static void imprimirVector(int[] vector){
        for (int i : vector) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void imprimirVectores(int[] vector1, int[] vector2){
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i]+" ");
            if(i<vector2.length)
                System.out.print(vector2[i]);
            System.out.println("");
        }
    }
    public static int[] rellenarVector(int tam){
        int[] vector = new int[tam];
        for (int i = 0; i <vector.length; i++) {
            vector[i]=(int) (Math.random() * tam + 10);
        }
        return vector;
    }
    
}
