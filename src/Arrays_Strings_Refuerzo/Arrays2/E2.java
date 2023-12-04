package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;

public class E2 {
    public static void main(String[] args){
        int[] array = new int[10];
        Utilidades.rellenaArray(array,-30,30);
        String duplicados="";
        for (int i = 0; i < array.length -1; i++) {
            int numero = array[i];
            for (int j = i+1; j < array.length -1 ; j++) {
                if (array[j]==numero){
                    duplicados += numero + " ";
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Se duplican estos números: " + duplicados);
    }
}
