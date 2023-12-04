package Arrays_Strings_Refuerzo.Strings2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E14 {
    public static int sonDigitos(String frase1){
        int digitos = 0;
        String[] palabras = frase1.split(" ");
        for (String palabra:palabras){
            for (int i = 0; i <= palabra.length() - 1; i++) {
                if (Character.isDigit(palabra.charAt(i))){
                    if (i == palabra.length() - 1){
                        digitos++;
                    }
                }else break;
            }
        }
        return digitos;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        System.out.println("La cadena contiene " + sonDigitos(cadena1) + " digitos");
    }
}
