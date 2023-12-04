package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo13{
    public static void main (String[] args){
        //Titulo
        System.out.println("ORDEN ASCENDENTE O DESCENDENTE");

        //Variables
        int n1,n2,orden;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        n1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        n2=sc.nextInt();
        System.out.println("Introduce el orden, ascendente (1), descendente (2) : ");
        orden=sc.nextInt();

        //Operaciones
            if (orden==1){
                if (n1>n2) {
                    System.out.println("El orden es: " + n2 + "-" + n1);
                }else {
                    System.out.println("El orden es: " + n1 + "-" +  n2);
                }
            }else{
                if (n1>n2) {
                    System.out.println("El orden es: " + n1 + "-" +  n2);
                }else {
                    System.out.println("El orden es: " + n2 + "-" +  n1);
                }
            }

    }
            
     
 }
