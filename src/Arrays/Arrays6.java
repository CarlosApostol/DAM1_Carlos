package Arrays;//Realiza un programa que imprima el menor de un array de 10 números

import java.util.Scanner;

public class Arrays6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] anArray;
            anArray = new int[10];
            int i;
            int num = 0;

            for (i = 0; i < 10; i++) {
                System.out.println("Dame el numero " + (i + 1));
                anArray[i] = scanner.nextInt();
            }

            num = anArray[0];
            for (i = 0; i<10; i++){
                if (anArray[i] < num) {
                    num = anArray[i];
                }
            }

            System.out.println("El menor es: " + num);
        }

    }

