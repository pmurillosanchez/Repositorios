/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = rellenarMatrizAleatoriamente();
        
        imprimirMatriz(matriz);
        ordenarMatriz(matriz);
    }
    public static int[][] rellenarMatrizAleatoriamente(){
        int[][] matriz = new int[5][5];
        int num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                num=(int) (Math.random()*(matriz.length*matriz[0].length+1));
                if(busquedaSecuencial(matriz,num)){
                    j--;                    
                }else
                    matriz[i][j]=num+2;
            }
        }
        return matriz;
    }
    public static boolean busquedaSecuencial(int[][] matriz, int num){
        boolean comprobar = false;
        for (int i = 0; i < matriz.length && !comprobar; i++) {
            for (int j = 0; j < matriz[0].length && !comprobar; j++) {
                if(matriz[i][j]==num){
                    comprobar = true;
                }
            }
        }
        return comprobar;
    }
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void ordenarMatriz(int[][] matriz){
        int aux=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz[0].length; l++) {
                        if(matriz[i][j]<matriz[k][l]) {
                            aux = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = aux;
                        }
                    }
                }
            }
        }
        imprimirMatriz(matriz);
    }
    public static int busquedaBinaria(int[] vector,int valor, int izq, int der){
        int pos;
        int cen;
        if(izq>der){
            pos = -1;
        }else{
            cen = (int)((izq+der)/2);
        if(vector[cen]==valor)
            pos = cen;
        else
            if(vector[cen]<valor)
                pos = busquedaBinaria(vector, valor, cen+1, der);
            else 
                pos = busquedaBinaria(vector, valor, izq, cen-1);
        }
        return pos;
    }
}
