package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero :");
        numero = sc.nextInt();
        sc.close();


        for (int i = 1 ; i <= numero; i++){
            System.out.printf("%d ", i);
        }

    }
}
