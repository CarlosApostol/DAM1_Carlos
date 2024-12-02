package Arrays;//Crea un programa que pida 10 números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos

import java.util.Scanner;
public class Arrays8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] anArray;
        anArray = new int[10];
        int i;
        int suma = 0;
        int sumaneg = 0;
        int acum = 0;
        int acum2 = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Dame el numero " + (i + 1));
            anArray[i] = scanner.nextInt();
            if (anArray[i] < 0) {
                acum = acum;
                sumaneg = acum + anArray[i];
                acum = sumaneg;
            }
            if (anArray[i] >= 0) {
                acum2 = acum2;
                suma = acum2 + anArray[i];
                acum2 = suma;
            }
        }
        System.out.println("La suma de todos los negativos: " + sumaneg);
        System.out.println("La suma de todos los positivos: " + suma);
    }
}

