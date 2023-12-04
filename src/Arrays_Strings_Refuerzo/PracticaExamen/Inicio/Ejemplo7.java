package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;
import java.util.Scanner;
public class Ejemplo7{
    public static void main (String[] args){
        //Titulo
        System.out.println("CALCULADORA DE PRECIOS");

        //Vaiables
        float precio,preciorebajado,descuento;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio original");
        precio=sc.nextFloat();
        System.out.println("Introduce el precio rebajado");
        preciorebajado=sc.nextFloat();
        sc.close();

        //Operaciones
        descuento=(precio-preciorebajado)/precio*100;

        System.out.println("El descuento es de: " + descuento + "%");


    }
   
 }
