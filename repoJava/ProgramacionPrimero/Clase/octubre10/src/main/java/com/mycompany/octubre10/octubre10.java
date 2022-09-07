/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.octubre10;
import java.util.*;
/**
 *
 * @author Pablo
 */
public class octubre10 {
    public static void main(String[] args){
        /*
        int opcion = 0;
        switch(opcion){
            case 1: 
                opcion = 1;
                break;
            case n:
                opcion = n;
                break;
            default:
                opcion = 0;
        }*/
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
            System.out.println("Cantidad de monedas que tengas en el bolsillo");
            elegirMonedas(sc);
            break;
            case 2:
            System.out.println("Lista de la compra");
            break;
            case 3:
            System.out.println("Nombre");
            break;
            default:
                opcion = 0;
                break;
        }
    }
        public static void elegirMonedas(Scanner sc){
            int opcion = 0;
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("5 monedas");
                    break;
                case 2:
                    System.out.println("10 monedas");
                break;
                case 3:
                    System.out.println("15 monedas");
                break;
                case 4:
                    System.out.println("20 monedas");
                break;
                case 5:
                    System.out.println("Otra cantidad");
                break;
                default:
                    System.out.println("opcion incorrecta");
            }
            
        }
    }

