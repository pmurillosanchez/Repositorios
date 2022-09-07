/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.dni;

import java.util.Date;

/**
 *
 * @author Pablo
 * @date 10 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class DniClass {
    final static char[] LETRAS={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private char letra;
    private int numero;
    private String fechaCaducidad;
    private String fechaNacimiento;
    private String nombreCompleto;
    public DniClass(String numero,String fechaNacimiento, String nombreCompleto){
        this(Integer.parseInt(numero),fechaNacimiento, nombreCompleto);
    }   
    public DniClass(int numero, String fechaNacimiento, String nombreCompleto){
        this.letra=DNIUtils.obtenerLetraDNI(numero);
        this.numero=numero;
        constructorComun(fechaNacimiento,nombreCompleto);
    }
    private void constructorComun(String fechaNacimiento, String nombreCompleto){
        java.util.Date fecha = new Date();
        this.fechaCaducidad=""+fecha.getDay()+"/"+fecha.getMonth()+fecha.getYear()+4;
        this.fechaNacimiento=fechaNacimiento;
        this.nombreCompleto=nombreCompleto;
    }
    
}
