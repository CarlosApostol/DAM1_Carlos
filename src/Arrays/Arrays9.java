package Arrays;//Realiza un programa que calcule cuántos números pares e impares tiene un array.

import java.util.Scanner;
public class Arrays9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] anArray;
        anArray = new int[10];
        int i;
        int par = 0;
        int imp = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Dame el numero " + (i + 1));
            anArray[i] = scanner.nextInt();
            if (anArray[i] % 2 == 0) {
                par = par+1;
            }
            if (anArray[i] % 2 != 0) {
                imp = imp+1;
            }
        }

        System.out.println("Hay: " + par + " pares.");
        System.out.println("Hay: " + imp + " impares.");
    }
}