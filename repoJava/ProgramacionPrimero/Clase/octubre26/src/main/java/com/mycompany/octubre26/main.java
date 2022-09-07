/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.octubre26;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class main {
    public static void main(String[] args) {           
        Scanner sc = new Scanner(System.in);

        String nombre = sc.next();
        
        while(nombre.isEmpty()){
           System.out.print("Nombre vacio");
           nombre = sc.next();
        }
        
        switch(nombre){
            case "Julio" -> System.out.println("Hola julio");
            case "Maria" -> System.out.println("Hola Maria");
            default -> System.out.print("No existe nombre");
    }
    }
}
