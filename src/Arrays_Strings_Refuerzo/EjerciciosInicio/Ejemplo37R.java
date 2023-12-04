package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo37R {
    public static void main(String[] args){
        Scanner miScanner = new Scanner(System.in);
        int decimal = 0;
        int potencia = 0;

        System.out.println("Introduce un número binario ");
        String binario = miScanner.next();
        miScanner.close();

        char bit;

        for (int i = binario.length() - 1; i >=0; i--){
            bit = binario.charAt(i);
            potencia = (binario.length() -1) -i;
            if (bit == '1') {
                decimal += Math.pow(2,potencia);
            }
        }
        System.out.printf("El numero binario %s en decimal es --> %d",binario,decimal);
    }
}
