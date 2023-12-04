package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;
import java.util.Scanner;
public class Ejemplo8{
    public static void main (String[] args){
        //Titulo
        System.out.println("MAYOR DE EDAD");

        //Variables
        int edad;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad=sc.nextInt();
        while(edad<=0){
            System.out.println("La edad ha de ser mayor a 0 ");
            System.out.println("Introduce tu edad: ");
            edad=sc.nextInt();
        }

        //Operaciones
        if(edad>=18) {
            System.out.println("Es mayor de edad");
        }

     }
   
 }
