package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo16{
    public static void main (String[] args){
       
     int n1;
     int n2;
     String op;
     
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce numero 1:");
        n1 = inputValue.nextInt();
        System.out.println("Introduce numero 2:");
        n2 = inputValue.nextInt();
        System.out.println("Introduce un operador: + - / *");
        op = inputValue.next();
        inputValue.close();
        
     switch (op){
        case "+":
           System.out.println("--> " + (n1 + n2) + " <--");
        break;
        case "-":
           System.out.println("--> " + (n1 - n2) + " <--");
        break;
        case "/":
           System.out.println("--> " + (n1 / n2) + " <--");
        break;
        case "*":
           System.out.println("--> " + (n1 * n2) + " <--");
        break;
      }
    }
}
            
     
 
