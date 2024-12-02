package Repaso;//Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

import java.util.Random;
import java.util.Scanner;
public class Repaso18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random(System.currentTimeMillis());

        int num1;
        int num2;
        int rando;
        int acum = 0;

        System.out.println("Dame tu primer numero: ");
        num1 = scanner.nextInt();

        System.out.println("Dame tu segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("Aqui tienes 10 numeros aleatorios entre "+num1+" y "+num2+":");
        do {
            rando = aleatorio.nextInt(num1, num2);
            System.out.println(rando);
            acum += 1;
        } while (acum != 10);
        System.out.println("Fin.");
    }
}
