package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo7{
    public static void main (String[] args){
        float precio;
        float prebaja;
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el precio del proucto:");
        precio = inputValue.nextFloat();
        
        System.out.println("Introduce el precio del proucto rebajado:");
        prebaja = inputValue.nextFloat();
        
         float descuento = (precio-prebaja)/precio*100;
        
        inputValue.close();
        System.out.println("El descuento es: " + descuento + "%");
     }
   
 }
