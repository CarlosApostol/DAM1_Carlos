package Arrays;//Realiza un programa que lea 10 números y los muestre en orden inverso

import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] anArray;
        anArray = new int[10];
        int num = 0;
        int i;

        for (i = 0; i < 10; i++) {
            System.out.println("Dame el numero "+(i+1));
            anArray[i] = scanner.nextInt();
        }
        for (i = 10; i > 0;) {
            i -= 1;
            System.out.println(anArray[i]);
        }

    }
}
