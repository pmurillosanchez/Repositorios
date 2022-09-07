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
public class EjercicioString3App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        String primeraMitad;
        String segundaMitad;
        if(esPar(palabra.length())){
            primeraMitad = palabra.substring(0, palabra.length()/2);
            segundaMitad = palabra.substring(palabra.length()/2,palabra.length());
        }else{
            primeraMitad = palabra.substring(0, 1+palabra.length()/2);
            segundaMitad = palabra.substring(1+palabra.length()/2,palabra.length());
        }
            
        System.out.println(primeraMitad+"|"+segundaMitad);
        
    }
    public static boolean esPar(int longitud){
        boolean comprobar = false;
        if(longitud%2==0)
            comprobar = true;
        return comprobar;
    }
    
}
