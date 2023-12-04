package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;
public class E7 {
    public static void main(String[] args){

        System.out.println("Introduce 5 cadenas de texto:");

        String[] cadenas = new String[5];
        int maxLength = 0;
        int lng;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = sc.nextLine();
        }

        for (String cadena:cadenas) {
            if (cadena.length() > maxLength){
                maxLength = cadena.length();
            }
        }

        for (int i = -1; i <= maxLength+2; i++) {
            System.out.printf("*");
        }

        System.out.println();

        for (String palabras:cadenas) {
            lng = (maxLength)-(palabras.length());
            System.out.printf("* ");
            System.out.printf("%s",palabras);
            for (int i = 0; i <= lng; i++) {
                    System.out.printf(" ");
            }
            System.out.printf("*%n");
        }
        for (int i = -1; i <= maxLength+2; i++) {
            System.out.printf("*");
        }
    }
}
