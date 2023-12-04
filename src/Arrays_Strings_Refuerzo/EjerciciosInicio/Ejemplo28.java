package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo28 {
    public static void main(String[] args) {
        int numero;
        boolean primo=true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es primo:");
        numero = sc.nextInt();
        sc.close();


        if ((numero == 1) || ((numero != 2 ) && (numero % 2 == 0))){
            primo = false;
        }else{
            for (int i=3 ; i <= (numero/2); i+=2){
                if (numero %i ==0){
                    primo = false;
                    break;
                }
            }
        }
        if(primo){
            System.out.println("El numero es Primo");
        }else{
            System.out.println("El numero es no es Primo");
        }

    }
}