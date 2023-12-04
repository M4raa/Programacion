package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;

public class Ejemplo37R {
    public static void main(String[] args){
        //Binario a decimal
        String binario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero en binario");
        binario = sc.nextLine();
        int potencia = binario.length() -1;
        int decimal = 0;


        for (int i = 0; i < binario.length() ; i++) {

            if (binario.charAt(i) =='1'){
                decimal += Math.pow(2,potencia);
            }
            potencia --;

        }
        System.out.println(decimal);
    }
}
