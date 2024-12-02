package EjemplosEnJAVA;//Escribe un programa que pida al usuario n números y que muestre cuántos son positivos (para acabar el programa, el usuario debe introducir el número 0)

import java.util.Scanner;
public class Ejemplo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int x;

        do {
            System.out.print("Introduce un número que no sea 0: ");
            x = scanner.nextInt();

            if (x > 0) {
                positivos++;
            }
        } while (x != 0);
        System.out.println("Has introducido " + positivos + " números positivos.");

        scanner.close();
    }
}
