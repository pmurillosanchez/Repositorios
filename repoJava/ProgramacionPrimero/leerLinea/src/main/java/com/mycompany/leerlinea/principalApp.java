/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.leerlinea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Pablo
 * @date 21 abr 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class principalApp {
    public static void main(String[] args) {
        final String FILENAME = "datos.txt";
        try{
            //1.Crear objeto: stream-character-input
            FileReader fr = new FileReader(FILENAME);
            try (BufferedReader fichero = new BufferedReader(fr)) {
                String linea = fichero.readLine();
                if(linea!=null){
                    System.out.println("Primera linea"+linea);
                }
            }
        }catch (IOException e){
            System.out.println("ERROR E/S:"+e);
        }
    }
}
