/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nordenados;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        System.out.print(vOrdenado(rellenarMatriz()));
    }
    public static int[] rellenarMatriz(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int v[] = new int[3];
        for(int i = 0 ; i < v.length ; i++){
            num = sc.nextInt();
            v[i]=num;
        }
        return v;
    }
    public static boolean vOrdenado(int[] v){
        int Menor = v[0];
        boolean comprobar = true;
        for(int i = 1; i<v.length && comprobar; i++){
            if(v[i]<Menor)
                comprobar = false;
        }
        return comprobar;
    }
}
