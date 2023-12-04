package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoII;

import java.util.Scanner;

public class E5 {
    public static double mediana(int numeros[]){
        int mediana=0;
        if (mediana%2==0) {
            int pos = numeros.length / 2;
            mediana = (numeros[pos] + numeros[pos - 1]) / 2;
        }else {
            mediana = numeros[(numeros.length/2)+1];
        }
        return mediana;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] cadena= new int[10];
        System.out.println("Introduce varios numeros: ");
        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = sc.nextInt();
        }
        System.out.printf("La moda es: " + mediana(cadena));
    }
}
