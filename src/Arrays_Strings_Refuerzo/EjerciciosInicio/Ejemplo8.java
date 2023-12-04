package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo8{
    public static void main (String[] args){
       
        int edad;
        
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce tu edad:");
        edad = inputValue.nextInt();

        inputValue.close();
        
        if (edad >= 18){
        
        System.out.println("Mayor de edad");
        
        
        }
            
     }
   
 }
