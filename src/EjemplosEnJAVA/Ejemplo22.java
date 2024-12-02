package EjemplosEnJAVA;//Escribe un programa que pida al usuario 10 números y que muestre cuántos son positivos.

import java.util.Scanner;
public class Ejemplo22 {
    public static void main(String[] args) {
        int numero;
        int positivos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tus numeros: ");
        numero = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce tus numeros: "+i+": ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                positivos++;
            }
            System.out.println("Has introducido " + positivos + " números positivos.");
        }
        scanner.close();
    }
}

