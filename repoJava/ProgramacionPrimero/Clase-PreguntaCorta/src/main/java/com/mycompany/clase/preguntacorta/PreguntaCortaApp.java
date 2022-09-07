/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.clase.preguntacorta;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 * @date 17 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class PreguntaCortaApp {
    public static void main(String[] args) {
        PreguntaCorta[] testFebrero=new PreguntaCorta[4];
        int contador=0;
        testFebrero[contador]=new PreguntaCorta(contador++,"De que color es el cielo hoy","Azul");
        testFebrero[contador]=new PreguntaCorta(contador++,"De que color es la mesa","Blanca");
        testFebrero[contador]=new PreguntaCorta(contador++,"Cuanto es 1+1", "2",PreguntaCorta.CATEGORIAS[0],0.6,0.1);
        testFebrero[contador]=new PreguntaCorta(contador++,"En que continente esta Marruecos","Africa",PreguntaCorta.CATEGORIAS[1],1.8,0.0);
        double puntuacion=0.0;
        for(PreguntaCorta pc:testFebrero){
            puntuacion+= pc.preguntar();
        }
        testFebrero[0].reset();
        puntuacion+=testFebrero[1].preguntar();
        testFebrero[testFebrero.length -1].reset();
        puntuacion+=testFebrero[0].preguntar();
        puntuacion+=testFebrero[testFebrero.length-1].preguntar();
        JOptionPane.showMessageDialog(null, "Su puntuacion final es de:"+puntuacion);
    }
}
