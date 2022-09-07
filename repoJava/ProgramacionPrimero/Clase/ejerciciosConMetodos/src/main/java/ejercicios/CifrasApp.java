/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class CifrasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una cifra");
        int cifra = sc.nextInt();
        System.out.print("Su numero tiene "+Calculadora.cuentaCifras(cifra));
    }
    
}
