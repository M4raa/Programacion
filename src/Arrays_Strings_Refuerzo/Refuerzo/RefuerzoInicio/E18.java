package Arrays_Strings_Refuerzo.Refuerzo.RefuerzoInicio;

import java.util.Scanner;
public class E18 {
    public static void main(String[] args){
        //Describimos el programa
        System.out.println("DE NÚMEROS A LETRAS");

        // Declaramos variables
        int n1;

        // Creamos el escaner para recoger los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 0 a 99:");
        n1 = sc.nextInt();
            while (n1<0 && n1>99){
                System.out.println("Error");
                System.out.println("Introduce un número de 0 a 99:");
                n1 = sc.nextInt();
            }
        sc.close();

        String letra;

        //Creamos las operaciones
        switch (n1){
            case 1:
                letra = "Uno";
                break;
            case 2:
                letra = "Dos";
                break;
            case 3:
                letra = "Tres";
                break;
            case 4:
                letra = "Cuatro";
                break;
            case 5:
                letra = "Cinco";
                break;
            case 6:
                letra = "Seis";
                break;
            case 7:
                letra = "Siete";
                break;
            case 8:
                letra = "Ocho";
                break;
            case 9:
                letra = "Nueve";
                break;
            case 10:
                letra = "Diez";
                break;
            case 11:
                letra = "Once";
                break;
            case 12:
                letra = "Doce";
                break;
            case 13:
                letra = "Trece";
                break;
            case 14:
                letra = "Catorce";
                break;
            case 15:
                letra = "Quince";
                break;
            case 16:
                letra = "Dieciséis";
                break;
            case 17:
                letra = "Diecisiete";
                break;
            case 18:
                letra = "Dieciocho";
                break;
            case 19:
                letra = "Diecinueve";
                break;
            case 20:
                letra = "Veinte";
                break;
            case 21:
                letra = "Veintiuno";
                break;
            case 22:
                letra = "Veintidós";
                break;
            case 23:
                letra = "Veintitrés";
                break;
            case 24:
                letra = "Veinticuatro";
                break;
            case 25:
                letra = "Veinticinco";
                break;
            case 26:
                letra = "Veintiséis";
                break;
            case 27:
                letra = "Veintisiete";
                break;
            case 28:
                letra = "Veintiocho";
                break;
            case 29:
                letra = "Veintinueve";
                break;
            case 30:
                letra = "Treinta";
                break;
            case 31:
                letra = "Treinta y uno";
                break;
            case 32:
                letra = "Treinta y dos";
                break;
            case 33:
                letra = "Treinta y tres";
                break;
            case 34:
                letra = "Treinta y cuatro";
                break;
            case 35:
                letra = "Treinta y cinco";
                break;
            case 36:
                letra = "Treinta y seis";
                break;
            case 37:
                letra = "Treinta y siete";
                break;
            case 38:
                letra = "Treinta y ocho";
                break;
            case 39:
                letra = "Treinta y nueve";
                break;
            case 40:
                letra = "Cuarenta";
                break;
            case 41:
                letra = "Cuarenta y uno";
                break;
            case 42:
                letra = "Cuarenta y dos";
                break;
            case 43:
                letra = "Cuarenta y tres";
                break;
            case 44:
                letra = "Cuarenta y cuatro";
                break;
            case 45:
                letra = "Cuarenta y cinco";
                break;
            case 46:
                letra = "Cuarenta y seis";
                break;
            case 47:
                letra = "Cuarenta y siete";
                break;
            case 48:
                letra = "Cuarenta y ocho";
                break;
            case 49:
                letra = "Cuarenta y nueve";
                break;
            case 50:
                letra = "Cincuenta";
                break;
            case 51:
                letra = "Cincuenta y uno";
                break;
            case 52:
                letra = "Cincuenta y dos";
                break;
            case 53:
                letra = "Cincuenta y tres";
                break;
            case 54:
                letra = "Cincuenta y cuatro";
                break;
            case 55:
                letra = "Cincuenta y cinco";
                break;
            case 56:
                letra = "Cincuenta y seis";
                break;
            case 57:
                letra = "Cincuenta y siete";
                break;
            case 58:
                letra = "Cincuenta y ocho";
                break;
            case 59:
                letra = "Cincuenta y nueve";
                break;
            case 60:
                letra = "Sesenta";
                break;
            case 61:
                letra = "Sesenta y uno";
                break;
            case 62:
                letra = "Sesenta y dos";
                break;
            case 63:
                letra = "Sesenta y tres";
                break;
            case 64:
                letra = "Sesenta y cuatro";
                break;
            case 65:
                letra = "Sesenta y cinco";
                break;
            case 66:
                letra = "Sesenta y seis";
                break;
            case 67:
                letra = "Sesenta y siete";
                break;
            case 68:
                letra = "Sesenta y ocho";
                break;
            case 69:
                letra = "Sesenta y nueve";
                break;
            case 70:
                letra = "Setenta";
                break;
            case 71:
                letra = "Setenta y uno";
                break;
            case 72:
                letra = "Setenta y dos";
                break;
            case 73:
                letra = "Setenta y tres";
                break;
            case 74:
                letra = "Setenta y cuatro";
                break;
            case 75:
                letra = "Setenta y cinco";
                break;
            case 76:
                letra = "Setenta y seis";
                break;
            case 77:
                letra = "Setenta y siete";
                break;
            case 78:
                letra = "Setenta y ocho";
                break;
            case 79:
                letra = "Setenta y nueve";
                break;
            case 80:
                letra = "Ochenta";
                break;
            case 81:
                letra = "Ochenta y uno";
                break;
            case 82:
                letra = "Ochenta y dos";
                break;
            case 83:
                letra = "Ochenta y tres";
                break;
            case 84:
                letra = "Ochenta y cuatro";
                break;
            case 85:
                letra = "Ochenta y cinco";
                break;
            case 86:
                letra = "Ochenta y seis";
                break;
            case 87:
                letra = "Ochenta";
                break;
            case 88:
                letra = "Ochenta y ocho";
                break;
            case 89:
                letra = "Ochenta y nueve";
                break;
            case 90:
                letra = "Noventa";
                break;
            case 91:
                letra = "Noventa y uno";
                break;
            case 92:
                letra = "Noventa y dos";
                break;
            case 93:
                letra = "Noventa y tres";
                break;
            case 94:
                letra = "Noventa y cuatro";
                break;
            case 95:
                letra = "Noventa y cinco";
                break;
            case 96:
                letra = "Noventa y seis";
                break;
            case 97:
                letra = "Noventa y siete";
                break;
            case 98:
                letra = "Noventa y ocho";
                break;
            case 99:
                letra = "Noventa y nueve";
                break;
            default:
                letra = "Número no válido";
                break;

        }
        System.out.println("En letra es: " + letra);
    }
}