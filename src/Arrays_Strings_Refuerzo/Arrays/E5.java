package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {

        //Definición del programa
        System.out.println("CALCULAR EL NUMERO MAYOR");

        //Definimos variables
        int[] notas = new int[10];
        int maximo = notas[0];
        //Creamos el scanner
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Introduce el %d número: ", i + 1);
            notas[i] = sc.nextInt();
        }
        sc.close();

        //Creamos las operaciones correspondientes
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i];
            }
        }
        System.out.println("El número mayor es " + maximo);
    }
}
