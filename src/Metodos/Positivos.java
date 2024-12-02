//La función a crear recibe un entero (opcionalmente un array de enteros) y modifica una variable de clase para acumular la cantidad de positivos. El programa principal será el encargado de mostrar el total de positivos.

package Metodos;
import java.util.Scanner;
public class Positivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] anArray;
        anArray = new int[11];
        int i;
        int contador = 0;


        for (i = 0; i <= 10; i++) {
            System.out.println("Dame el numero " + (i));
            anArray[i] = scanner.nextInt();
            if (anArray[i] >= 0) {
                contador += 1;
            }
        }
        ContarPositivos(contador);
    }

    public static void ContarPositivos(int contador) {
        System.out.println("Positivos: " + (contador-1));
    }
}

