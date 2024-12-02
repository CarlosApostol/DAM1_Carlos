package EjemplosEnJAVA;//Año bisiesto

import java.util.Scanner;
    public class Ejemplo21 {
        public static void main(String[] args) {
            int year;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce tu año: ");
            year = scanner.nextInt();

            scanner.close();

            //Si el año dividido por 4, 100 y 400 da 0 es bisiesto, de lo contrario no.
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Tu año " + year + " es un año bisiesto.");
            } else {
                System.out.println("Tu año " + year + " no es un año bisiesto.");
            }
        }
    }



