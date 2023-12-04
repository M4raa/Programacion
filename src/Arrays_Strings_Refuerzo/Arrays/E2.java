package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        //Definición del programa
        System.out.println("IMPRESIÓN INVERSA DE UNA CADENA DE NÚMEROS");

        //Definimos variables
        int[] ar = new int[10];

        //Creamos el scanner de recolecta de datos
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Introduce el número " + i);
            ar[i]=sc.nextInt();
        }
        sc.close();

        for (int i= ar.length-1;i>=0;i--){
            System.out.println(ar[i]);
        }
    }
}