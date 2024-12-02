package EjemplosEnJAVA;//Realiza un programa que pida un número natural y escriba sus divisores

import java.util.Scanner;
public class Ejemplo31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce tu numero natural: ");
            numero = scanner.nextInt();
        } while (numero < 0);
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println("El numero " + i + " es divisor de " + numero);
            }
            }
        }
    }

