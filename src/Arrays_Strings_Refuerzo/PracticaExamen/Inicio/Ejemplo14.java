package Arrays_Strings_Refuerzo.PracticaExamen.Inicio;

import java.util.Scanner;
public class Ejemplo14{
    public static void main (String[] args){
        //Titulo
        System.out.println("NOTA EXÁMEN");

        //Variables
        int n;

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        n=sc.nextInt();
        while (n>10 || n<0){
            System.out.println("La nota no puede ser mayor a 10 o menor que 0");
            System.out.println("Introduce la nota: ");
            n=sc.nextInt();
        }

        //Operaciones
        if (n==4){
            System.out.println("Insuficiente");
        } else if (n==5) {
            System.out.println("Suficiente");
        } else if (n==6) {
            System.out.println("Bien");
        } else if (n>=7 && n<9) {
            System.out.println("Notable");
        } else if (n>=9) {
            System.out.println("Sobresaliente");
        }else {
            System.out.println("Muy Deficiente");
        }


    }
}
            
     
 
