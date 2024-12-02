package EjemplosEnJAVA;//Diseña un algoritmo para jugar a “adivinar un número”.

import java.util.Random;
import java.util.Scanner;
public class Ejemplo38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random(System.currentTimeMillis());

        int secreto;
        int numero;

        System.out.println("Juguemos a un juego, adivina en que numero estoy pensando (del 1 al 100)");
        secreto = aleatorio.nextInt(100);

        do {
            System.out.print("Introduce el numero en el que crees que pienso: ");
            numero = scanner.nextInt();
            if (numero == -1) {
                System.out.println("Gano yo! Facilito el tutorial, que manco eres.");
                break;
            }
            if (numero < secreto) {
                System.out.println("El numero secreto es mas grande.");
            }
            if (numero > secreto) {
                System.out.println("El numero secreto es mas pequeño.");
            }
        } while (numero != secreto);

        if (numero == secreto)
            System.out.print("Felicidades, has ganado, estaba pensando en el numero: " + secreto);
    }
}