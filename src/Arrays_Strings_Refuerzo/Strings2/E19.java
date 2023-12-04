package Arrays_Strings_Refuerzo.Strings2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E19 {
    public static String convertir(String palabra) {
        String convertido = palabra
            .replace('a','.')
            .replace('e','.')
            .replace('i','.')
            .replace('o','.')
            .replace('u','.')
            .replace('A','.')
            .replace('E','.')
            .replace('I','.')
            .replace('O','.')
            .replace('U','.')
            .replace('á','.')
            .replace('é','.')
            .replace('í','.')
            .replace('ó','.')
            .replace('ú','.')
            .replace('Á','.')
            .replace('É','.')
            .replace('Í','.')
            .replace('Ó','.')
            .replace('Ú','.')
            .replace('ä','.')
            .replace('ë','.')
            .replace('ï','.')
            .replace('ö','.')
            .replace('ü','.')
            .replace('Ä','.')
            .replace('Ë','.')
            .replace('Ï','.')
            .replace('Ö','.')
            .replace('Ü','.');
        return convertido;
    }
    public static void main(String[] args) {
        String cadena= Utilidades.leerCadena("Introduce una cadena para quitarle las vocales");
        System.out.println("Pasatiempo --> " + convertir(cadena));
    }
}
