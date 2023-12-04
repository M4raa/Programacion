package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E15 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("SEGUNDOS A HORAS, MINUTOS Y SEGUNDOS");

        // Declaramos variables
        int t;
        int s,m,h;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un tiempo en segundos");
        t = sc.nextInt();
        sc.close();

        //Creamos las operaciones
            s=t%60;
            t=t-s;
            m=t/60;
        if (m>=60){
            h=m/60;
            m=m%60;
            System.out.printf("La hora es -->%dh:%dm:%ds",h,m,s);
        }else{
            System.out.printf("La hora es -->%dm:%ds",m,s);
        }


    }
}