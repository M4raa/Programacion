package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo4{
    public static void main (String[] args){
        float lado;
        float area;
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el lado:");
        lado = inputValue.nextFloat();
        
        area = lado*lado;
        
        inputValue.close();
        System.out.println("El area del cuadrado es: " + area);
     }
   
 }
