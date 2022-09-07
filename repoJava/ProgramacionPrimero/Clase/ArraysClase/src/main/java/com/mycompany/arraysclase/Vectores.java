/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraysclase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    final static int TAMANIO = 5;
    public static void main(String[] args) {
//        // TODO code application logic here
//        int vector[] = new int[TAMANIO];
//        int vectorCopia[] = new int[vector.length];
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] += i*3;
//        }
//        System.arraycopy(vector, 0, vectorCopia, 0, vector.length);
//        imprimirVectorEnteros(vector);
//        imprimirVectorEnteros(vectorCopia);
//        System.out.println(compararArray(vector,vectorCopia));
          ArrayList textoSeparado = crearCadena();
          
          
    }
    //otra forma de copiar arrays
    public static void otraCopia(int vector[]){
        int vectorCopia[] = Arrays.copyOf(vector, TAMANIO);
        otraComparacion(vector,vectorCopia);
        //borrarArrays 
        imprimirVectorEnteros(vectorCopia);
    }
    //otra forma de comparar arrays
    public static void otraComparacion(int arrayOriginal[], int arrayCopia[]){
        System.out.print(Arrays.equals(arrayOriginal, arrayCopia));
    }
    public static boolean compararArray(int arrayOriginal[], int arrayCopia[]){
        boolean comprobar = false;
        if(arrayOriginal.length == arrayCopia.length){
            for (int i = 0; i < arrayOriginal.length ; i++)
                comprobar = arrayOriginal[i] == arrayCopia[i];
        }
        return comprobar;
    }
    public static void comprobarCaracters(char []separadores, String texto, char caracter){
        int contador = 0;
        char vector[] = construirVectorAPartirDeUnaCadena(texto);
        for(char letra : vector){
            for(char separador : separadores){
                if(letra==separador)
                    contador++;
            }
        }
        System.out.println(contador);
    }
    
    public static char[] construirVectorAPartirDeUnaCadena(String texto){
        char[] cadena = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            cadena[i] = texto.charAt(i);
        }
        return cadena;
    }
    public static void imprimirVectorEnteros(int array[]){
        for(int i : array){
            System.out.print(i);
        }
        System.out.println();
    }
    /**
     * @sin parametros
     * @return nos devolvera una cadena de texto
     */
    public static ArrayList crearCadena(){
        Scanner sc = new Scanner(System.in);
        ArrayList resultado = new ArrayList();
        String caracter;
        boolean comprobar = false;
        while(!comprobar){
            caracter = sc.next();
            if(caracter.equals(" "))
                comprobar = true;
            else
                resultado.add(caracter);
        }
        return resultado;
    }
    public static ArrayList crearCadenaSinValoresRepetidos(ArrayList cadena, char caracter){
        ArrayList resultado = new ArrayList();
        for(int i = 0; i< cadena.size() ; i++){
            if(comprobarValoresRepetidos(cadena, caracter)){
                
            }
        }
        return resultado;
    }
    public static boolean comprobarValoresRepetidos(ArrayList cadena, char caracter){
        boolean comprobar = true;
        for (int i = 0; i < cadena.size() && comprobar; i++) {
            if((char) cadena.get(i)==caracter)
                comprobar = false;
        }  
        return comprobar;
    }
    /**
     * @param cadena
     * @param caracter
     * @return nos devolvera el numero de ocurrencias de un determinado vector
     */
    public static int numeroOcurrenciasCaracteres(ArrayList cadena, char caracter){
        int repeticiones = 0;
        for (int i = 0; i < cadena.size(); i++) {
            if((char) cadena.get(i)==caracter)
                repeticiones++;
        }                  
        return repeticiones;
    }
}
