/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clases;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(comprobar(a) && comprobar(b)){
            System.out.println(potencia(a,b));
        }
    }
    public static int potencia(int a, int b){
        int resultado = 1 ;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
    public static boolean comprobar(int num){
        boolean noEsPar = false;
        if (num%2==0) {
            noEsPar = true;
        }
        return noEsPar;
    }
}
