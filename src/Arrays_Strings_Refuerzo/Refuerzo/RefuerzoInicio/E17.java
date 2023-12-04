package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E17 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("¿SON IGUALES? O ¿CUÁL ES MAYOR?");

        // Declaramos variables
        int n1,n2;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        n2 = sc.nextInt();
        sc.close();

        //Creamos las operaciones
        if (n1==n2){
            System.out.println("Los dos números son iguales");
        }
        if (n1>n2){
            System.out.println("El primer número es mayor");
        }else{
            System.out.println("El segundo número es mayor");
        }



    }
}