package Arrays_Strings_Refuerzo.Strings;

import java.util.Scanner;

public class E1 {
    public static int comparar(String frase1, String frase2){
        return frase1.compareTo(frase2);
    }
    public static void main(String[] args){
        String cadena1;
        String cadena2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera frase: ");
        cadena1 = sc.nextLine();
        System.out.println("Introduce la segunda frase: ");
        cadena2 = sc.nextLine();
        sc.close();
        int resultado=comparar(cadena1,cadena2);

        if (resultado == 0){
            System.out.println("Las dos frases son iguales");
        } else if (resultado > 0) {
            System.out.println("La primera cadena es mayor");
        }else {
            System.out.println("La segunda cadena es mayor");
        }
    }
}
