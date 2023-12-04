package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E13 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("COMPROBADOR DE  NUMEROS PARES");

        // Declaramos variables
        int n1,n2;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número entero:");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo número entero");
        n2 = sc.nextInt();
        sc.close();

        //Creamos las operaciones
        if (n1%2==0 && n2%2==0){

        }else if (n1%2==0) {
            System.out.println("El primer número es par");
        }else if (n2%2==0){
            System.out.println("El segúndo número es par");
        }

    }
}