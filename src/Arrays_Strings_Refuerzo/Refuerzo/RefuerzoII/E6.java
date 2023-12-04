package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoII;

import java.util.Scanner;

public class E6 {
    public static boolean esHyperpar(int num){
        boolean par=true;
        String numero=String.valueOf(num);
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i)%2!=0) par = false;
        }
        return par;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        sc.close();
        if (esHyperpar(numero)==true){
            System.out.printf("El numero es hyperpar");
        }else {
            System.out.printf("El numero no es hyperpar");
        }
    }
}
