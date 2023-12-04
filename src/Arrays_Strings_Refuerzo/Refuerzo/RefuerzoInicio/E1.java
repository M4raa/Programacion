package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E1 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("SACA EL DOBLE Y EL TRIPLE DE UN NUMERO");

        // Declaramos variables
        int num;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        num = sc.nextInt();
        sc.close();

        //Creamos las operaciones
        System.out.println("El doble es --> " + num*2);
        System.out.println("El triple es --> " + num*3);
    }
}
