package Repaso;//Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
//NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.

import java.util.Scanner;
public class Repaso20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int operacion;
        int i = 0;

        System.out.println("Introduce tu numero: ");
        numero = scanner.nextInt();
        if (numero <= 1) {
            System.out.println("Este numero no es primo.");
        }
        for (i = 1; i <= numero; ) {
            i += 1;
            operacion = numero % i;
            if (operacion == 0 && i != 1 && i != numero) {
                System.out.println("No es primo.");
                break;
            } else {
                System.out.println("Es primo.");
                break;
            }
        }
    }
}
