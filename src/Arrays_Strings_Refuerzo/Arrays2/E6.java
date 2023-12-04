package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;

public class E6 {
    public static int[] mvCeros(int[] array){
        int max = array.length;
        for (int i = 0; i < max; i++) {
            if (array[i]==0){
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
                i--;
                max--;
            }

        }
        return array;
    }
    public static void main(String[] args){
        int[] array1= new int[20];
        Utilidades.rellenaArray(array1,0,5);
        System.out.println("Valores del array original --> " + Arrays.toString(array1));
        System.out.println("Valores del array después de la operación --> " + Arrays.toString(mvCeros(array1)));
    }
}
