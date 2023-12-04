package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E2 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("COMPROBADOR DE NÚMEROS PARES");

        // Declaramos variables
        int num;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        num = sc.nextInt();
        sc.close();

        //Creamos las operaciones
        if (num % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número no es par");
        }
    }
}
