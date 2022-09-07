/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenacionbusqueda;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Pablo
 */
public class TestOrdenaBuscaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el tamaño del vector\n");
        int tamanio = sc.nextInt();
        int[] vectorRellenado = rellenarVectorRandom(tamanio);
        int[] vectorCopia1 = copiaVector(vectorRellenado);
        int[] vectorCopia2 = copiaVector(vectorRellenado);
        busquedaSecuencialPosicionValor(vectorRellenado,2);
        Arrays.sort(vectorRellenado);
        imprimirVector(vectorRellenado);
        ordenarBurbuja(vectorCopia1);
        imprimirVector(vectorCopia1);
        quickSort(vectorCopia2, 0, vectorCopia2.length-1);
        imprimirVector(vectorCopia2);
        if(esIgual(vectorRellenado, vectorCopia1) && esIgual(vectorRellenado, vectorCopia2)){
            System.out.println("Todos los metodos me ordenan el vector correctamente");
        }else
            System.out.println("Hay algo que falla");
        
    }
    //rellenamos nuestro vector
    public static int[] rellenarVectorRandom(int tamanio){
        int[] array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*tamanio);
        }
        return array;
    }
    public static int[] copiaVector(int[] array){
        int[] arrayCopia = new int[array.length];
        System.arraycopy(array, 0, arrayCopia, 0, array.length);
        return arrayCopia;
    }
    public static void busquedaSecuencialPosicionValor(int[] array,int valor){
        int posicion=-1;
        boolean encontrado=false;
        for (int i = 0; i < array.length && !encontrado ; i++) {
            if(array[i]==valor){
                encontrado = true;
                posicion = i;
            }
        }
        if(posicion==-1){
            System.out.println("Valor no encontrado");
        }else{
            System.out.println("La posicion: "+posicion);
        }
    }
    public static void ordenarBurbuja(int[] array){
        boolean intercambio = true;
        int aux = 0;
        while(intercambio){
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i+1]){
                    array[i] = aux;
                    array[i] = array[i+1];
                    array[i+1]=aux;
                }
            }
        }
        
    }
    public static int[] quickSort(int[] array, int izq, int der){
        int pivote = array[izq];
        int i=izq;
        int j=der;
        int aux;
        while(i<j){
            while(array[i]<=pivote && i < j){
                i++;
            }
            while(array[j]>pivote){
                j--;
            }
            if(i<j){
                aux=array[i];
                array[i]=array[j];
                array[j]=aux;
            }
        }
        array[izq]=array[j];
        array[j]=pivote;
        if(izq < j - 1)
            quickSort(array,izq,j-1);
        if(j+1 < der)
            quickSort(array,j+1,der);
        return array;
    }
    public static boolean esIgual(int[] array1, int[] array2){
        boolean comprobar = true;
        for (int i = 0; i < array1.length && comprobar; i++) {
            if(array1[i]!=array2[i])
                comprobar = false;
        }
        return comprobar;
    }
    public static int busquedaRecursivaBinaria(int array[], int num, int izq, int der){
        int pos=-1;
        int mid = (izq+der)/2;
        if(num==array[mid])
            pos = mid;
        else if(num<array[mid])
            pos = busquedaRecursivaBinaria(array,num,izq,pos-1);
        else if(num>array[mid])
            pos=busquedaRecursivaBinaria(array,num,pos+1,der);
        return pos;

    }
    public static void imprimirVector(int[] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
//    for (int i = 0; i < matriz[0].length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                for (int k = 0; k < matriz[0].length; k++) {
//                    for (int l = 0; l < matriz.length; l++) {
//                        if(matriz[j][i]<matriz[l][k]) {
//                            aux = matriz[j][i];
//                            matriz[j][i] = matriz[l][k];
//                            matriz[l][k] = aux;
//                        }
//                    }
//                }
//            }
//        }
}
