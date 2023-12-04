package Arrays_Strings_Refuerzo.Arrays2;

import Arrays_Strings_Refuerzo.Ejemplos.Utilidades;

import java.util.Arrays;

public class E5 {
    public static boolean sonIguales(int[] primero, int[] segundo){
        boolean iguales=false;
        for (int i = 0; i < primero.length-1; i++) {
            if (primero[i]==segundo[i]){
                iguales=true;
            }
        }
        return iguales;
    }
    public static void main(String[] args){
        int[] array1 = new int[10];
        Utilidades.rellenaArray(array1,0,10);
        int [] array2=array1.clone();
        System.out.println("Primer array" + Arrays.toString(array1));
        System.out.println("Segundo array" + Arrays.toString(array2));

        if (sonIguales(array1,array2)) {
            System.out.println("Los dos arrays son iguales");
        }else{
            System.out.println("Los dos arrays no son iguales");
        }
    }
}