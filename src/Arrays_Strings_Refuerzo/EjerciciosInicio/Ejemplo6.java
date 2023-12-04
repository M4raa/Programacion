package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo6{
    public static void main (String[] args){
        double radio;
        double area;
        double perimetro;
        double R;
        
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el radio:");
        radio = inputValue.nextFloat();
      
        area = 2*Math.PI*radio;
        perimetro = Math.PI*radio*radio;
        
        inputValue.close();
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
     }
   
 }
