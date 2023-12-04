package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo23 {
    public static void main (String[] args) {

        int num;
        int pos = 0;
        int cant = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce números enteros --> ");


        do {
            num = sc.nextInt();
            if (num !=0){
                cant++;
                if (num >0){
                    pos++;
                }
            }
        }while (num !=0);

        sc.close();

        if(pos == 1){
            System.out.println("Hay " + pos + " numero positivo");
        }else{
            System.out.println("Hay " + pos + " numeros positivos");
        }
        if((cant-pos) ==1){
            System.out.println("Hay " + (cant - pos) + " numero negativo");
        }else{
            System.out.println("Hay " + (cant - pos) + " numeros negativos");
        }


    }
}