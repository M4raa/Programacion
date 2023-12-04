package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E5 {
    public static boolean acaba(String frase1,String frase2){
        boolean x = false;
        if (frase1.endsWith(frase2)){
            x = true;
        }
        return x;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce la primera cadena");
        String cadena2 = Utilidades.leerCadena("Introduce la segunda cadena");
        if (acaba(cadena1,cadena2)==true){
            System.out.println("La primera frase acaba con la segunda");
        }else {
            System.out.println("La primera frase no acaba con la segunda");
        }
    }
}
