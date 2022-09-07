/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrices;
import java.util.Scanner;/**
 *
 * @author Pablo
 */
public class principal {
    public static void main(String[] args) {
        //enteros, double, float, String, booleanos
        
        //int matriz[][] = new int[3][3];
        //System.out.println("Dame tu edad");
        //int edad = 0;
        int media ;
        int v[] = rellenarVectorPositivo();
        media = mayor(v);
        System.out.print(media);
        //Scanner sc = new Scanner(System.in);
        //edad = sc.nextInt();
        //leerEdad(edad);
        //System.out.println(Arrays.toString(calcularAreaVolumen(3)));
    }
    public static void recorrerMatriz(int matriz[][]){
        int contador = 0;
        for(int i=0 ; i<matriz.length;i++){
            contador++;
            for(int j=0 ; j<matriz.length ; j++){
                matriz[i][j]=contador;
                System.out.print(matriz[i][j]+"");
            }
            System.out.print("\n");
        }
    }
    public static void leerEdad(int edad){
        System.out.println("Tienes "+edad+" años");
    }
    public static double[] calcularAreaVolumen(int radio){
        double[] vSolucion = new double[2];
        vSolucion[0] = (4*Math.PI*Math.pow(radio,3))/3;
        vSolucion[1] = (4*Math.PI*Math.pow(radio, 2));
        return vSolucion;
    }
    public static double conversionFarenheitCelsius(double temperatura){
        return((5/9)*(temperatura-32));
    }
    //ejercicio6
    public static int[] rellenarVectorPositivo(){
        Scanner sc = new Scanner(System.in);
        int num;
        int vPositivo[] = new int[4];
        for(int i = 0 ; i < vPositivo.length ; i++){
            
            num = sc.nextInt();
            if(num>0)
                vPositivo[i] = num;
            else 
                i--;
        }
        return vPositivo;            
    }
    public static double mediaAritmetica(int v[]){
        double suma = 0;
        for(int i = 0 ; i<v.length ; i++)
            suma += v[i];
        return suma/v.length;
    }
    //ejercicio7
    public static int mayor(int v[]){
        int mayor = v[0];
        for(int i = 1 ; i<v.length ; i++){
            if(v[i]>mayor)
                mayor = v[i];
        }
        return mayor;
    }
}
