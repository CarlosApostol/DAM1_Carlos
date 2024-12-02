package Repaso;// Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

import java.util.Scanner;
public class Repaso13 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int venta;
            int acum = 0;

            do {
                System.out.println("Introduce tu venta (introduce -1 para parar): ");
                venta = scanner.nextInt();
                acum += venta;
            } while (venta != -1);
            System.out.println("Suma de todas las ventas: "+acum);
        }
}

