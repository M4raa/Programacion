package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E9 {
    private static void printTablero(int tablero[][]) {
        char[] nombreFilas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
        System.out.println("  1 2 3 4 5 6 7 8");

        int filas = tablero.length;
        int columnas = tablero[0].length;
        for (int i = 0; i < filas; i++) {
            System.out.print(nombreFilas[i] + " ");
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] == 2) {
                    System.out.print("O" + " ");
                } else if (tablero[i][j] == 3) {
                    System.out.print("X" + " ");
                } else if (tablero[i][j] == 1) {
                    System.out.print("+" + " ");
                } else {
                    System.out.print("·" + " ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        Utilidades.rellenaMatriz(matriz, 0, 3);
        printTablero(matriz);

    }
}
