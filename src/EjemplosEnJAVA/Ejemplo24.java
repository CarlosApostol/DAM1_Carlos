package EjemplosEnJAVA;//Diseña un algoritmo que lea un conjunto de notas del teclado hasta que se introduzca -1 y muestre la nota media y si había un 10 o no.

import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0; // Cambiamos a 0 para contar correctamente
        int x;
        int acumulados = 0; // ponemos "acumulados" a 0

        do {
            System.out.print("Introduce un número que no sea -1: ");
            x = scanner.nextInt();

            if (x > -1) { // Solo sumamos si es mayor que -1
                positivos++;
                acumulados += x; // Acumulamos el numero anterior que introducimos
            }

        } while (x != -1); // Continuamos hasta que metamos un -1

        if (positivos > 0) { // Solo hacemos la división si hay al menos un número positivo
            int resultado = acumulados / positivos;
            System.out.println("Has introducido " + positivos + " números.");
            System.out.println("La media es de: " + resultado);
        } else {
            System.out.println("No has introducido ningún número válido.");
        }

        scanner.close();
    }
}