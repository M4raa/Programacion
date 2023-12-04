package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo17{
    public static void main (String[] args){
       
     String mes;
     
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un mes:");
        mes = inputValue.next();
        inputValue.close();
        
     switch (mes){
        case "Enero":
           System.out.println("Este mes contiene 31 dias");
        break;
        case "Febrero":
           System.out.println("Este mes contiene 28 dias");
        break;
        case "Marzo":
           System.out.println("Este mes contiene 31 dias");
        break;
        case "Abril":
           System.out.println("Este mes contiene 30 dias");
        break;
        case "Mayo":
           System.out.println("Este mes contiene 31 dias");
        break;
        case "Junio":
           System.out.println("Este mes contiene 30 dias");
        break;
        case "Julio":
           System.out.println("Este mes contiene 31 dias");
        break;
        case "Agosto":
           System.out.println("Este mes contiene 31 dias");
        break;
        case "Septiembre":
           System.out.println("Este mes contiene 30 dias");
        break;
        case "Octubre":
           System.out.println("Este mes contiene 31 dias");
        break;
        case "Noviembre":
           System.out.println("Este mes contiene 30 dias");
        break;
        case "Diciembre":
           System.out.println("Este mes contiene 31 dias");
        break;
      }
    }
}
            
     
 
