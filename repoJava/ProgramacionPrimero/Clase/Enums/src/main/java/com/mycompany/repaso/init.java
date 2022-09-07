/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repaso;

/**
 *
 * @author Pablo
 */
public class init {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println("Red enum name:" +c1.name());
        System.out.println("Red enum value:" +c1.getValue());
        for(Color color :Color.values()){
            System.out.println("Enum value:" +color.getValue());
        }
    }
}
