package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;
public class E8 {
    public static void main(String[] args){
        //Titulo
        System.out.println("SUMA DE POSITIVOS Y DE NEGATIVOS");

        int[] num = new int[10];
        int positivos=0;
        int negativos=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 números");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        for (int suma:num) {
            if (suma>0){
                positivos += suma;
            }else{
                negativos += suma;
            }
        }
        System.out.println("La suma de números positivos da: " + positivos);
        System.out.println("La suma de números negativos da: " + negativos);
    }
}