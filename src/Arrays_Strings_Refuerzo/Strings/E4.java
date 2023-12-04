package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E4 {
    public static boolean contiene(String frase1,String frase2){
        boolean x = false;
     if (frase1.contains(frase2)){
         x = true;
     }
     return x;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce la primera cadena");
        String cadena2 = Utilidades.leerCadena("Introduce la segunda cadena");
        if (contiene(cadena1,cadena2)==true){
            System.out.println("La primera frase contiene la segunda");
        }else {
            System.out.println("La primera frase no contiene la segunda");
        }
    }
}
