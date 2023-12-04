package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E16 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("¿QUÉ NÚMERO ES MAYOR?");

        // Declaramos variables
        int n1,n2,n3;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        n2 = sc.nextInt();
        System.out.println("Introduce el tercer número:");
        n3 = sc.nextInt();
        sc.close();

        //Creamos las operaciones
        if (n1>n2){
            if (n1>n3){
                System.out.println("El número mayor es --> " + n1);
            }
        }
        if (n2>n1){
            if (n2>n3){
                System.out.println("El número mayor es --> " + n2);
            }
        }
        if (n3>n2){
            if (n3>n1){
                System.out.println("El número mayor es --> " + n3);
            }
        }


    }
}