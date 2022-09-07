package com.mycompany.ejercicioscadena;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class EjercicioString7App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String edad = sc.next();
        System.out.println("Traza: La cadena tiene "+edad);
        edad +="anio";
        System.out.println("Traza: Ahora la cadena tiene"+edad);
        System.out.println(edad);
    }
    
}
