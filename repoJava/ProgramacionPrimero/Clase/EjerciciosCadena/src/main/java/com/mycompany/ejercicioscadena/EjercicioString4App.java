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
public class EjercicioString4App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "Lo mejor de los booleanos es que si te equivocas estas a solo un bit de la solucion correcta";
        System.out.println("El caracter a se repite "+contarCaracteres(cadena, "a")+" la letra b en la cadena anterior se repite "+contarCaracteres(cadena,"b"));
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
}
