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
public class numerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.print(productos(n,x));
    }
    public static int productos(int n, int x){
        int resultado = 1;
        while(n>0){
            if (x%2==0) {
                resultado *= x;
                n--;
            }
            x++;
        }
        return resultado;
    }
}
