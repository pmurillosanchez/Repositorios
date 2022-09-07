/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.Pablo;

/**
 *
 * @author Pablo
 * @date 19 ene 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class PracticaArrays {
    final static int RANGO = 100;
    public static void imprimir(int[] lista){
        for (int i : lista) {
            System.out.print(i+",");
        }
        System.out.println("");
        
    }
    public static int[] rellenarListaAzar(int numElems){
        int[] array = new int[numElems];
        array[0] = (int) (Math.random()*RANGO);//estamos teniendo en cuenta la premisa de que el primero en entrar nunca se va a encontrar un valor que se repita con el suyo
        System.out.print("[TRAZA] Generando valores:"+array[0]+",");
        for (int i = 1; i <array.length; i++)
            array[i] = obtenerValorAzar(array);
        System.out.println("");
        return array;
    }
    public static int obtenerValorAzar(int[] prohibidos){
        int res = (int) (Math.random()*RANGO);
        while(busquedaSecuencial(prohibidos, res)){
            System.out.print(res+"!,");//los valores que ya estan repetidos en el mensaje de traza se mostraran con una exclamacion a la derecha
            res = (int) (Math.random()*RANGO);
        }
        System.out.print(res+",");
        return res;
    }
    public static boolean busquedaSecuencial(int[] array, int valor){
        boolean comprobar = false;
        for (int i = 0; i < array.length & !comprobar; i++) {
            if(array[i]==valor)
                comprobar = true;
        }
        return comprobar;
    }
}
