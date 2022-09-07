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
public class Ejercicio2String2App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String palabra1 = sc.next();
        String palabra2 = sc.next();
        if(palabra1.equals(palabra2))
            System.out.println("Ambas palabras son exactamente iguales");
        else
            comprobarTamanioIgnorandoFormato(palabra1, palabra2);      
    }
    public static void comprobarTamanioIgnorandoFormato(String a, String b){
        String aMayor = a.toUpperCase();
        String bMayor = b.toUpperCase();
        if(a.length()==b.length()){
            System.out.println("La longitud es la misma\n No son exactamente iguales");
            if(aMayor.equals(bMayor))
                System.out.println("Pero si lo son si no tenemos en cuenta may/min");
        }else if(a.length() > b.length())
            System.out.println("La palabra "+a+" es mayor que la palabra"+b);
        else 
            System.out.println("La palabra "+b+" es mayor que la palabra"+a);
    }
}
