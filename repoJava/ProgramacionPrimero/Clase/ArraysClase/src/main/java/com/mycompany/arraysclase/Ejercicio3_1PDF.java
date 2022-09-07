/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraysclase;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Ejercicio3_1PDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []resultado = numeroMayor(crearArray());
        System.out.println("El mayor de la lista es el "+resultado[0]+" posicion("+resultado[1]+")");
        
    }
    public static ArrayList crearArray(){
        ArrayList<Integer> enteros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int tecleado = sc.nextInt();
        while(tecleado != -1){
            enteros.add(tecleado);
            tecleado = sc.nextInt();
        }
        return enteros;
    }
    public static int[] numeroMayor(ArrayList <Integer> array){
        int []resultado = {0,1};
        for (int i = 0; i < array.size(); i++) {
            if(resultado[0] < array.get(i)){
                resultado[0] = array.get(i);
                resultado[1] = i;
            }
        }
        return resultado;
    }
}
