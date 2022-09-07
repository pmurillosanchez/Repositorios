
package Binarios;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class BinariosApp {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double numero=-1.0;
        while(numero !=0.0){
            System.out.println("Dame un numero");
            numero = sc.nextDouble();
            System.out.println(decToBin(numero));
        }
    }
    
    public static ArrayList partirNumero(String numero){
        String numEntero,numDecimal;
        int posicionComa;
        ArrayList partes = new ArrayList();
        if(numero.contains(".")){
            posicionComa= numero.indexOf(".");
            numDecimal = numero.substring(posicionComa+1,numero.length());
            numEntero = numero.substring(0,posicionComa);
            partes.add(numEntero);
            partes.add(numDecimal);
        }else{
            partes.add(numero);
        }
        return partes;
    }
    public static void calcular(String numero, int base){
        ArrayList numeroCompleto = partirNumero(numero);
        switch(numeroCompleto.size()){
            case 1 -> System.out.println(pasarABaseDecimal(numeroCompleto.get(0).toString(),base));  
            case 2 -> System.out.println(convertirNumeroDecimal(numeroCompleto.get(0).toString(),numeroCompleto.get(1).toString(),base));
            default -> System.out.println("Numero mal construido");
        }
    }
    public static String pasarABaseDecimal(String numero, int base){
        StringBuilder resultado = new StringBuilder();
        int contador = numero.length()-1;
        int res=0;
        int num;
        for (int i = 0; i < numero.length() ; i++) {
            num = Character.getNumericValue(numero.charAt(i));
            res+= num*(int) (Math.pow(base,contador--));
        }
        resultado.append(res);
        return resultado.toString();
    }
    public static String convertirNumeroDecimal(String parteEntera, String decimal, int base){
        StringBuilder resultado = new StringBuilder();
        int num;
        int contador =1;
        double res = 0;
        
        int parteEnteraConvertida = Integer.parseInt(pasarABaseDecimal(parteEntera,base));
        resultado.append(".");
        for (int i = 0; i < decimal.length(); i++) {
            num = Character.getNumericValue(decimal.charAt(i));
            res+= (num*(Math.pow(base,-(contador++))));
        }
        if(res>1){
            parteEnteraConvertida += (int) res;
            res -= parteEnteraConvertida;
        }
        resultado.append(res);
        return resultado.toString();
    }
    public static String decToBin(double numero){
        String resultado;
        StringBuilder res = new StringBuilder();
        int cociente=0;
        int contador = 0;
        double decimal = numero % 1;
        int parteEntera = (int) (numero - decimal);
        //calculamos la parte entera 
        while(cociente!=1){
            cociente = parteEntera/2;
            res.append(parteEntera%2);
            parteEntera = cociente;
        }
        //calcularemos la parte decimal si el numero tiene parte decimal
        res.append(cociente);
        resultado = res.reverse().toString();
        if(decimal!=0){
            resultado+=".";
            while(contador != 3){//en este caso solo cogeremos solo 3 decimales como mucho
                decimal *=2;
                System.out.println(decimal);
                resultado +=(int) decimal;
                decimal %=1;
                contador++;
            }
        }
        return resultado;
    }
}
