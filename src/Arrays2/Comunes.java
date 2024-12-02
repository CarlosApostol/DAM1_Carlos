// Escribid un programa Java para encontrar los elementos comunes entre dos arrays de enteros.
package Arrays2;

import utilidades.Utilidades;
public class Comunes {
    public static void main(String[] args) {
        int tamañoArray1 = Utilidades.leerEntero("Introduce el tamaño del primer array: ");
        int tamañoArray2 = Utilidades.leerEntero("Introduce el tamaño del segundo array: ");

        int[] array1 = new int[tamañoArray1];
        int[] array2 = new int[tamañoArray2];

        // Rellenamos los arrays con valores aleatorios entre 1 y 10
        Utilidades.rellenaArray(array1, 1, 10);
        Utilidades.rellenaArray(array2, 1, 10);

        // Mostramos los arrays generados
        System.out.println("Primer array:");
        mostrarArray(array1);

        System.out.println("Segundo array:");
        mostrarArray(array2);

        // Encontramos y mostramos los elementos comunes
        encontrarElementosComunes(array1, array2);
    }

    public static void encontrarElementosComunes(int[] array1, int[] array2) {
        boolean hayComunes = false;
        System.out.println("Elementos comunes entre ambos arrays:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    hayComunes = true;
                    break;
                }
            }
        }

        if (!hayComunes) {
            System.out.println("No se encontraron elementos comunes.");
        }
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

