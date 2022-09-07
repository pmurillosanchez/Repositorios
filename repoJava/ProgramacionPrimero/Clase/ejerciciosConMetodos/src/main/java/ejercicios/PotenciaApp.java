/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Pablo
 */
import java.util.Scanner;
public class PotenciaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una base");
        int base = sc.nextInt();
        System.out.println("Introduzca un exponente");
        int exp = sc.nextInt();
        System.out.print(Calculadora.potencia(base, exp));     
    }  
}
