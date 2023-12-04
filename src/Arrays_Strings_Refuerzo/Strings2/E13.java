package Arrays_Strings_Refuerzo.Strings2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E13 {
    public static int contiene(String frase1){
        int digitos = 0;
        for (int i = 0; i < frase1.length() - 1; i++) {
            if (Character.isDigit(frase1.charAt(i))){
                digitos++;
            }
        }
        return digitos;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        System.out.println("La cadena contiene " + contiene(cadena1) + " digitos");
    }
}
