package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoII;
import java.util.Scanner;
public class E3 {
    public static String sumaDigitos(String digitos){
        String numeros="";
       int total=0;
        for (int i = 0; i <= digitos.length()-1; i++) {
            int num = Integer.parseInt("" + digitos.charAt(i));
            total += num;
            numeros+=num;
            if (i == digitos.length()-1) {
                numeros += " = " + total;
            } else {
                numeros += " + ";
            }
        }
        return numeros;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Introduce un número entero positivo:");
        num=sc.next();
        sc.close();
        System.out.println("La suma de sus digitos es: " + sumaDigitos(num));
    }
}