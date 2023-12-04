package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoII;

import java.util.Scanner;

public class E4 {
    public static int moda(int[] numeros){ //{4, 5, 7, 7, 4, 4, 5, 6, 9, 1}
        int moda=0;
        int rep=0;
        for (int i = 0; i < numeros.length; i++) {
            int num=numeros[i];
            int fr= 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j]==num) {
                    fr++;
                }
            }
            if (fr > rep){
                rep = fr;
                moda = num;
            }
        }
        return moda;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] cadena= new int[10];
        System.out.println("Introduce varios numeros: ");
        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = sc.nextInt();
        }
        System.out.printf("La moda es: " + moda(cadena));
    }
}
