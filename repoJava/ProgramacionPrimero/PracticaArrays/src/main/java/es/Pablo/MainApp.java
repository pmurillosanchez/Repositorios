/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.Pablo;
import java.util.Arrays;
/**
 *
 * @author Pablo
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM = 15;
        //Obtengo una lista sin repetidos
        int[] lista = PracticaArrays.rellenarListaAzar(NUM);
        //Escribo el contenido de la lista
        System.out.println("La lista de 15 valores es:");
        PracticaArrays.imprimir(lista);
        //Ordeno la lista con el metodo del JDK
        Arrays.sort(lista);
        //Escribo el contenido de la lista ordenada
        System.out.println("La misma lista ordenada de menor a mayor es:");
        PracticaArrays.imprimir(lista);
        
    }
    
}
