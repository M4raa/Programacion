package Arrays_Strings_Refuerzo.Ejemplos;
public class Ejemplo1 {
    public static int cual(int n1, int n2){
        if(n1>n2){
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String argv[]) {
        int numero = Utilidades.leerEntero("Introduce un número entero:");
        int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

        System.out.println("El número mas grande es: " + cual(numero,numero2));

    }
}


