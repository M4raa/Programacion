package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;
import java.util.Scanner;
public class Ejemplo6{
    public static void main (String[] args){
        //Titulo
        System.out.println("ÁREA Y PERÍMETRO DE UN CÍRCULO");

        //Variables
        double radio,area,perimetro;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio:");
        radio = sc.nextFloat();
        sc.close();

        //Operaciones
        area = Math.PI*(Math.pow(radio,2));
        perimetro = 2*Math.PI*radio;

        System.out.printf("El área del circulo es: %.2f%n",area);
        System.out.printf("El perímetro del circulo es: %.2f",perimetro);
     }
   
 }
