package Arrays_Strings_Refuerzo.EjerciciosInicio;

import java.util.Scanner;
public class Ejemplo19{
    public static void main (String[] args) {

        double preciohora;
        double numh;
        double impuestos25 = 0.25;
        double impuestos45 = 0.45;
        double salarioHorasNormales;
        double salarioHorasExtra;
        double multiplicador = 1.5;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduzca el precio por hora --> ");
        preciohora = inputValue.nextDouble();
        if (preciohora <= 0) {
            System.out.println("No pueden ser 0 o menos: ");
            preciohora = inputValue.nextDouble();
        }

        System.out.println("Introduzca la cantidad de horas a trabajar --> ");
        numh = inputValue.nextDouble();
        if (numh <= 0) {
            System.out.print("No pueden ser 0 o menos: ");
            numh = inputValue.nextDouble();
        }
        inputValue.close();

        salarioHorasNormales = (preciohora * numh);
        salarioHorasExtra = ((numh - 35) * (multiplicador * preciohora) + (preciohora * 35));


        if (numh <= 35) {
            System.out.println("El salario en bruto es -->" + salarioHorasNormales);

            if (salarioHorasNormales <= 500) {
                System.out.println("No hay impuestos aplicados");
                System.out.println("El salario neto es --> " + salarioHorasNormales);

            } else if (900 >= salarioHorasNormales) {
                System.out.println("Por encima de 500 se aplica el 25% -->" + (salarioHorasNormales * impuestos25));
                System.out.println("El salario neto es --> " + (salarioHorasNormales - (salarioHorasNormales * impuestos25)));

            } else {
                System.out.println("Por encima de 900 se aplica el 45% -->" + (salarioHorasNormales * impuestos45));
                System.out.println("El salario neto es --> " + (salarioHorasNormales - (salarioHorasNormales * impuestos45)));
            }
        }
        else {
            System.out.println("El salario en bruto es -->" + salarioHorasExtra);

            if (salarioHorasExtra <= 500) {
                System.out.println("No hay impuestos aplicados");
                System.out.println("El salario neto es --> " + salarioHorasExtra);

            } else if (900 >= salarioHorasExtra) {
                System.out.println("Por encima de 500 se aplica el 25% -->" + (salarioHorasExtra * impuestos25));
                System.out.println("El salario neto es --> " + (salarioHorasExtra - (salarioHorasExtra * impuestos25)));

            } else {
                System.out.println("Por encima de 900 se aplica el 45% -->" + (salarioHorasExtra * impuestos45));
                System.out.println("El salario neto es --> " + (salarioHorasExtra - (salarioHorasExtra * impuestos45)));
            }
        }
   }
}


                
