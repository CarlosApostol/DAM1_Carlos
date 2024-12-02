package EjemplosEnJAVA;//Realiza un programa que imprima todos los números primos entre 3 y 100.

public class Ejemplo29 {
    public static void main(String[] args) {

        for (int i = 3; i <= 100; i++) {

            if (i == 3 || i == 5 || i == 7 || i == 11 || i == 13 || i == 17 || i == 19 || i == 23 || i == 29 || i == 31 || i == 37 || i == 41 || i == 43 || i == 47 || i == 53 || i == 59 || i == 61 || i == 67 || i == 71 || i == 73 || i == 79 || i == 83 || i == 89 || i == 97) {
                System.out.println("El numero "+i+" es un numero primo.");
            } else {
                System.out.println("El numero "+i+" no es un numero primo");
            }
        } }
        }


