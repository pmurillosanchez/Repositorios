/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numerosperfectos;

/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        numerosPerfectos(6);
    }
    public static void numerosPerfectos(int num){
        int contador=0;
        int suma=0;
        while(contador < num){
            contador++;
            if(num%contador==0){
                suma+=contador;
            }  
            
        }
        if(suma==num){
            System.out.print("Numero perfecto");
         
        }else{
            System.out.print(suma);
            System.out.print("NO es perfecto");
        }
    }
}
