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
public class Ejercicio7_1PDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas = crearNotas();
        double[] porcentajes = calcularPorcentajes(notas);
        System.out.println("Porcentaje aprobados:"+porcentajes[0]+"%, porcentaje suspensos:"+porcentajes[1]+"% y porcentaje no aprobados:"+porcentajes[2]+"%.");
    }
    public static int[] crearNotas(){
        StringBuilder notasLeidas= new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String[] notasCaracteres;
        char tecleado = sc.next().charAt(0);
        while(tecleado !=-2){
            notasLeidas.append(tecleado);
            notasLeidas.append(";");
        }
        notasCaracteres = notasLeidas.toString().split(";");
        return convertirCadenaAEnteros(notasCaracteres);
    }
    public static int[] convertirCadenaAEnteros(String[] notasCaracteres){
        int[] arrayNumerico = new int[notasCaracteres.length];
        for (int i = 0; i < notasCaracteres.length; i++) {
            arrayNumerico[i]= Integer.parseInt(notasCaracteres[i]);
        }
        return arrayNumerico;
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
