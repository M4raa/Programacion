package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;

public class E7 {
    public static String martiz(int[][]numeros){
        String resultado = "";
        int filas = numeros.length;
        int columnas = numeros[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado+=numeros[i][j] + " ";
            }
            resultado+= "\n";
        }
        return resultado;
    }
    public static void main(String[] args){
        int[][] matriz1 = new int[7][10];
        Utilidades.rellenaMatriz(matriz1,0,1);
        System.out.println("Array --> " + Arrays.deepToString(matriz1));
        System.out.println(martiz(matriz1));
    }
}
