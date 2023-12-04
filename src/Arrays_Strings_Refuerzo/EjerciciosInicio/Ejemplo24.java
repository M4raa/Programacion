package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {

        int nota;
        int cuantasNotas = 0;
        int sumaNotas = 0;
        boolean hayUnDiez = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las notas, para acabar introduce -1");
        do {
            nota = sc.nextInt();
            if (nota != -1) {
                sumaNotas += nota;
                cuantasNotas++;
                if (10 == nota) {

                    hayUnDiez = true;
                }
            }
        } while (nota != -1);
        sc.close();

        System.out.println("La nota media es --> " + ((float) sumaNotas / (float) cuantasNotas));

        if (hayUnDiez) {
            System.out.println("Habia un 10 en las notas");
        }
    }
}
