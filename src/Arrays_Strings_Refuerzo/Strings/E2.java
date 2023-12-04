package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E2 {
    public static int comparar(String cadena1, String cadena2){
        return cadena1.compareToIgnoreCase(cadena2);
    }
    public static void main(String[] args){
        String frase1 = Utilidades.leerCadena("Introduce la primera frase");
        String frase2 = Utilidades.leerCadena("Introduce la segunda frase");
        int resultado = comparar(frase1,frase2);
        if (resultado==0){
            System.out.println("Las dos frases son iguales");
        } else if (resultado>0) {
            System.out.println("La primera frase es mayor");
        }else{
            System.out.println("La segunda frase es mayor");
        }
    }
}
