package EjemplosEnJAVA;//Realiza un programa que lea una cadena de números binarios y calcule su valor en decimal

import java.util.Scanner;
public class Ejemplo37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1;
        int val2;
        int val3;
        int val4;
        int val5;
        int val6;
        int val7;
        int val8;

        do {
            System.out.println("Esta secuencia se repetira si detecta algo distinto a un 0  1.");
            System.out.print("Introduce tu PRIMER numero (0 o 1, de derecha a izquierda):  ");
            val1 = scanner.nextInt();
            System.out.print("Introduce tu SEGUNDO numero (0 o 1, de derecha a izquierda):  ");
            val2 = scanner.nextInt();
            System.out.print("Introduce tu TERCER numero (0 o 1, de derecha a izquierda):  ");
            val3 = scanner.nextInt();
            System.out.print("Introduce tu CUARTO numero (0 o 1, de derecha a izquierda):  ");
            val4 = scanner.nextInt();
            System.out.print("Introduce tu QUINTO numero (0 o 1, de derecha a izquierda):  ");
            val5 = scanner.nextInt();
            System.out.print("Introduce tu SEXTO numero (0 o 1, de derecha a izquierda):  ");
            val6 = scanner.nextInt();
            System.out.print("Introduce tu SEPRIMO numero (0 o 1, de derecha a izquierda):  ");
            val7 = scanner.nextInt();
            System.out.print("Introduce tu OCTAVO numero (0 o 1, de derecha a izquierda):  ");
            val8 = scanner.nextInt();
            System.out.println("Numero en binario: " + val8 + val7 + val6 + val5 + val4 + val3 + val2 + val1);
        } while (!(val1 == 0 || val1 == 1) || !(val2 == 0 || val2 == 1) || !(val3 == 0 || val3 == 1) || !(val4 == 0 || val4 == 1) || !(val5 == 0 || val5 == 1) || !(val6 == 0 || val6 == 1) || !(val7 == 0 || val7 == 1) || !(val8 == 0 || val8 == 1));

        System.out.print("Tu numero en decimal es:  " + (val8 * 128 + val7 * 64 + val6 * 32 + val5 * 16 + val4 * 8 + val3 * 4 + val2 * 2 + val1 * 1));
    }
}