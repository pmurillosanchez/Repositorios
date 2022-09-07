/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
 
    }
}
