package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo36R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int r;
        String binario = "";

        System.out.println("Introduce un número entero >= 0: ");
        numero = sc.nextInt();
        sc.close();

        while (numero != 0) {
            r = numero % 2;
            binario +=r;
            numero = numero / 2;
        }
        System.out.printf("Binario: %s", binario);
    }
}
