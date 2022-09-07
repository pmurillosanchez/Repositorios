/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenes;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class examenes {
    
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int num =0;
        int contCeros=0;
        int contNegativos=0;
        int contPositivos=0; 
        int contador = 0;
        int suma =0;
        double media = 0.0;
        while(num>-30){
            num = sc.nextInt();
            if(num==0){
                contCeros++;
            }else if(num<0){
                contNegativos++;
            }else
                contPositivos++;
            contador++;
            suma+=num;
        }
        media = suma/contador;
        //meter system.out.prints
        */
        
        Scanner sc = new Scanner(System.in);
        /*
        double dinero = sc.nextInt();
        double euros2 = 0.0;
        double euros1 = 0.0;
        double cents50 = 0.0;
        double cents20 = 0.0;
        double cents10 = 0.0;
        double cents5 = 0.0;
        double cents2 = 0.0;
        double cents1 = 0.0;
        euros2 = dinero/2;
        euros1 = dinero;
        cents50 = dinero*2;
        cents20 = dinero*5;
        cents10 = dinero*10;
        cents5 = dinero*20;
        cents2= dinero*50;
        cents1 = dinero*100;
        //escribir system out prints */
        int numIntentos = 0;
        int numeroSecreto = 0;
        int num = 0;
        numeroSecreto = (int) (Math.random() * 20) + 1;
        boolean adivinado = false;
        while(numIntentos<8 || !adivinado){
            num = sc.nextInt();
            if(num>numeroSecreto){
                System.out.println("tu numero es mayor");
                numIntentos++;
            }else if(num<numeroSecreto){
                System.out.println("tu numero es menor");
                numIntentos++;
            }else 
                System.out.println("Has adivinado el numero");
                adivinado = true;            
        }
    }
    
}

