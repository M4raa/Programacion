package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo5{
    public static void main (String[] args){
        float Number1;
        float Number2;
        float resta;
        float suma;
        float multiplicacion;
        float division;
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el Número 1:");
        Number1 = inputValue.nextFloat();
        
        System.out.println("Introduce el Número 2:");
        Number2 = inputValue.nextFloat();
        
        resta = Number1 - Number2;
        suma = Number1 + Number2;
        multiplicacion = Number1 * Number2;
        division = Number1 / Number2;
        
        inputValue.close();
        System.out.println("La resta da: "+resta);
        System.out.println("La suma da: "+suma);
        System.out.println("El la multiplicacion da: "+multiplicacion);
        System.out.println("El la division da: "+division);
     }
   
 }
