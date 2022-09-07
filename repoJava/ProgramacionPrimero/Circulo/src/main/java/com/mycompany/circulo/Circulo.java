/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.circulo;

/**
 *
 * @author Pablo
 * @date 3 may 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Circulo {
    private double rr;
    private long c;
    private String nombre;
    public Circulo(double radio){
        this.rr=radio;
        this.c=0x000000;
    }
    public double getRadio(){
        double f= (rr*10)/10;
        return rr;
    }
    /**
     * obtenemos el color de nuestro circulo
     * @return : color de nuestro circulo
     */
    public long getColor(){
        return c;
    }
    /**
     * establecemos nuestro color
     * @param color 
     */
    public void setColor(long color){
        if(c>=0){
            this.c=color;
        }
    }
    /**
     * Calculamos la longitud de nuestro circulo
    *@return : devolvemos la longitud de nuestro circulo
    */
    public double obtenerLongitud(){
        return 2* Math.PI * rr;
    }
    /**
     * Calculamos el area de nuestro circulo
     * @return : devolvemos el area de nuestro circulo
     */
    public double obtenerArea(){
        return Math.PI * rr * rr;
    }
    /**
     * Este metodo agranda nuestro circulo
     * @param porcentaje 
     */
    public void agrandar(int porcentaje){
        if(porcentaje > 0 ) {
            this.rr = this.rr + (this.rr * (porcentaje/10));
        }
    }
}
