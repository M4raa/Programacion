package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo14{
    public static void main (String[] args){
       
        int nota;
        
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
         nota = inputValue.nextInt();
            inputValue.close();
        
        if ((nota < 0) || (nota >10)){
         }  
         else if(nota < 3){
          System.out.println("Muy deficiente");
         }
         else if (nota < 5){
          System.out.println("Insuficiente");
         }
         else if (nota < 6){
          System.out.println("Suficiente");
         }
         else if (nota < 7){
          System.out.println("Bien");
         }
         else if (nota < 9){
          System.out.println("Notable");
         }
         else if (nota <= 10){
          System.out.println("Sobresaliente");
         }
         
    }
}
            
     
 
