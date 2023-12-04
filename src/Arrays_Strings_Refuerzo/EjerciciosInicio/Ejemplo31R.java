package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo31R {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero -->");

        num = sc.nextInt();
        sc.close();

        for (int i=1;i<=num/2;i++){
            if ((num % i) == 0){
                System.out.printf("%d ",i);
            }else{

            }
        }


    }
}
