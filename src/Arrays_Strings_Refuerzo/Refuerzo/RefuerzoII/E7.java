package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoII;

import java.util.Scanner;

public class E7 {
    public static int canales(int desde, int hasta){
        int cuantos=0;
        if (desde<hasta) {
            if (desde + (99 - hasta) > hasta - desde) {
                cuantos = hasta - desde;
            } else {
                cuantos = desde + (99 - hasta);
            }
        }else {
            if (hasta + (99 - desde) > desde - hasta) {
                cuantos = desde - hasta;
            } else {
                cuantos = hasta + (99 - desde);
            }
        }

        return cuantos;
    }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int actual;
            int destino;
            System.out.println("Introduce el canal en el que estás:");
            actual = sc.nextInt();
            System.out.println("Introduce el canal al que quieres ir:");
            destino = sc.nextInt();
            sc.close();
            System.out.println("Te faltan " + canales(actual, destino) + " saltos para llegar a tu canal.");

        }
}
