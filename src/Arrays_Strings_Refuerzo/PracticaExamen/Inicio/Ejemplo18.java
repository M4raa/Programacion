package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo18{
    public static void main (String[] args){
        //Titulo
        System.out.println("MINUTOS, HORAS Y SEGUNDOS");

        //Variables
        int m,s,h;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce los segundos: ");
        s=sc.nextInt();
        while (s>=60){
            System.out.println("Los segundos han de ser menor a 60");
            System.out.println("Introduce los segundos: ");
            s=sc.nextInt();
        }
        System.out.println("Introduce los minutos: ");
        m=sc.nextInt();
        while (m>=60){
            System.out.println("Los minutos han de ser menor a 60");
            System.out.println("Introduce los minutos: ");
            m=sc.nextInt();
        }
        System.out.println("Introduce las horas: ");
        h=sc.nextInt();
        while (h>=24){
            System.out.println("Las horas han de ser menor a 24");
            System.out.println("Introduce las horas: ");
            h=sc.nextInt();
        }

        //Operaciones
        s++;
        if (s>=60){
            m++;
            s-=60;
            if (m>=60) {
                h++;
                m-=60;
                if (h >= 24) {
                    h = 0;
                }
            }

        }

        System.out.println("--> " + h + ":" + m + ":" + s);
   }
}

            
     
 
