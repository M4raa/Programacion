package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {

        int n1,n2;

        System.out.println("--> DIVISION DE NUMEROS <--");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        n1 = sc.nextInt();
        if (n1 <0){
            System.out.println("Introduce un numero valido:");
            n1 = sc.nextInt();
        }
        System.out.println("Introduce el segundo numero:");
        n2 = sc.nextInt();
        if (n2 <0){
            System.out.println("Introduce un numero valido:");
            n2 = sc.nextInt();
        }
        sc.close();

        int x=n1;
        while(x >= n2) {
            x -= n2;
        }

        System.out.printf("El resultado es %d / %d = %d",n1,n2,x);

    }
}