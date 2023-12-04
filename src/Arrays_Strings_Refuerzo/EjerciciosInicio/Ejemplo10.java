package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo10{
    public static void main (String[] args){
       
        int x;
        
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
        x = inputValue.nextInt();

        inputValue.close();
        
        if (x >= 0){   
        System.out.println("Positivo");
         }
        
        else {
        System.out.println("Negativo");
        }
     }
     
   
 }
