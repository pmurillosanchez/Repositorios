/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.display;

/**
 *
 * @author Pablo
 * @date 1 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Display{
    private final String barra;
    public Display(){
        this.barra="*****";
    }
    private String getBarra(){
        return this.barra;
    }
    public String setNumber(int num){
        String res;
        switch(num){
            case 0 -> {
                res=cuadradoSinBase("*");
                res+=cuadradoSinTapa("*");
            }
            case 1 -> {
                res=lateralDer("*");
                res+=lateralDer("*");
            }
            case 2 -> {
                res=cuadradoBocaoIzq("*");
                res+=cuadradoConcavoVertical("*");
            }
            case 3 -> { 
                res=cuadradoBocaoIzq("*");
                res+=cuadradoE("*");
            }
            case 4 -> { 
                res=cuadradoSinTapa("*");
                res+=lateralDer("*");
            }
            case 5 -> {
                res=cuadradoBocaoDer("*");
                res+=cuadradoE("*");
            }
            case 6 -> {
                res=cuadradoBocaoDer("*");
                res+=cuadradoCompleto("*");
            }
            case 7 -> {
                res=cuadradoBocaoIzq("*");
                res+=cuadradoBocaoIzq("*");
            }
            case 8 -> {
                res=cuadradoCompleto("*");
                res+=cuadradoSinTapa("*");
            }
            case 9 -> {
                res=cuadradoCompleto("*");
                res+=lateralDer("*");
            }
            default -> res="error";
        }
        return res;
    }
        //1
    private String cuadradoCompleto(String barra){
        String res="";
        for (int i = 0; i < this.barra.length(); i++) {
            for (int j = 0; j < this.barra.length(); j++) {
                if(i==0 || i==this.barra.length()-1 || j==0 || j==this.barra.length()-1)
                    res+=barra;
                else
                   res+=" ";
                
            }
            res+="\n";
        }
        return res;
    }
    public String setClear(String barra){
        barra ="";
        return barra;
    }
    //2
    private String cuadradoSinBase(String barra){
        String res="";
        for (int i = 0; i < this.barra.length(); i++) {
            for (int j = 0; j < this.barra.length(); j++) {
                if(i==0 || j==0 || j==this.barra.length()-1)
                    res+=barra;
                else
                   res+=" ";
                
            }
            res+="\n";
        }
        return res;
    }
    //3
    private String cuadradoE(String barra){
        String res="";
        for (int i = 1; i <= this.barra.length(); i++) {
            for (int j = 1; j <= this.barra.length(); j++) {
                if(i==1 || i==this.barra.length() || j==0 || j==this.barra.length())
                   res+=barra;
                else
                   res+=" ";
            }
            res+="\n";
        }
        return res;
    }
    //5
    private String cuadradoBocaoDer(String barra){
        String res="";
        for (int i = 0; i < this.barra.length(); i++) {
            for (int j = 0; j < this.barra.length(); j++) {
                if(i==0 || j==0 )
                    res+=barra;
                else
                   res+=" ";
                
            }
            res+="\n";
        }
        return res;
    }
    private String cuadradoSinTapa(String barra){
        String res="";
        for (int i = 0; i < this.barra.length(); i++) {
            for (int j = 0; j < this.barra.length(); j++) {
                if(i==this.barra.length()-1 || j==0 || j==this.barra.length()-1)
                    res+=barra;
                else
                   res+=" ";
                
            }
            res+="\n";
        }
        return res;
    }
    private String cuadradoConcavoVertical(String barra){
        String res="";
        for (int i = 0; i < this.barra.length(); i++) {
            for (int j = 0; j < this.barra.length(); j++) {
                if(i==0 || i==this.barra.length()-1 || j==0)
                   res+=barra;
                else
                    res+=" ";
            }
            res+="\n";
        }
        return res;
    }
    //10
    private String cuadradoBocaoIzq(String barra){
        String res="";
        for (int i = 0; i < this.barra.length(); i++) {
            for (int j = 0; j < this.barra.length(); j++) {
                if(i==0 || j==this.barra.length()-1)
                    res+=barra;
                else
                   res+=" ";
                
            }
            res+="\n";
        }
        return res;
    }
    private String lateralDer(String barra){
        String res="";
        for (int i = 0; i < this.barra.length(); i++) {
            for (int j = 0; j < this.barra.length(); j++) {
                if(j==this.barra.length()-1)
                    res+=barra;
                else
                   res+=" ";
                
            }
            res+="\n";
        }
        return res;
    }    
}
