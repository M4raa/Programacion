package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E11 {
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
            System.out.println("La frase contiene almenos una palabra de longitud " + cadena2);
        }else {
            System.out.println("La frase no contiene ninguna palabara de longitud " + cadena2);
        }
    }
}
