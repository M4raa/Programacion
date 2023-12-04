package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E20 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("CADENA DE NÚMEROS PARES A PARTIR DEL INTRODUCIDO");

        // Declaramos variables
        int n;
        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        n = sc.nextInt();
        sc.close();
        String cadena="";
        //Creamos las operaciones
        if (n%2==0){
            for (int i=0;i<5;i++){
               n+=2;
               cadena+=n+" ";
            }
            System.out.println("Los números pares siguientes son: "+ cadena);
        }else{
            n-=1;
            for (int i=0;i<5;i++){
                n+=2;
                cadena+=n+" ";
            }
            System.out.println("Los números pares siguientes son: "+ cadena);
        }

    }
}