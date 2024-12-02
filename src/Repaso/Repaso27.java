package Repaso;

import java.util.Scanner;
public class Repaso27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int contador = 0;

        do {
            System.out.println("Dame un numero:");
            num = scanner.nextInt();
            contador += 1;
        } while (num != -1 );

        if (num == -1) {
            contador=contador-1;
            System.out.println("Has introducido "+contador+" numeros.");
        }

    }
}
