/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.display;
import java.util.Scanner;
/**
 *
 * @author Pablo
 * @date 2 feb 2022
 * @authorFullName Pablo Antonio Murillo Sanchez
 */
public class DisplayApp {
    public static void main(String[] args) {
        Display d1 = new Display();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=-1){
            System.out.println(d1.setNumber(num));
            num = sc.nextInt();
            
        }
    }
}
