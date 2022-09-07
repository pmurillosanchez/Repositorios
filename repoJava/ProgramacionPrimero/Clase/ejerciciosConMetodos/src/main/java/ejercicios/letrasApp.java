/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class letrasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();
        System.out.print(Character.getType(num));
        String letra = sc.next();
        if(letra.equals(letra.toLowerCase())){
            System.out.print(letra.toUpperCase());
        }else{
            System.out.print(letra.toLowerCase());
        }
    }
    public static int numeroRandom(int inf, int sup){
        return (int) (Math.random()*((sup+inf)-inf));
    }
}
