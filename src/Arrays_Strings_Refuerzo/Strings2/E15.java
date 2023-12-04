package Arrays_Strings_Refuerzo.Strings2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

public class E15 {
    public static boolean esSyntax(String frase1){
        boolean correcto = true;
        int parentesis= 0;
        for (int i = 0; i <= frase1.length()-1; i++) {
            if (frase1.charAt(i)=='('){
                parentesis++;
            } else if (frase1.charAt(i)==')') {
                parentesis--;
            }
        }
        if (parentesis!=0){
            correcto=false;
        }

        return correcto;
    }
    public static void main(String[] args){
        String cadena1 = Utilidades.leerCadena("Introduce una cadena");
        if (esSyntax(cadena1)){
            System.out.println("La cadena está bien formada");
        }else System.out.println("La cadena no está bien formada");
    }
}
