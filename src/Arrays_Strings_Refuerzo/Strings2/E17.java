package Arrays_Strings_Refuerzo.Strings2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E17 {
    public static String sonSiglas(String frase){
        String[] palabras = frase.split(" ");
        String siglas = "";
        for (String palabra:palabras) {
            if (Character.isUpperCase(palabra.charAt(0))){
                siglas += palabra.charAt(0) + ".";
            }
        }
        return siglas;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        System.out.println("--> " + sonSiglas(cadena1));

    }
}
