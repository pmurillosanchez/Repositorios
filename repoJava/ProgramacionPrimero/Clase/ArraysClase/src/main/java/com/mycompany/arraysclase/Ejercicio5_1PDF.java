/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraysclase;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio5_1PDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de alumnos");
        int cantidad = sc.nextInt();
        System.out.println("NOTA: si el alumno no se ha presentado introduzca -1");
        int[] notas = crearNotasAlumnos(sc, cantidad);
        double[] porcentajes = calcularPorcentajes(notas);
        System.out.println("Porcentaje aprobados:"+porcentajes[0]+"%, porcentaje suspensos:"+porcentajes[1]+"% y porcentaje no aprobados:"+porcentajes[2]+"%.");
    }
    public static int[] crearNotasAlumnos(Scanner sc, int cantidad){
        int[] notas = new int[cantidad];
        for (int i = 0; i < notas.length; i++) {
           notas[i] = sc.nextInt();
        }
        return notas;
    }
    public static double[] calcularPorcentajes(int[] notas){
        double[] porcentajes = {0,0,0};
        int[] contadores = {0,0,0};
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]==-1){
                contadores[2]++;//no presentados
            }else if(notas[i]>=0 && notas[i]<=4.99){
                contadores[1]++;//suspensos
            }else
                contadores[0]++;
        }
        for (int j = 0; j < porcentajes.length; j++) {
            porcentajes[j]=contadores[j]/notas.length;
        }
        return porcentajes;
    }
    
}
