package Repaso;//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

import java.util.Scanner;
public class Repaso15 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce tu numero: ");
            numero = scanner.nextInt();
        } while (numero<0);
        if (numero>=0) {
            System.out.println("Tu numero: "+numero);
        }
    }
}
