package Repaso;//Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a

import java.util.Scanner;
public class Repaso7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        char caracter;

        System.out.println("Introduce tu numero: ");
        numero = scanner.nextInt();
        caracter = (char)numero;

        System.out.println("Tu numero: " + numero);
        System.out.println("En la tabla ASCII es: " + caracter);
    }
}