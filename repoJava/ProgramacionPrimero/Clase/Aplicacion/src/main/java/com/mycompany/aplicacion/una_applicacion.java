/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacion;
import javax.swing.JOptionPane;
/**
 *
 * @author Pablo
 */
public class una_applicacion{
    public static void main(String[] args) {
        int num =Integer.parseInt(JOptionPane.showInputDialog("Dame un número: "));
        int cifras = 0; // Esto es una variable entera
        while (num>=0){
            num = num/10;
            cifras++;
        }
        JOptionPane.showMessageDialog(null, "Nº de cifras: " +cifras,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
