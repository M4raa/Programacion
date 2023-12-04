package Arrays_Strings_Refuerzo.Strings2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E18 {
    public static boolean esAlfabetica(String palabra) {
        boolean cumpleOrden = true;
        for (int i = 1; i < palabra.length(); i++) {
            if (palabra.charAt(i) < palabra.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String cadena=Utilidades.leerCadena("Introduce una palabra para saber si es alfabética");
        if (esAlfabetica(cadena)==true){
            System.out.println("La palabra es alfabética");
        }else System.out.println("La palabra no es alfabética");
    }
}
