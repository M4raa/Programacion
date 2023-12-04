package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo16{
    public static void main (String[] args){
        //Titulo
        System.out.println("OPERACIÓN ENTRE DOS NÚMEROS");

        //Variables
        int n1,n2;
        String operador;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        n1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        n2=sc.nextInt();
        System.out.println("Introduce la operación (+,-,*,/): ");
        operador=sc.next();

        //Operaciones
        switch (operador){
            case "+":
                System.out.println("--> " + n1 + " + " + n2 + " = " + (n1+n2));
                break;
            case "-":
                System.out.println("--> " + n1 + " - " + n2 + " = " + (n1-n2));
                break;
            case "*":
                System.out.println("--> " + n1 + " * " + n2 + " = " + (n1*n2));
                break;
            case "/":
                System.out.println("--> " + n1 + " / " + n2 + " = " + (n1/n2));
                break;
        }
    }
}
            
     
 
