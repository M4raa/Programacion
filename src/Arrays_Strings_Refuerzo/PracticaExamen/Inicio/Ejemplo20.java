package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;

public class Ejemplo20 {
    public static void main (String[] args) {
        //Titulo
        System.out.println("DESCUENTO");

        //Variables
        float precio;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        precio=sc.nextFloat();

        //Operaciones
        if (precio>=6 && precio<60){
            System.out.println("El precio del producto es: " + (precio*0.95));
        } else if (precio>=60) {
            System.out.println("El precio del producto es: " + (precio*0.9));
        }else {
            System.out.println("El precio del producto es: " + precio);
        }
    }
}


                
