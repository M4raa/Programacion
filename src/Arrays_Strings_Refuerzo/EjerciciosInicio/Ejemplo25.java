package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        int numero;
        int factorial = 1;

        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero para obtener su factorial:");
            numero = sc.nextInt();
        sc.close();

        for (int i = 2 ; i <= numero; i++){
            factorial *=i;
        }
        System.out.println("El factorial es --> " + factorial);
    }
}
