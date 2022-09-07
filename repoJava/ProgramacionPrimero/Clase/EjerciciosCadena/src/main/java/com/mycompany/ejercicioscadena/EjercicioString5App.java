/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioscadena;

/**
 *
 * @author Pablo
 */
public class EjercicioString5App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "Lo mejor de los booleanos es que si te equivocas estas a solo un bit de la solucion correcta";
        apariciones(cadena);
    }
    public static int contarCaracteres(String cadena, String a){
        int contador = 0;
        String caracteres[] = cadena.split("",cadena.length());
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i].equals(a))
                contador++;
        }
        return contador;
    }
    public static void apariciones(String cadena){
        String vocales = "aeiou";
        int repeticion;
        String vocalesArray[]= vocales.split("",vocales.length());
        for (int i = 0; i < vocales.length(); i++) {
            repeticion = contarCaracteres(cadena,vocalesArray[i]);
            if(repeticion > 5){
                System.out.println("El numero de veces que "+vocalesArray[i]+" se repite es "+repeticion);
                System.out.println("CUIDADO LA VOCAL "+vocalesArray[i]+ " SE REPITE MAS DE 5 VECES");
            }else{
                System.out.println("El numero de veces que "+vocalesArray[i]+" se repite es "+repeticion);
                saludar();
            }
        }
    }
    
    
    public static void saludar(){
        
    }
}
    

