package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo36R {
    public static void main(String[] args) {
        //Decimal a binario
        int decimal;
        int resto;
        String binario = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero en decimal");
        decimal = sc.nextInt();
        sc.close();

        do {
            resto = decimal % 2;
            binario = resto + binario;
            decimal = decimal / 2;

        }while (decimal != 0);
        System.out.printf("El numero en binario es: %s",binario);
    }
}
