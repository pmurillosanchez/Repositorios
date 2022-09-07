/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testgenerator2;

/**
 *
 * @author Pablo
 * @date 4 abr 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Pregunta {
    //atributos privados
    private static int contadorId;
    //atributos heredados
    protected int id;
    protected String enunciado;
    protected String respuestaValida;
    protected String respuestaUsuario;
    protected double valoracionMaxima;
    protected double valoracionMinima;
    protected boolean estado;
    protected int nRespondida;
    protected int nFallada;
    protected String fecha;
    protected String categoria;
    public Pregunta(String enunciado, String respuestaValida, String respuestaUsuario, double valoracionMaxima, double valoracionMinima){
        this.id = incrementarContador();
        this.enunciado=enunciado;
        this.respuestaValida=respuestaValida;
        this.respuestaUsuario=respuestaUsuario;
        this.valoracionMaxima = valoracionMaxima;
        this.valoracionMinima = valoracionMinima;
    }
    //metodos privados
    private static int incrementarContador(){
        return contadorId++;
    }
}
