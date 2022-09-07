/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escrituraobjetos;
import java.io.Serializable;


/**
 *
 * @author Pablo
 * @date 3 may 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Ciudad implements Serializable{
    private static int nCiudades;
    private String nombre;
    private int nHabitantes;
    private double longitud;
    private double latitud;
    public Ciudad(String nombre, int nHabitantes, double longitud, double latitud){
        this.nombre=nombre;
        this.nHabitantes=nHabitantes;
        this.longitud=longitud;
        this.latitud=latitud;
    }
    public Ciudad(){
        
    }

    public static int getnCiudades() {
        return nCiudades;
    }

    public static void setnCiudades(int nCiudades) {
        Ciudad.nCiudades = nCiudades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", nHabitantes=" + nHabitantes + ", longitud=" + longitud + ", latitud=" + latitud + '}';
    }
    
}
