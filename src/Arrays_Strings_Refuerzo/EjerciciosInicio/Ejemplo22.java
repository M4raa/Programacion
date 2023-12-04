package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo22 {
    public static void main (String[] args) {

        int num;
        int pos = 0;


        Scanner sc = new Scanner(System.in);

            System.out.println("Introduce 10 números enteros --> ");

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num >= 0) {
                pos++;
            }
        }
        sc.close();

        System.out.println("Hay " + pos + " números positivos");
        System.out.println("Hay " + (10 - pos) + " números negativos");

    }
}


            