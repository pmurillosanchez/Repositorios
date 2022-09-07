/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testgenerator2;

import java.util.Scanner;

/**
 *
 * @author Pablo
 * @date 4 abr 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class PreguntaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        int num=sc.nextInt();
        int suma=0;
        while(contador<=num){
            contador++;
            suma += contador*contador;
        }
        System.out.println(suma);
    }
}
