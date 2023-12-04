package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo30R {
    public static void main(String[] args) {

        boolean esPalindromo = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena:");

        String cadena = sc.nextLine();
        sc.close();

        for (int i = 0; i < (cadena.length() / 2); i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("La cadena es palíndroma");
        }else {
            System.out.println("La cadena NO es palíndroma");
        }

    }
}
