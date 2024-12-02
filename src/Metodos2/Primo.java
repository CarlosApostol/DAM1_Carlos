//Crea un método llamado esPrimo que devuelva un booleano para indicar si el número pasado como parámetro es primo
package Metodos2;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Dame tu numero: ");
        num = scanner.nextInt();

        // Llama a esPrimo y muestra el resultado
        if (esPrimo(num)) {
            System.out.println("Es un numero primo.");
        } else {
            System.out.println("No es un numero primo.");
        }
    }

    // Método esPrimo que verifica si el número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) { // Recorre todos los divisores posibles desde 2 hasta num-1
            if (num % i == 0) { // Si encuentra un divisor, no es primo
                return false;
            }
        }
        return true; // Si no encuentra divisor, es primo
    }
}