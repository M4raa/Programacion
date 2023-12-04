package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo10{
    public static void main (String[] args){
        //Titulo
        System.out.println("POSITIVO O NEGATIVO");

        //Variables
        int x;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        x=sc.nextInt();

        //Operaciones
        if(x>=0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
     }
 }
