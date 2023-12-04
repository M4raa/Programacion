package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo20 {
    public static void main (String[] args) {

        float precio;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio --> ");
        precio = sc.nextFloat();
        if (precio <= 0) {
            System.out.println("No pueden ser 0 o menos: ");
            precio = sc.nextFloat();
        }
        sc.close();

        if (precio < 6) {
            System.out.println("El producto no tiene descuento");
        }
        else if (precio >= 60) {
            System.out.println("El producto tiene un descuento del 10% --> " + precio * 0.90f);
            }

        else {
            System.out.println("El producto tiene un descuento del 5% --> " + precio * 0.95f);
        }

   }
}


                
