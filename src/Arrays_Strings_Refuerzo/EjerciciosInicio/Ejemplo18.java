package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class  Ejemplo18{
    public static void main (String[] args){
       
     int h;
     int m;
     int s;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce una hora -->");
            h = inputValue.nextInt();
         if (h>=24){
            System.out.println("La hora ha de ser menor a 24");
            h = inputValue.nextInt();
         }
         System.out.println("Introduce unos minutos -->");
            m = inputValue.nextInt();
         if (m>=60){
            System.out.println("Los minutos han de ser menor a 60");
            m = inputValue.nextInt();
         }
         System.out.println("Introduce unos segundos -->");
            s = inputValue.nextInt();
         if (s>=60){
            System.out.println("Los segundos han de ser menor a 60");
            s = inputValue.nextInt();
         }
        inputValue.close();
          
         if ((s+1)>=60){
            s = 0;

               if ((m+1)>=60){
                  m = 0;

                     if ((h+1)>=24){
                        h = 0;
                     }else{
                        h++;
                     }
               }else{
                  m++;
               }
         }else{
            s++;
         }
            System.out.println("La hora es --> " + h + ":" + m + ":" + s);     
   }
}

            
     
 
