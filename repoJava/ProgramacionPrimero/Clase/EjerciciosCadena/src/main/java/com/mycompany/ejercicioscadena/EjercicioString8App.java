/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioscadena;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class EjercicioString8App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String edad = sc.next();
        while(!comprobarSiEsNumero(edad)){
            edad = sc.next();
        }
        mostrarEdad(edad);
        System.out.println(recorrerNumeroString(Integer.parseInt(edad)));   
    }
    public static void mostrarEdad(String edad){
        System.out.println("Traza: La cadena tiene "+edad);
        edad +=" años";
        System.out.println("Traza: Ahora la cadena tiene "+edad);
        System.out.println(edad);
    }
    public static String recorrerNumeroString(int num){
        String res="";
        for(int i = 0; i<=num;i++){
            res+=i+" ";
        }
        return res;
    }
    public static boolean comprobarSiEsNumero(String numero){
        boolean esNumerico = true;
        for (int i = 0; i < numero.length() ; i++) {
            if(!Character.isDigit(numero.charAt(i))){
                esNumerico = false;
            }
        }
        return esNumerico;
    }
}
