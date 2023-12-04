package Arrays_Strings_Refuerzo.EjerciciosInicio;

public class Ejemplo29R {
    public static void main(String[] args) {

        for (int i = 3 ; i <= 100 ; i++){
            boolean esPrimo = true;

            if (i > 1 && i % 2 !=0){
                for (int a = 3; a * a <= i; a+=2){
                    if (i % a == 0){
                        esPrimo = false;
                        break;
                    }
                }
            } else if (i !=2) {
                esPrimo = false;
            }
            if (esPrimo){
                System.out.printf("%d ",i);
            }
        }
    }
}
