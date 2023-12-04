package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoII;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;

public class E1 {
    public static String orden(int[] numeros){
        String orden1="";
        boolean ascendente=true;
        boolean descendente=true;
        boolean iguales=true;
        for (int i = 0; i < numeros.length-1; i++) {
            if(numeros[i]<numeros[i+1]){
            }else ascendente=false;
            if (numeros[i]>numeros[i+1]) {
            }else descendente=false;
            if (numeros[i]==numeros[i+1]) {
            }else iguales=false;
        }
        if (ascendente){
            orden1+="Ascendente";
        } else if (descendente) {
            orden1+="Descendente";
        } else if (iguales) {
            orden1+="Igual";
        }else orden1+="Desordenado";
        return orden1;
    }

    public static void main(String[] args) {
        int[] numeross=new int[3];
        Utilidades.rellenaArray(numeross,0,3);
        System.out.println("Cadena inicial --> " + Arrays.toString(numeross));
        System.out.println("El orden es: " + orden(numeross));
    }
}
