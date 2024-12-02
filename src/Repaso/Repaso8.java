package Repaso;//Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.

import java.util.Scanner;
public class Repaso8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        char caracter;

        System.out.println("Introduce tu caracter de la tabla ASCII: ");
        caracter = scanner.next().charAt(0);
        numero = (int) caracter;

        System.out.println("Tu caracter: " + caracter);
        System.out.println("Su numero es: " + numero);
    }
}


