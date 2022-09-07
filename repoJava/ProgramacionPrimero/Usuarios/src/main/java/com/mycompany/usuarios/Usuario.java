/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.usuarios;

/**
 *
 * @author Pablo
 * @date 22 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Usuario {
    public final static int LONGITUDCLAVE = 8;
    public final static int LONGITUDCODIGO=5;
    private static String NUMEROS = "0123456789";
    private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private String nombreUsuario;
    private String claveCifrada;
    private String email;
    private int telefono;
    private String fotografia;
    private boolean habilitado;
    private String codigoSeguridad;
    private String[] contrasenas;
    private int nContrasenas;
    //primer constructor
    public Usuario(String nombreUsuario, String claveCifrada, String email){
        if (nombreUsuario.isBlank() || claveCifrada.isBlank() || email.isBlank())
            throw new IllegalArgumentException("Error");
        this.nombreUsuario=nombreUsuario;
        this.claveCifrada = cifrarClave(claveCifrada);
        this.email = email;
        this.habilitado=true;
        this.contrasenas = new String[5];
        this.nContrasenas=0;
        this.contrasenas[this.nContrasenas]=this.claveCifrada;
    }
    //segundo constructor
    public Usuario(String nombreUsuario, String claveCifrada, String email, int telefono, String fotografia){
        this(nombreUsuario,claveCifrada,email);
        this.claveCifrada=cifrarClave(claveCifrada);
        this.telefono=telefono;
        this.fotografia = fotografia;
    }
    //constructor
    public Usuario(String nombreUsuario, String email){     
        this.claveCifrada=generarClave(LONGITUDCLAVE-1);
        if (nombreUsuario.isBlank() || this.claveCifrada.isBlank() || email.isBlank())
            throw new IllegalArgumentException("Error");
        this.nombreUsuario=nombreUsuario;
        this.email = email;
        this.habilitado=true;
        this.contrasenas[0]=this.claveCifrada;
    }
    private static String generarClave(int longitud){
        int opcion;
        String res="";
        for (int i = 0; i < longitud; i++) {    
            opcion = (int) (Math.random()*(4-1)+1);
            switch(opcion){
               case 1 -> res+=(NUMEROS.charAt((int)(Math.random() * NUMEROS.length())));
               case 2 -> res+=(MINUSCULAS.charAt((int)(Math.random() * MINUSCULAS.length())));
               case 3 -> res+=(MAYUSCULAS.charAt((int)(Math.random() * MAYUSCULAS.length())));
            }
        }
        return res;
    }
    private static String cifrarClave(String claveCifrada){
        String res="";
        int valorAscii;
        for (int i = 0; i < claveCifrada.length(); i++){
            valorAscii=(int) claveCifrada.charAt(i)+2;
            res+=Character.toString(valorAscii);
        }
        return res;
    }
    public void habilitarCuenta(){
        this.habilitado=true;
    }
    public void deshabilitarCuenta(){
        this.habilitado=false;
    }
    public boolean entrar(String clave){
        boolean comprobar = false;
        if(cifrarClave(clave).equals(this.claveCifrada))
            comprobar = true;
        return comprobar;
    }
    private static String enviarCodigo(int longitud){
        String codigo=generarClave(longitud);
        return codigo;
    }
    public boolean entrar(String claveClara, String codigo){
        boolean comprobar = false;
        if(cifrarClave(claveClara).equals(this.claveCifrada) && enviarCodigo(LONGITUDCODIGO).equals(codigo))
            comprobar=true;
        return comprobar;
    }
    public void setClave(String nuevaClave){
       this.nContrasenas++;
       if(this.nContrasenas >= 5){
           moverContrasenas();
           this.nContrasenas=this.contrasenas.length-1;
       }
       if(!comprobarContrasenas(cifrarClave(nuevaClave))){
           this.contrasenas[this.nContrasenas]=cifrarClave(nuevaClave);
           this.claveCifrada=cifrarClave(nuevaClave);
       }else
           this.nContrasenas--;
    }
    private void moverContrasenas(){
        for (int i = 0; i < this.contrasenas.length-1; i++)
            this.contrasenas[i]=this.contrasenas[i+1];
        this.contrasenas[this.contrasenas.length-1]="";
    }
    private  boolean comprobarContrasenas(String nuevaContrasena){
        boolean encontrado = false;
        for (int i = 0; i < this.contrasenas.length && !encontrado; i++) {
            if(this.contrasenas[i].equals(nuevaContrasena))
                encontrado=true;
        }
        return encontrado;
    }
    public void renovarClave(){
        this.claveCifrada=cifrarClave(generarClave(LONGITUDCLAVE));
    }
}
    
