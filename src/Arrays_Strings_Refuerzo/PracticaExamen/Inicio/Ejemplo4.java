package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo4{
    public static void main (String[] args){
         //Titulo
        System.out.println("CALCULA EL ÁREA DE UN CUADRADO");

        //Variables
        int lado;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado de un cuadrado: ");
            lado = sc.nextInt();
        sc.close();

        //Código
        System.out.println("El área del cuadrado es: " + lado*lado);
     }
   
 }
