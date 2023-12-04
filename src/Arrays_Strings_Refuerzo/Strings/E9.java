package Arrays_Strings_Refuerzo.Strings;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E9 {
    public static String sustraer(String frase1,int inicio, int fina){

        return frase1.substring(inicio,fina+1);
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        int s1= Utilidades.leerEntero("Posición de inicio: ");
        int s2= Utilidades.leerEntero("Posición de final: ");
        System.out.println( sustraer(cadena1,s1,s2));
    }
}
