package Escritura_de_datos;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {

        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            coches.add(sc.nextLine());
        } while (!Objects.equals(sc.next(), ""));
        sc.close();
        System.out.println(coches);
    }
}