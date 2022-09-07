/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.octubre9;
import java.util.*;


/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        valor = sc.nextInt();
        numeroIndicado(valor);
    }
    //ejercicio1:escribe un programa que me devuelva la posicion de un numero indicado

    public static int[] numeroIndicado(int valor){
        //3 4 3 1 2 6 4
        int array[] = new int[7];
        int arraySolucion[] = new int[array.length];
        int contador = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]==valor){
                arraySolucion[contador] = i;
                contador++;
            }else{
                arraySolucion[contador]= -1;
                contador++;
            }
        }
        return arraySolucion;
    }
    //ejercicio2:escribe un programa que me devuelva que valores estan repetidos dentro de un array
    //escribe un programa que me devuelva el primer valor repetido dentro de un array
    public static int[] numeroRepetido(){//-1, 3, 4
        int array[] = new int[7];
        int arraySolucion[] = new int[array.length*array.length];
        int contador = 0;
        for(int i = 0; i<array.length;i++){
            //3 4 3 1 2 6 4 2
            for(int j=0;j<array.length;j++){
                    if(array[i]==array[j]){
                        arraySolucion[contador]= array[i];
                        contador++;
                    }else{
                        arraySolucion[contador]=-1;
                        contador++;
                    }
            }
        }
        return arraySolucion;//-1,-1, 3,4,2
    }
    public static int calcularDimension(int array[]){
        int contador = 0;
        for(int i = 0; i<array.length; i++){
                if(array[i]!=-1)
                    contador++;
    } return contador;
    }
    public static int[] imprimirSolucion(int solRellena[], int dimension){
        int sol[] = new int[dimension];
        int contador = 0;
        for(int i=0; i<solRellena.length;i++){
            if(solRellena[i]!=-1){
                sol[contador]=solRellena[i];
                contador++;
            }
        }
        return sol;//3,4,2
    }
    
    //ejercicio3:escribe un programa que me devuelva los numeros comunes entre dos arrays
    public static int[] numerosComunes(int arrayA[], int arrayB[]){
        int[] sol = new int[arrayA.length];
        int contador = 0;
        for(int i=0;i<arrayA.length; i++){
            for(int j=0;j<arrayB.length;j++){
                if(arrayA[i]==arrayB[j]){
                    sol[contador]=arrayA[i];
                    contador++;
                }else{
                    sol[contador]=-1;
                    contador++;
                }
            }
        }
        return sol;
    }
    
    //ejercicio4: escribe un programa que ponga a 0 los duplicados dentro de un array
    
    //ejercicio5: escribe un programa que me devuelva la resta entre el numero mas grande y el numero mas pequeño
    
    //ejercio6: escribe un programa que chequee si un array contiene 0 o -1
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
