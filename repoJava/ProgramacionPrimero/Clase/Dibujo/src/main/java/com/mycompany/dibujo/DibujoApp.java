/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dibujo;

/**
 *
 * @author Pablo
 */
public class DibujoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print(Dibujo.pintaLinea(4, '*'));
        System.out.println();
        System.out.println();
        System.out.print(Dibujo.pintaCuadrado(4, '*'));
        System.out.println();
        System.out.print(Dibujo.piramide(7, '*'));
        System.out.println();
        System.out.print(Dibujo.piramideInvertida(5, '*'));
        System.out.println();
        System.out.print(Dibujo.rombo(5, '*'));
    }
    
}
