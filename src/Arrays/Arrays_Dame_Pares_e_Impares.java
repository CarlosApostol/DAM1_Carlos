package Arrays;//Realiza un programa que calcule cuántos números pares e impares tiene un array.

import java.util.Scanner;
public class Arrays_Dame_Pares_e_Impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] anArray;
        anArray = new int[1];
        int par = 0;
        int num = 0;

        System.out.println("Dame tu numero: ");
        anArray[0] = scanner.nextInt();

        par = anArray[0] % 2;
        num = anArray[0];

        if (par == 0) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i + " ");
                i += 1;
            }
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.println(i + " ");
                i += 1;
            }
        }
    }
}
