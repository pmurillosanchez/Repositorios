/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioslibro;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] argv) {
        char c1,c2;
        int i=0, j=0, numparam, contador = 0;
        StringBuilder cadena = new StringBuilder();
        int parejas[][] = new int[27][27];
        numparam = argv.length;
        for (i = 0; i < numparam; i++) {
            cadena.append(argv[i].toLowerCase());
            if(i!=numparam-1){
                cadena.append(' ');
            }
        }
        for (int k = 0; k < cadena.length()-1; k++) {
            c1 = cadena.charAt(k);
            c2 = cadena.charAt(k+1);
            if(c1==' ')
                i=26;
            else
                i=c1-'a';
            if(c2==' ')
                j=26;
            else
                j=c2-'a';
            parejas[i][j]++;
        }
        for (i = 0;  i< 27; i++) {
            for (j = 0; j < 27; j++) {
                if(parejas[i][j]!=0){
                    int char1 = 'a'+i;
                    int char2 = 'a'+j;
                    System.out.print(( char ) char1 +""+( char ) char2 +":" + parejas[i][j] + " ");
                    contador++;
                    if(contador%6==0)
                        System.out.println();
                }
            }
        }
    }
    
    
    
}
