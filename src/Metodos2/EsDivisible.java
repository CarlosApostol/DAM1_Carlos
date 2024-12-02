//Escribe un método llamado esDivisible que toma dos enteros, n y m, y devuelve verdadero si n es divisible por m, y falso en caso contrario.
package Metodos2;

import java.util.Scanner;
public class EsDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;

        System.out.println("Dame el valor de n: ");
        n = scanner.nextInt();

        System.out.println("Dame el valor de m: ");
        m = scanner.nextInt();

        EsDivisible(n, m);
    }

    public static boolean EsDivisible(int n, int m) {
        if (n != 0 && n % m == 0) {
            System.out.println("Es divisible.");
            return true;
        } else {
            System.out.println("No es divisible.");
            return false;
        }
    }
}

