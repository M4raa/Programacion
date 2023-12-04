package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E3 {
    public static String concat(String cadena1, String cadena2, String cadena3){
        return cadena3.concat(cadena1+cadena2);

    }
    public static void main(String[] args) {
        String frase1 = Utilidades.leerCadena("Introduce la primera frase");
        String frase2 = Utilidades.leerCadena("Introduce la segunda frase");
        String frase3 = "";
        String resultado = concat(frase1, frase2, frase3);
        System.out.println("--> " + resultado);
    }
}
