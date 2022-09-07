package com.mycompany.clase.preguntacorta;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 * @date 17 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class PreguntaCorta {
    public static final String[] CATEGORIAS={"GENERAL", "GEOGRAFIA", "DEPORTES", "INFORMATICA"};
    private final int id;
    private final String enunciado;
    private final String respuesta;
    private String categoria;
    private double valoracionMaxima;
    private double valoracionMinima;
    private boolean usada;//false no preguntada, true preguntada
    public PreguntaCorta(int id, String enunciado, String respuesta){
        this.id=id;
        this.enunciado=enunciado;
        this.respuesta=respuesta;
        if(enunciado.isEmpty() || respuesta.isEmpty() || id < 0){
            throw new IllegalArgumentException("Error, parametros obligatorios vacios");
        }                
        this.usada = false;
        this.categoria = CATEGORIAS[0];
        this.valoracionMaxima=1;
        this.valoracionMinima=0;
    }
    public PreguntaCorta(int id, String enunciado, String respuesta, String categoria, double valoracionMaxima, double valoracionMinima){
        this(id,enunciado,respuesta);
        this.categoria=categoria;
        this.valoracionMaxima=valoracionMaxima;
        this.valoracionMinima=valoracionMinima;
    }
    /**
     * 
     * @param categoria: le pasamos la nueva categoria de la pregunta
     */
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    /** 
     * 
     * @param valoracionMinima:le pasamos la nueva valoracionMinima de nuestra pregunta
     */
    public void setValoracionMinima(double valoracionMinima){
        this.valoracionMinima=valoracionMinima;
    }
    /**
     * 
     * @param valoracionMaxima :le pasamos la nueva valoracio maxima de nuestra pregunta
     */
    public void setValoracionMaxima(double valoracionMaxima){
        this.valoracionMaxima=valoracionMaxima;
    }
    /** 
     * En este metodo le mostramos la pregunta al usuario y recogemos su respuesta, si no se ha preguntado antes
     * @return : devolvemos la puntuacion que ha obtenido el usuario
     */
    public double preguntar(){
        String respuestaUser;
        double valoracion=0.0;
        if(!this.usada){
            respuestaUser=JOptionPane.showInputDialog(null, this.enunciado,"Pregunta "+this.id,JOptionPane.QUESTION_MESSAGE);
            valoracion=corregir(respuestaUser);
        }
        else
            System.out.println("PREGUNTA "+this.id+" REPETIDA");
        return valoracion;
    }
    /**
     * En este metodo marcamos la pregunta como preguntada, y comprobamos su respuesta
     * @param respuestaUser: le pasamos la respuesta que nos ha pasado el usuario
     * @return devolvemos la puntuacion que ha obtenido en su pregunta
     */
    private double corregir(String respuestaUser){
        double valoracion=0.0;
        this.usada=true;
        if(this.respuesta.toLowerCase().equals(respuestaUser.toLowerCase())){
            valoracion = this.valoracionMaxima;
        }
        return valoracion;
    }
    /**
     * Marcamos que no se ha preguntado esta respuesta, 
    */
    public void reset(){
        this.usada=false;
    }
}