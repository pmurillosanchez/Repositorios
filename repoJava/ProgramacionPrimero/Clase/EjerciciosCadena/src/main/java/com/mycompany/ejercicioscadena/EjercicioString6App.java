package com.mycompany.ejercicioscadena;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pablo
 */
import java.util.Scanner;
public class EjercicioString6App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String cadenaSinEspacios = cadena.trim();
        StringBuilder res = new StringBuilder(cadenaSinEspacios);
        if(cadenaSinEspacios.equals(res.reverse().toString()))
            System.out.println("SI es palindromo");
        else
            System.out.println("NO es palindromo");
    }
}

/*
public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        System.out.println("Tecleado: "+cadena);
        String cadenaSinEspacios = cadena.trim();
        System.out.println("Traza: "+cadenaSinEspacios);
        if(cadenaSinEspacios.equals(invertir(cadenaSinEspacios))
            System.out.println("SI es palindromo");
        else
            System.out.println("NO es palindromo");
    }
    public static String invertirCadena(String cadena){
        String res="";
        for (int i = cadena.length()-1;i>=0 ; i--){
            res += cadena.charAt(i);
        }
        return res;
    }
}
*/