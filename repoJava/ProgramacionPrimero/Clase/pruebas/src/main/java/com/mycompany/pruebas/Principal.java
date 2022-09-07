/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebas;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Principal {
    public static void main(String[] args) {
        int arrayA[]= new int[2];
        int arrayB[]= new int[1];
        int temp = 0;
        for(int i = 0; i<arrayA.length; i++){
            if(arrayA[i]>arrayB[0]){
                temp = arrayA[i];
                arrayA[i] = arrayB[0];//arrayA <--- arrayB
                arrayB[0] = temp;
            }
        }
        
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean primo = false;
        boolean par = false;
        boolean bisiesto = false;
        num = sc.nextInt();
        bisiesto = esBisiesto(num);
        primo = esPrimo(num);
        par = esPar(num);
        System.out.println(par);
        System.out.println(primo);
        System.out.println(bisiesto);
    }
    public static boolean esBisiesto(int anio){
        boolean bisiesto = false;
        if(anio%4==0)
            bisiesto = true;
        if(anio%100==0)
            bisiesto = false;
        if(anio%400==0)
            bisiesto = true;
        return bisiesto;
    }
    public static boolean esPrimo(int num){
        int divisionRestoCero = 0;
        int iterador = 1;
        boolean primo = false;
        while(iterador<num && divisionRestoCero<2){
            if(num%iterador==0)
                divisionRestoCero++;
            iterador++;
        }
        if(divisionRestoCero==2)
            primo=true;
        return primo;
    }
    public static boolean esPar(int num){
        boolean par = false;
        if(num%2==0)
            par = true;
        return par;
    }
}
