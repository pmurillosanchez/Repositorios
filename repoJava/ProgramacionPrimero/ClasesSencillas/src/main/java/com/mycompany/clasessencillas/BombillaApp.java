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
public class BombillaApp {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        b1.encender();
        b2.apagar();
        if(b1.getEstado())
            System.out.println("la bombilla b1 esta encendida");
        if(!b2.getEstado())
            System.out.println("la bombilla b2 esta apagada");
    }

}
