/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PabloAntonioMurilloSanchez.CalculadoraApp;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 * @date 10 nov 2021
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class Calcula {
    public static void seleccionOperacion(double a, double b, char operando){
        switch(operando){
            case '+' -> JOptionPane.showMessageDialog(null,"El resultado de la suma es "+suma(a,b));
            case '-' -> JOptionPane.showMessageDialog(null, "El resultado de la resta es "+resta(a,b));
            case 'x' -> JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es "+multiplicacion(a,b));
            case '/' -> JOptionPane.showMessageDialog(null, "El resultado de la division es "+division(a,b));
            case 'r' -> JOptionPane.showMessageDialog(null, "El resultado de la raiz cuadrada es "+raizCuadrada(a));
            case 'p' -> JOptionPane.showMessageDialog(null, "El resultado de la potencia es " +potencia(a,b));
            case 'd' -> JOptionPane.showMessageDialog(null, "El resultado de la division entera es "+divisionEntera(a,b));
            case 'm' -> JOptionPane.showMessageDialog(null, "El resultado del modulo es:"+modulo(a,b));
            default -> JOptionPane.showMessageDialog(null, "No ha elegido ninguna opcion asique por defecto se ha calculado la suma, cuyo resultado es "+suma(a,b));
        }
        //JOptionPane.showMessageDialog(null, "Hola "+nombre+", tu suma es: "+s
    }
    public static double suma(double a, double b){
        System.out.println("Traza: "+a+", "+b+",+ el resultado es "+(a+b));
        return a + b;
    }
    public static double resta(double a, double b){
        System.out.println("Traza: "+a+", "+b+",- el resultado es "+(a-b));
        return a - b;
    }
    public static double multiplicacion(double a, double b){
        System.out.println("Traza: "+a+", "+b+",x el resultado es "+(a*b));
        return a * b;
    }
    public static double division(double a, double b){
        System.out.println("Traza: "+a+", "+b+",/ el resultado es "+(a/b));
        return a / b;
    }
    public static double raizCuadrada(double a){
        System.out.println("Traza: "+a+",r el resultado es "+Math.sqrt(a));
        return Math.sqrt(a);
    }
    public static double potencia(double a, double b){
        System.out.println("Traza: "+a+", "+b+",p el resultado es "+Math.pow(a,b));
        return Math.pow(a,b);
    }
    public static int divisionEntera(double a, double b){
        System.out.println("Traza: "+a+", "+b+",d el resultado es "+(int) (a/b));
        return (int) (a/b);
    }
    public static double modulo(double a, double b){
        System.out.println("Traza: "+a+", "+b+",m el resultado es "+(a%b));
        return a%b;
    }
    
}
