package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E12 {
    public static boolean contiene(String frase1,int longitud){
        boolean x = false;
        String palabras[] = Utilidades.dividirEnPalabras(frase1);
        for (String contador:palabras) {
            if (contador.length() == longitud){
                x = true;
            }
        }
        return x;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        int cadena2 = Utilidades.leerEntero("Introduce una longitud");
        if (contiene(cadena1,cadena2)==true){
            System.out.println("Hay alguna palabra larga");
        }else {
            System.out.println("Todas las palabras son cortas ");
        }
    }
}
