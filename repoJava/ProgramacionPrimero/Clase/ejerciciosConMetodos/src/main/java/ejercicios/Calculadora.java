/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 *
 * @author Pablo
 * @date 3 nov 2021
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
//ejercicio 1
public class Calculadora {
    public static int potencia(int base, int exp){
        int res= 1;
        int contador = 0;
        while(contador<exp){
            res*=base;
            contador++;
        }
        return res;
    }
    public static int cuentaCifras(int num){
        int contador=0;
        while(num>1){
            num/=10;
            contador++;
        }
        return contador;
    }
    public static int factorial(int num){
        int contador=1;
        int res=1;
        while(contador<=num){
            res*=contador;
            contador++;
        }
        if(num==1){
            res = 1;
        }
        return res;
    }
    public static boolean esPrimo(int num){
        boolean primo=false;
        int contador = 0;
        int restoCero = 0;
        while(contador<num && restoCero<2){
            if(num%contador==0){
                restoCero++;
            }
            contador++;
        }
        if(restoCero==2){
            primo = true;
        }
        return primo;
    }
    public static String fibonacci(int n){
        String cadena = "";
        int num1 =0, num2=1, suma=1;
        for (int i = -1; i < n; i++) {
            cadena += suma;
            suma = num1+num2;
            num1=num2;
            num2=suma; 
        }
        return cadena;
    }
    public static int mcd(int num1, int num2){
        int res;
        if(num2==0) 
            res= num1;
        else
            res = mcd(num2, num1%num2);
        return res;
    }
    public static int mcm(int num1, int num2){
        return (num1*num2)/mcd(num1, num2);
    }
}
