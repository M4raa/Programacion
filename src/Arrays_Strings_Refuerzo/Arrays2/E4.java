package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args){
        int[] array = new int[10];
        Utilidades.rellenaArray(array,-30,30);
        System.out.println("Array " + Arrays.toString(array));
        int numero;
        String sumas="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero = sc.nextInt();
        sc.close();
        for (int valor1:array) {
            for (int i = 0; i < array.length-1; i++) {
                if ((valor1+array[i])==numero){
                    sumas+= "[" + valor1 + " + " + array[i] + "]";
                }

            }
        }

        System.out.println("La suma de estos pares son igual al número especificado: " + sumas);
    }
}