/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenacion;

/**
 *
 * @author Pablo
 */
public class BubbleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio 1
//        int[] array = {10,2,8,5};
//        int[] arrayOrdenado = ordenacionBurbuja(array);
//        imprimirArray(arrayOrdenado);
        int array[] = rellenarVectorRandom(10000);
        long tOriginal = medirTiempo();
        int[] arrayMejorado = ordenacionMejorado(array);
        long tFinal = medirTiempo();
        imprimirArray(arrayMejorado);
        System.out.println("Ha tardado el algoritmo mejorado: "+(double)(tFinal-tOriginal)/1000+"s");
        tFinal = medirTiempo();
        int[] arrayMejoradoBurbuja = ordenacionBurbuja(array);
        long tFinal2 = medirTiempo();
        imprimirArray(arrayMejoradoBurbuja);
        System.out.println("Ha tardado el algoritmo de la burbuja: "+(double)(tFinal-tOriginal)/1000+"s");
    }
    public static int[] ordenacionBurbuja(int[] array){
        int aux;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    aux = array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }
    public static int[] ordenacionMejorado(int[] array){
        boolean intercambio = true;
        int aux;
        while(intercambio){
            intercambio = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    aux = array[i];
                    array[i]=array[i+1];
                    array[i+1]=aux;
                    intercambio = true;
                }
            }
        }
        return array;
    }
    public static void imprimirArray(int[] array){
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println("");
    }
    public static int[] rellenarVectorRandom(int longitud){
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
    public static long medirTiempo(){
        return System.currentTimeMillis();
    }
}

