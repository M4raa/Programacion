package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;

public class E8 {
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
    public static int filasACero(int[][] matriz) {
        int filasConOtroValor = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != 0) {
                    filasConOtroValor++;
                    break;
                }
            }
        }
        return filas - filasConOtroValor;
    }

    public static int columnasACero(int[][] matriz) {
        int columnasConOtroValor = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                if (matriz[j][i] != 0) {
                    columnasConOtroValor++;
                    break;
                }
            }
        }
        return  columnas - columnasConOtroValor;
    }
    public static void main(String[] args){
        int[][] matriz1 = new int[7][10];
        Utilidades.rellenaMatriz(matriz1,0,1);
        System.out.println("Array --> " + Arrays.deepToString(matriz1));
        System.out.println(martiz(matriz1));
        System.out.println("Columnas a cero: " + columnasACero(matriz1));
        System.out.println("Filas a cero: " + filasACero(matriz1));
    }
}
