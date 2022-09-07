/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.clasessencillas;

/**
 *
 * @author Pablo
 * @date 1 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Bombilla {
    //atributos
    private int tipo;
    private int potencia;
    private double precio;
    private boolean estado;
    
    //metodos clase
    public boolean getEstado(){
        return this.estado;
    }
    public void apagar(){
        if(this.estado)
            this.estado = false;
    }
    public void encender(){
        if(!this.estado)
            this.estado = true;
    }
    public boolean estaEncendida(){
        return this.estado;
    }
}
