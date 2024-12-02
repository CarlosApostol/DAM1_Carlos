//Escribe un método recursivo llamado potencia que toma un doble x y un entero n y devuelve x^n.
package Metodos2;

import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        int n;

        System.out.println("Dame el valor de x: ");
        x = scanner.nextInt();

        System.out.println("Dame el valor de n: ");
        n = scanner.nextInt();

        System.out.println(Potencia(n, x));
    }

    public static double Potencia(int n, double x) {
       return Math.pow(x, n);
        }
    }

