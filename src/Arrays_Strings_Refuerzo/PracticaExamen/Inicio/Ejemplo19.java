package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo19{
    public static void main (String[] args) {
        //Titulo
        System.out.println("CALCULAR SALARIO");

        //Variables
        float precioHora;
        float precioHoraExtra;
        float horas;
        float bruto;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el precio x hora: ");
        precioHora=sc.nextFloat();
        while (precioHora<0){
            System.out.println("No puede ser menor a 0 ");
            System.out.println("Introduce el precio x hora: ");
            precioHora=sc.nextFloat();
        }
        System.out.println("Introduce las horas: ");
        horas=sc.nextFloat();
        while (horas<0){
            System.out.println("No puede ser menor a 0 ");
            System.out.println("Introduce las horas: ");
           horas=sc.nextFloat();
        }

        //Operaciones
        bruto = precioHora*horas;
        precioHoraExtra = (float) (bruto+((horas-35)*precioHora*1.5));

        if (horas>35){
            System.out.println("El salario bruto es: " + precioHoraExtra);
            if (precioHoraExtra>500 && precioHoraExtra<=900){
                System.out.println("Se aplica el 25%: " + (precioHoraExtra*0.25));
                System.out.println("El salario neto es: " +(precioHoraExtra*0.75));
            } else if (precioHoraExtra>900) {
                System.out.println("Se aplica el 45%: " + (precioHoraExtra*0.45));
                System.out.println("El salario neto es: " +(precioHoraExtra*0.55));
            }else {
                System.out.println("No se aplican impuestos");
                System.out.println("El salario neto es: " + precioHoraExtra);
            }
        }else{
            System.out.println("El salario bruto es: " + bruto);
            if (bruto>500 && bruto<=900){
                System.out.println("Se aplica el 25%: " + (bruto*0.25));
                System.out.println("El salario neto es: " +(bruto*0.75));
            } else if (bruto>900) {
                System.out.println("Se aplica el 45%: " + (bruto*0.45));
                System.out.println("El salario neto es: " +(bruto*0.55));
            }else {
                System.out.println("No se aplican impuestos");
                System.out.println("El salario neto es: " + bruto);
            }
        }


    }
}


                
