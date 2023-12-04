package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E6 {
    public static String reemplaza(String frase1,String frase2,String caracteres,String reemplazo){
        return frase2=frase1.replace(caracteres,reemplazo);
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce la primera cadena");
        String buscar= Utilidades.leerCadena("Introduce el carácter a reemplazar");
        String reemplazar= Utilidades.leerCadena("Introduce el carácter por el cual reemplazar");
        String cadena2 = "";
        System.out.println(reemplaza(cadena1,cadena2,buscar,reemplazar));
    }
}
