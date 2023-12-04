package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {

        System.out.println("CALCULAR EL NUMERO MAYOR");

        int[] numeros = new int[10];
        int minimo = 0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce 10 números");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo){
                minimo = numeros[i];
            }
        }
        System.out.println("EL número más pequeño es: " + minimo);
    }
}
