package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E7 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("COMPROBADOR DE  MULTIPLOS DE 2 Y DE 3");

        // Declaramos variables
        int n1;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        n1 = sc.nextInt();
        while(n1 <= 0){
            System.out.println("Error: No se pueden introducir numeros negativos");
            System.out.println("Introduce otro valor:");
            n1 = sc.nextInt();
        }
        sc.close();

        //Creamos las operaciones
        if (n1%2==0){
            System.out.println("El número es múltiplo de 2");
        }
        if (n1%3==0){
            System.out.println("El número es múltiplo de 3");
        }
    }
}