package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo11{
    public static void main (String[] args){
        //Titulo
        System.out.println("NÚMEROS EN ORDEN ASCENDENTE");

        //Variables
        int n1,n2;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        n1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        n2=sc.nextInt();

        //Operaciones
        if(n1>n2){
            System.out.println("El orden es: " + n2 + " - " + n1);
        }else{
            System.out.println("El orden es: " + n1 + " - " + n2);
        }
     }
     
   
 }
