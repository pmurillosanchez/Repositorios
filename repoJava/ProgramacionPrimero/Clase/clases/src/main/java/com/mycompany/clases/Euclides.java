/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clases;

/**
 *
 * @author Pablo
 */
public class Euclides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int euclides(int m, int n){
        int mcd =0 ; 
        int resto = m%n;
        if(resto==0){
            mcd = n;
        }else{
            m = n;
            n = resto;
            mcd = euclides(m,n);
        }
        return mcd;
    }//euclides.iterativo
    public static int euclidesIterativo(int m, int n){
        int mcd = 0;
        boolean sigue = true;
        int resto = 0;
        while(sigue){
            resto = m%n;
            if(resto==0){
                mcd = n;
                sigue = false;
            }else{
                m = n;
                n = resto;
            }
        }
        return mcd;
    }
    
}
