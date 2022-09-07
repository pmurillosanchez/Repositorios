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
 */
public class CalculadoraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=1;//primer numero de la operacion
        double b=1;//segundo numero de la operacion
        String operandoTecleado;//simbolo de la operacion(solo pueden ser +,-,x,/,r,p,d,m
        char operando;
        //asignamos nuestras variables
        while(a!=0 && b!=0){
            a= Double.parseDouble(JOptionPane.showInputDialog("introduzca el primer operando"));
            b = Double.parseDouble(JOptionPane.showInputDialog("introduzca el segundo operando"));
            if(a!=0 && b!=0){
                operandoTecleado = JOptionPane.showInputDialog("Teclee una de las siguientes operaciones: +(suma),-(resta),x(multiplicacion),/(division),r(raizCuadrada),p(potencia,d(divisionEntera),m(modulo)");
                operando = operandoTecleado.charAt(0);
                Calcula.seleccionOperacion(a,b,operando);
            }else{
                JOptionPane.showMessageDialog(null,"Hasta luego");
            }
        }
    }
    
    
}
