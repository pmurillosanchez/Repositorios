/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.dam1;
/**
 *
 * @author Pablo
 */
public class SeriePracticaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0;
        while(cont<16){
            String hexadecimal = Integer.toHexString(cont);
            System.out.println(hexadecimal);
            cont++;
        }
    }
    
}
