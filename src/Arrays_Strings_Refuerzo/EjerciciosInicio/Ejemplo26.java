package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        int numero;
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para obtener su tabla de multiplicar:");
        numero = sc.nextInt();
        sc.close();


        for (int i = 1 ; i <= 10; i++){
            resultado = i*numero;
            System.out.println(numero+ " x "  + i + " = " + resultado);
        }

    }
}
