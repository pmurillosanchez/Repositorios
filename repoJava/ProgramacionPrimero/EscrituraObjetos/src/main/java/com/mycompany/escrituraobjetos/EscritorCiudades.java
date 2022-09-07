/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.escrituraobjetos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Pablo
 * @date 3 may 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class EscritorCiudades {
    //public Ciudad(String nombre, int nHabitantes, double longitud, double latitud){
    public static void escribirCiudades(String path){
        Ciudad c;
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream salida = new ObjectOutputStream(fos)){
            //primer objeto
            c = new Ciudad("Malaga",300000,30000.00,35);
            salida.writeObject(c);
            //segundo objeto
            c = new Ciudad("Ciudad Real",550000,30000.00,35);
            salida.writeObject(c);
            //tercer objeto
            c = new Ciudad("Albuquerque", 40000,31341.00, 39);
            salida.writeObject(c);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
        
}
