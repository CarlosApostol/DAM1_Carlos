package Repaso;// Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona

import java.util.Scanner;
public class Repaso2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Introduce tu primer numero: ");
        num1 = scanner.nextInt();

        System.out.println("Introduce tu segundo numero: ");
        num2 = scanner.nextInt();

        scanner.close();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(" ");
        }
        if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        }
        if (num1 == num2) {
            System.out.println(num1 + " y " + num2 + " son iguales.");
        }
    }
}