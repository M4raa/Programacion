package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("COMPRUEBA SI EL PRIMER NÚMERO DEL SEGUNDO");

        // Declaramos variables
        int n1,n2;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        n2 = sc.nextInt();
        sc.close();

        //Creamos las operaciones
        if (n1 % n2 == 0){
            System.out.println("El primer número es múltiplo del segundo");

        }else {
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }
}
