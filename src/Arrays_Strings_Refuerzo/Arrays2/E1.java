package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;
import java.util.Arrays;

public class E1 {

    public static void main(String[] args) {

       int [] numeros = new int [20];
       Utilidades.rellenaArray(numeros,-30,30);
       System.out.println("Original Array " + Arrays.toString(numeros));
       int indice;
       do {
           indice = Utilidades.leerEntero("Introduce un índice entre 0 y " + (numeros.length - 1) + ":");
       } while ((indice < 0) || (indice > numeros.length - 1));
       int nAm = numeros[indice];
        for (int i = indice; i < numeros.length - 1 ; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length -1] = nAm;
        System.out.println("Después de eliminar el " + indice + Arrays.toString(numeros));
    }

}
