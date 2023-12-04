package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo11{
    public static void main (String[] args){
       
        int x;
        int y;
        
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        x = inputValue.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        y = inputValue.nextInt();

        inputValue.close();
        
        if (x > y){   
        System.out.println("El orden es:" + y + "-" + x);
         }
        
        else {
        System.out.println("El orden es:" + x + "-"  + y);
        }
     }
     
   
 }
