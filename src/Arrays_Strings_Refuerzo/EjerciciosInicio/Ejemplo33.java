package Arrays_Strings_Refuerzo.EjerciciosInicio;

public class Ejemplo33 {
    public static void main(String[] args) {

        int n1=1;
        int n2=1;
        int num;
        for (int i=3;i<=40;i++){
            num = n1+n2;
            System.out.println((double)num / (double)n2);
            n1 = n2;
            n2 = num;
        }
    }
}
