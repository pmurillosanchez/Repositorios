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
public class baloncesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nEntradas = sc.nextInt();
        double precioFondo = 5;
        double precioCentral = 12;
        double precioVip = 20;
        double resultadoFondo = 0;
        double resultadoVip = 0;
        double resultadoCentral = 0 ;
        int opcion = 0 ;
        switch(opcion){
            case 1 -> fondo(precioFondo, nEntradas);
            default -> System.out.print("Opcion no valida");
        }
        
    }
    public static double fondo(double precioFondo, int nEntradas){
        double resultadoFondo = nEntradas * precioFondo;
        if (nEntradas >7) {
            resultadoFondo = nEntradas * precioFondo * 0.94;
        }
        return resultadoFondo;
    }

}
