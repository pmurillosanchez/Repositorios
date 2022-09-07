/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorial;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija una de estas opciones+\n Opcion1.Factorial Iterativo \n Opcion2.Factorial Recursivo");
        int opcion = sc.nextInt();
        int result;
        System.out.println("Introduzca un numero para poder calcular el factorial");
        result = switch(opcion){
            case 1 -> factorialIterativo(sc.nextInt());
            case 2 -> factorialRecursivo(sc.nextInt());
            default -> 0;
        };
        System.out.print("Resultado del factorial es:"+result);
    }
    public static int factorialIterativo(int num){
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res*=i;
        }
        return res;
    }
    public static int factorialRecursivo(int num){
        int res=1;
        if(num==1){
            res=1;
        }else
            res = num * factorialRecursivo(num-1);
        return res;
    
}
}
    
