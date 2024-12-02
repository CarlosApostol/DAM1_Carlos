// Escribid un programa Java para probar la igualdad de dos vectores. El segundo vector será una copia del primero para probar la igualdad.
package Arrays2;

import utilidades.Utilidades;
import java.util.Arrays;
public class Iguales {
    public static void main(String[] args) {
        int tamañoArray = Utilidades.leerEntero("Introduce el tamaño del array: ");
        int[] array1 = new int[tamañoArray];

        Utilidades.rellenaArray(array1, 1, 10);

        int[] array2 = array1.clone();

        System.out.println("Primer array:");
        mostrarArray(array1);

        System.out.println("Segundo array (copia del primero):");
        mostrarArray(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

