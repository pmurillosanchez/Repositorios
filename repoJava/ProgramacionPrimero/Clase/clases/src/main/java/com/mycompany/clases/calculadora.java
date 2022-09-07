/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clases;

/**
 *
 * @author Pablo
 */
public class calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public static int suma(int a, int b){
        return a + b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static int restar(int a, int b){
        return a-b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int potencia(int a, int b){
        return (int) Math.pow(a, b);
    }
    /*
    public static void menu(int opcion){
       
        mostrarMenu();
        do{
            opcion = sc.nextInt();
        }while(opcion < 1 && opcion > 7);
        switch(opcion){
            case 1 -> suma(sc.nextInt(), sc.nextInt());
            case 2 -> restar(sc.nextInt(), sc.nextInt());
            case 3 -> multiplicar(sc.nextInt(), sc.nextInt());
            case 4 -> dividir(sc.nextInt(), sc.nextInt());            
            case 5 -> potencia(sc.nextInt(), sc.nextInt());
            case 6 -> salir(sc.nextInt(), sc.nextInt());


        }
    }
*/
    public static void mostrarMenu(){
        System.out.println("1. Suma\n 2.Restar \n 3. Multiplicar \n 4.Dividir \n 5.Potencia \n 6.Salir");
    }
}
