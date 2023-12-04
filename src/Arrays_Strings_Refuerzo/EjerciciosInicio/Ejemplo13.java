package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo13{
    public static void main (String[] args){
       
        int x;
        int y;
        int orden;
        
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        x = inputValue.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        y = inputValue.nextInt();
        
        System.out.println("1 Orden Ascendente - 2 Orden Descendente");
        orden = inputValue.nextInt();

        inputValue.close();
        
        if (orden == 1){
            if (x>y){
            System.out.println("El orden es:" + y + "-" + x);
            }
            else{
            System.out.println("El orden es:" + x + "-" + y);
            }
        }

        else{
        
            if (x>y){
            System.out.println("El orden es:" + x + "-" + y);
            }
            else{
            System.out.println("El orden es:" + y + "-" + x);
            }
        }
    }
            
     
 }
