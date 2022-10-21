package metodos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int año;
            System.out.print("Introduce año: ");
            año = sc.nextInt();
            if (esBisiesto(año)) { // llamada al método
                System.out.println("Bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        }
    }

    /*
     * método que calcula si un año es o no bisiesto
     */
    public static boolean esBisiesto(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
            return true;
        else
            return false;
    }

}
