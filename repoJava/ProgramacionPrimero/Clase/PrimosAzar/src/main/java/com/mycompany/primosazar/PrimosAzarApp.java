/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primosazar;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class PrimosAzarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> primos = listaPrimos(validacion());
        System.out.println("Numero primo aleatorio generado: "+primos.get((int) (Math.random() * primos.size())));   
    }
    public static ArrayList listaPrimos(int n){
        ArrayList <Integer> primos = new ArrayList<>();
        int numero;
        for(int i=0 ; i<n ; i++){
            numero = (int) (Math.random() * 10000);
            System.out.println("[Traza] Generado("+i+"):"+numero);
            if(esPrimo(numero)){
                System.out.println("[Traza] Num. primo:"+numero);
                primos.add(numero);
            }
        }
        return primos;
    }
    public static int validacion(){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
        }while(num<=0);
        return num;
    }
    public static boolean esPrimo(int num){
        int residuoCero=0;
        boolean primo = false;
        for (int i = 1; i < num ; i++) {
            if(num%i==0){
                residuoCero++;
            }
        }
        if(residuoCero==1){
            primo = true;
        }
        return primo;
    }
    
    
}
