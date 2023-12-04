package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("MULTIPLICACIÓN DE DOS NUMEROS ENTEROS");

        // Declaramos variables
        int n1,n2;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número entero:");
        n1 = sc.nextInt();
            while(n1 == 0){
                System.out.println("El producto de 0 por cualquier número es 0");
                System.out.println("Introduce otro valor:");
                n1 = sc.nextInt();
            }
        System.out.println("Introduce el segundo número entero:");
        n2 = sc.nextInt();
            while(n2 == 0){
                System.out.println("El producto de 0 por cualquier número es 0");
                System.out.println("Introduce otro valor:");
                n2 = sc.nextInt();
            }
        sc.close();

        //Creamos las operaciones
        System.out.println("El resultado es --> " + (n1*n2));
    }
}