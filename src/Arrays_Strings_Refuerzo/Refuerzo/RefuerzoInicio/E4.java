package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E4 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("COMPRUEBA SI UN NUMERO ES MÚLTIPLO DE 10");

        // Declaramos variables
        int n1,n2;
        boolean x=false;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        n1 = sc.nextInt();
            if (n1 % 10 == 0){
                System.out.println("Introduce un segundo número");
                n2 = sc.nextInt();
                if (n2 % 10 == 0){
                    x=true;
                }
            }
            sc.close();
        //Creamos las operaciones
        if (n1 % 10 == 0){
            System.out.println("El primer número es múltiplo de 10");
                if (x) {
                System.out.println("El segundo número es múltiplo de 10");
                }else{
                    System.out.println("El segundo número no es múltiplo de 10");
                }
        }else{
            System.out.println("El primer número no es múltiplo de 10");
        }
    }
}

