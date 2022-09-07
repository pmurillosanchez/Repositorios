/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.octubre19;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class principal {
    int NUMERO_ADIVINAR = 9;
    public static void main(String[] args) {
        /*String strral = JOptionPane.showInputDialog("Dame valor");
        int valor = Integer.parseInt(strral);
        JOptionPane.showMessageDialog(null, strral, strral, valor);
        //ejemploEscrituraLecturaApp
        double raices[] = new double[2];
        int a = Integer.parseInt(JOptionPane.showInputDialog("Dame la a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Dame la b"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Dame la c"));
        raices = calcularRaices(raices, a, b, c);
        JOptionPane.showMessageDialog(null, raices[0]);
        JOptionPane.showMessageDialog(null, raices[1]);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dame un valor"));//caja de dialogo, entrada
        String esPar;
        esPar = comprobarPar(num);
        System.out.printf("la primera raiz es %f, la segunda raiz es %f", raices[0], raices[1]);
        JOptionPane.showMessageDialog(null, esPar);//ejercicio2        
        System.out.printf("el doble de %d es %d", num, num*2 );//consola
        JOptionPane.showMessageDialog(null, num*2);//caja de dialogo, salida
        double superficie = Integer.parseInt(JOptionPane.showInputDialog("Dame la superficie"));
        double perimetro = Integer.parseInt(JOptionPane.showInputDialog("Dame el perimetro"));
        
        medidas(superficie, perimetro);
        */
        crearCaracteres();
    }
    //ejercicio2
    public static String comprobarPar(int num){
        String parImpar;
        if(num%2==0)
            parImpar = "Es par";
        else
            parImpar = "Es impar";
        return parImpar;
    }
    //ejercicio3
    public static double[] calcularRaices(double a, double b, double c){
        double raices[] = new double[2];
        if(Math.sqrt(b*b-4*a*c)<0){
            JOptionPane.showMessageDialog(null, "Error raices imaginarias");
        }else{
            raices[0] = (-b+(Math.sqrt(b*b-4*a*c)))/2*a;
            raices[1] = (-b-(Math.sqrt(b*b-4*a*c)))/2*a;
        }
        return raices;
    }
    //ejercicio4
    public static void medidas( double superficie, double perimetro){
        double ancho;
        double largo;
        double array[] = new double[2];
        array =calcularRaices(-1, perimetro/2, -superficie);
        //condiciones
        ancho = array[0];
        largo = (perimetro/2) - ancho;
        System.out.printf("El ancho es %f y el largo es %f", ancho, largo);    
    }
    //ejercicio5
    public static void mayorMenor(int a, int b, int c){
        if(a>b && b>c){
            System.out.printf("%d es mayor", a);
        }else if(b>a && a>c){
            System.out.printf("%d es mayor", b);
        }else
            System.out.printf("%d es mayor", c);
    }
    //ejercicio6 
    public static void bisiesto(int anio){
        if(anio%4==0)
            System.out.printf("%d es bisiesto", anio);
        else if(anio%100==0)
            System.out.printf("%d no es bisiesto", anio);
        else if(anio%400==0)
            System.out.printf("%d es bisiesto", anio);
        else
            System.out.printf("%d no es bisiesto", anio);
    }
    //ejercicio 7
    public static void listaNumeros(int range){
        int contador = 1;
        int iteracciones = 0;
        while(contador<range){
            contador +=3;
            iteracciones++;
        }
        System.out.printf("%d", iteracciones);

    }
    //ejercicio 8
    public static void senCosTan(){
        double limitInf = 0;
        double radianes = 0;
        double limitSup = 360;
        System.out.println("GRADOS SENO COSENO TANGENTE");
        while(limitInf <=limitSup){
            radianes = Math.toRadians(limitInf);
            System.out.printf("%f  %f  %f  %f", limitInf, Math.cos(limitInf), Math.sin(limitInf), Math.tan(limitInf));
            limitInf++;
        }
    }
    //ejercicio 9
    public static int fibonacci(int num){
        int res = 0; 
        if(num==1){
            res = 1;
        }else if(num==0){
            res = 0;
        }else if(num>1){
            res = fibonacci(num-1) + fibonacci(num-2);
        }
        return res;
    }
    //ejercicio10 version recursiva
    public static int factorial(int num){
        int res = 0;
        if(num==1){
            res = 1;
         
        }else if(num==0){
            res = 1;
        }else if(num>1){
            res = factorial(num) * factorial(num-1);
        }
        return res;
    }
    //ejercicio 10 version iterativa
    public static void factorialIterativo(int num){
        int res = 0;
        do{
            res*=num;
            num--;
        }while(num >=1);
        System.out.printf("%d", res);
    }
    //ejercicio 11
    public void adivinar(int num){
        int contador = 0;
        while(NUMERO_ADIVINAR != num || contador < 3 )
            System.out.printf("el numero no es ese, intentelo de nuevo, numeros de intentos restantes %d", --contador);
        if(contador == 0){
            System.out.println("Lo siento no has adivinado el numero");
        }else{
            System.out.printf("Enhorabuena, efectivamente el numero era %d", num);
        }
    }
    //ejercicio 12
    public static void cuadradoAsteriscos(int lado){
        int contadorAltura = 0;
        int contadorBase = 0;
        while(contadorAltura<lado){
            while(contadorBase<lado){
                contadorBase++;
                System.out.print("*");
            }
            System.out.println("\n");
            contadorBase = 0;
        }  
    }
    //ejercicio 13
    public static void diaMesApp(int mes, int anio){
        bisiesto(anio);
        switch(mes){
            case 1: 
                System.out.print("Enero");
                break;
            case 2: 
                System.out.print("Febrero");
                break;
            case 3: 
                System.out.print("Marzo");
                break;
            case 4: 
                System.out.print("Abril");
                break;
            case 5: 
                System.out.print("Mayo");
                break;
            case 6: 
                System.out.print("Junio");
                break;
            case 7: 
                System.out.print("Julio");
                break;
            case 8: 
                System.out.print("Agosto");
                break;
            case 9: 
                System.out.print("Septiembre");
                break;
            case 10: 
                System.out.print("Octubre");
                break;
            case 11: 
                System.out.print("Noviembre");
                break;
            case 12: 
                System.out.print("Diciembre");
                break;
            default: 
                System.out.print("Numero de mes no valido");
        }
    }
    //ejercicio 14
    public static void diasPorMes(int anio){
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        while(mes<0 && mes>12){
            System.out.print("Mes invalido introduzca un nuevo numero de mes");
        }
        switch(mes){
            case 1: 
                System.out.print("Enero");
                System.out.print("31");
                break;
            case 2: 
                System.out.print("Febrero");
                System.out.print("27");
                break;
            case 3: 
                System.out.print("Marzo");
                System.out.print("30");
                break;
            case 4: 
                System.out.print("Abril");
                System.out.print("31");
                break;
            case 5: 
                System.out.print("Mayo");
                System.out.print("30");
                break;
            case 6: 
                System.out.print("Junio");
                System.out.print("31");
                break;
            case 7: 
                System.out.print("Julio");
                System.out.print("30");
                break;
            case 8: 
                System.out.print("Agosto");
                System.out.print("31");
                break;
            case 9: 
                System.out.print("Septiembre");
                System.out.print("30");
                break;
            case 10: 
                System.out.print("Octubre");
                System.out.print("31");
                break;
            case 11: 
                System.out.print("Noviembre");
                System.out.print("30");
                break;
            case 12: 
                System.out.print("Diciembre");
                System.out.print("31");
                break;
            default: 
                System.out.print("Numero de mes no valido");
        }
    }
    //ejercicio 17
    public static void crearCaracteres(){
        StringBuilder cadena = new StringBuilder();
        int contador = 25;
        for(int i = 0; i<93;i++){
            cadena.append(Character.toChars(++contador));
        }
        imprimirCaracteres(cadena.toString());
    }
    public static void imprimirCaracteres(String cadena){
        int contador = 0;
        for(int i = 0 ; i < 17 ; i++){
            for(int j = 0; j<4; j++){
                System.out.print(cadena.charAt(contador++));
            }
            System.out.println("\n");
        }
    }
} 
