package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        //Definición del programa
        System.out.println("CALCULADORA LETRA DNI");

        //Definimos variables
        char[]letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int dni;
        int pos;

        //Creamos el scanner de recolecta de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un DNI para saber su letra:");
            dni = sc.nextInt();
        sc.close();

        //Creamos las operaciones
            pos=dni%23;

        System.out.println("La letra correspondiente es: " + letras[pos]);

    }
}