package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;
public class E9 {
    public static void main(String[] args){
        //Titulo
        System.out.println("CALCULADORA DE NÚMEROS PARES E IMPARES");

        int[] num = new int[10];
        int pares=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 números");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        for (int numero:num) {
            if (numero%2==0){
                pares++;
            }
        }
        System.out.printf("Hay %d números pares y %d númreos impares",pares,num.length-pares);
    }
}
