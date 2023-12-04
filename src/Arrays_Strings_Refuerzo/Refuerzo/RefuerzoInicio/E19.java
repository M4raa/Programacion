package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E19 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("ALTURA DE UN TRIÁNGULO");

        // Declaramos variables
        int n;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una altura");
        n = sc.nextInt();
        sc.close();
        String asterisco="";
        //Creamos las operaciones
        for (int i=0; i<n;i++){
            asterisco += "*";
            System.out.printf("%s%n",asterisco);
        }


    }
}