package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoII;

import java.util.Scanner;

public class E2 {
    public static int diasHastaNochevieja(int dia, int mes){
        int total=365;
        int diasHastaNochevieja=0;
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < mes; i++) {
            diasHastaNochevieja += diasPorMes[i];
        }

        total = total -(diasHastaNochevieja + dia);
        return total;
    }
    public static void main(String[] args){

        int dia,mes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el dia:");
        dia = sc.nextInt();
        System.out.println("Introduce el mes (número):");
        mes = sc.nextInt();
        sc.close();

        System.out.println("Quedan: " + diasHastaNochevieja(dia,mes) + " dias");
    }

}
