//Escribe un método llamado positivos que muestre cuántos números de un array son positivos
package Metodos2;

import java.util.Scanner;
public class Positivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] anArray;
        anArray = new int[10];
        int i;
        int contador = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Dame el numero " + (i + 1));
            anArray[i] = scanner.nextInt();
            if (anArray[i]>=0) {
                contador += 1;
            }
        }
        System.out.println("Hay "+Positivos(contador)+" positivos.");
    }
    public static int Positivos(int contador) {
        return contador;
    }
}
