package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;
import java.util.Scanner;
public class Ejemplo5{
    public static void main (String[] args){
      //Titulo
        System.out.println("MULTIPLICA, SUMA, RESTA Y DIVIDE NÚMEROS");

      //Variables
        float n1,n2;

      //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce el primer número :");
        n1 = sc.nextInt();
        System.out.println("Intoduce el segundo número :");
        n2 = sc.nextInt();

      //Operaciones
        System.out.println("La suma da           -->" + (n1+n2));
        System.out.println("La resta da          -->" + (n1-n2));
        System.out.println("La multiplicación da -->" + (n1*n2));
        System.out.println("La división da       -->" + (n1/n2));
     }
 }
