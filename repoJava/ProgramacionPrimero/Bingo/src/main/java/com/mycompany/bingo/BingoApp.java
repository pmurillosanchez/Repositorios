/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bingo;

import java.util.Arrays;


/**
 *
 * @author Pablo
 */
public class BingoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numerosCarton1 = crearCarton();
        int[] numerosCarton2 = crearCarton();        
        String[][] carton1 = generarHuecos();
        String[][] carton2 = generarHuecos();
        System.out.println("-----Carton 1-----");
        carton1= generarCartonCompleto(numerosCarton1, carton1);
        imprimirCarton(carton1);
        System.out.println("");
        System.out.println("-----Carton 2-----");
        carton2= generarCartonCompleto(numerosCarton2, carton2);
        imprimirCarton(carton2);
        System.out.println("");
        //juegoBingo(carton1SinHuecos, carton2SinHuecos);
    }
    public static void juegoBingo(int[] bombo, String[][] carton1, String[][] carton2){
        boolean bingo = false;
        int contador = 0;
        boolean linea = false;
        for (int i = 0; i < carton1.length && !bingo; i++) {
            for (int j = 0; j < carton1[0].length && !bingo; j++) {
                if(bombo[i]==Integer.parseInt(carton1[i][j])){
                    carton1[i][j]+="!";
                    if(comprobarLinea(carton1) && !linea){
                        System.out.println("El jugador 1 ha cantado linea");
                        linea = true;
                    }                        
                }else if(bombo[i]==Integer.parseInt(carton2[i][j])){
                    carton2[i][j]+="!";
                    if(comprobarLinea(carton2) && !linea){
                        System.out.println("El jugador 2 ha cantado linea");
                        linea = true;
                    }                        
                }
            }
        }
    }
    public static int[] generarBombo(){
        int[] bombo = new int[99];
        for (int i = 0; i < bombo.length; i++) {
            bombo[i]= i+1;
        }
        //return Math.random() * (max - min) + min;
        return bombo;
    }
    
    //estamos generando los numeros de nuestro carton
    public static int[] crearCarton(){
        int carton[] = new int[15];
        int numero;
        for (int i = 0; i < carton.length; i++) {
                numero = (int) (Math.random()*100);
                if(!comprobarValor(carton,numero))
                    carton[i] = numero;
                else
                    i--;
        }        
        ordenarCarton(carton);
        return carton;
    }
    public static boolean comprobarValor(int[] bombo, int valor){
        boolean comprobar = false;
        for (int i = 0; i < bombo.length && !comprobar; i++) {
            if(valor==bombo[i])
                comprobar = true;
        }
        return comprobar;
    }
    //ordenamos los numeros de nuestro carton
    public static void ordenarCarton(int[] array){
        int aux;
        boolean intercambio = true;
        while(intercambio){
            intercambio = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    intercambio = true;
                }
            }
        }
    }
    //Estamos generando huecos
    public static String[][] generarHuecos(){
        int[] huecos = new int[4];
        int contador;
        int posicion;
        String[][] cartonHuecos = new String[3][9];
        for (int i = 0; i < cartonHuecos.length; i++) {//3
            Arrays.fill(huecos, -1);
            contador=0;
            for (int j = 0; j < cartonHuecos[0].length; j++) {//9
                if(contador<4){
                    posicion = (int) (Math.random()*((cartonHuecos[0].length-1)-0+1)+0);
                    if(comprobarHuecos(huecos, posicion) && contador > 0)
                        contador--;
                    else{
                        huecos[contador] = posicion;
                        cartonHuecos[i][posicion] = "-";
                    }
                    contador++;
                }
            }
        }
        return cartonHuecos;
    }
    public static boolean comprobarHuecos(int[] vector, int numero){
        boolean comprobar = false;
        for (int i = 0; i < vector.length && !comprobar; i++) {
            if(vector[i]==numero)
                comprobar = true;
        }
        return comprobar;
    }
    public static String[][] generarCartonCompleto(int[] numeros, String[][]huecos){
        String[][] cartonCompleto = new String[3][9];
        int contador=0;
        for (int i = 0; i < huecos[0].length; i++) {
            for (int j = 0; j < huecos.length; j++) {
                if(!"-".equals(huecos[j][i])&& contador < 15){
                    cartonCompleto[j][i] = Integer.toString(numeros[contador++]);//este contador debe llegar hasta 15
                }else
                    cartonCompleto[j][i] = "-";
            }
        }
        return cartonCompleto;
    }
    public static void imprimirCarton(String[][] carton){
        for (int i = 0; i < carton.length; i++) {
            System.out.print("[");
            for (int j = 0; j < carton[0].length; j++) {
                System.out.print(carton[i][j]+",");
            }
            System.out.print("]\n");
            
        }
    }
}
