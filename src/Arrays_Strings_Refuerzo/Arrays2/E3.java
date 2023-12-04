package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;

public class E3 {
    public static void main(String[] args){
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Utilidades.rellenaArray(array1,-30,30);
        Utilidades.rellenaArray(array2,-30,30);
        String comunes="--> ";
        for (int num1:array1) {
            for (int num2:array2) {
                if (num1==num2){
                    comunes += num2 + " ";
                }
            }
        }
        System.out.println("Array1 " + Arrays.toString(array1));
        System.out.println("Array2 " + Arrays.toString(array2));
        System.out.println("Los dos arrays tienen en común estos numeros: " + comunes);
    }
}