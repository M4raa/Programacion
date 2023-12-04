package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E10 {
    public static int longitud(String frase1,int frase2){
        int cont=0;
        String palabras[] = Utilidades.dividirEnPalabras(frase1);
        for (String contador:palabras) {
            if (contador.length() == frase2){
                cont++;
            }
        }
        return  cont;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        int cadena2 = Utilidades.leerEntero("Introduce una longitud");
        System.out.println("Hay " + longitud(cadena1,cadena2) + " palabras de longitud " + cadena2);
    }
}
