//Realiza un programa que lea dos valores y los muestre en orden ascendente

package Metodos;
import java.util.Scanner;
public class Descendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Dame tu primer numero: ");
        n1 = scanner.nextInt();
        System.out.println("Dame tu segundo numero: ");
        n2 = scanner.nextInt();

        Compruebaelorden(n1, n2);
    }

    public static void Compruebaelorden(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n2 + " < " + n1);
        } else {
            System.out.println(n1 + " < " + n2);
        }
    }
}

