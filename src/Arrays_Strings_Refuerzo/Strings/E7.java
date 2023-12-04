package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E7 {
    public static int posicion(String frase1,String frase2){
        return frase1.indexOf(frase2);
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce la primera cadena");
        String cadena2 = Utilidades.leerCadena("Introduce la segunda cadena");
        System.out.println("La frase 2 está en la posición " + posicion(cadena1,cadena2) + " de la frase 1");
    }
}
