package Arrays_Strings_Refuerzo.Strings2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E16 {
    public static String invertir(String frase1){
        String[] palabras= frase1.split(" ");
        String fraseInvertida = "";
        for (int i = palabras.length-1; i >=0; i--) {
            fraseInvertida+=palabras[i]+" ";
        }
        return fraseInvertida;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String frase =invertir(cadena1);
        System.out.println(frase);
    }
}
