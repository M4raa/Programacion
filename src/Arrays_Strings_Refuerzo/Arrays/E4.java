package Arrays_Strings_Refuerzo.Arrays;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        //Definición del programa
            System.out.println("CALCULAR MEDIA DE 10 NÚMEROS");

        //Definimos variables
            int media=0;
            int[] notas = new int[10];
        //Creamos el scanner
            Scanner sc = new Scanner(System.in);
            for (int i=0; i< notas.length;i++){
                System.out.printf("Introduce el %d número: ",i+1);
                notas[i] = sc.nextInt();
            }
            sc.close();

        //Creamos las operaciones correspondientes
            for ( int nota : notas){
                media += nota;
            }
        System.out.println("La media es " + ((float)media/(float)notas.length));
    }
}
