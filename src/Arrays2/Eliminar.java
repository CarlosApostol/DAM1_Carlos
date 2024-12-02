//Escribid un programa Java para eliminar de un array un elemento específico (índice) introducido por el usuario (moviéndolo al final del mismo). Si el índice es mayor que el tamaño del array, debe volver a pedírselo.
package Arrays2;

import utilidades.Utilidades;
public class Eliminar {
    public static void main(String[] args) {
        int tamañoArray = Utilidades.leerEntero("Introduce el tamaño del array: ");
        int[] array = new int[tamañoArray];

        Utilidades.rellenaArray(array, 1, 20);

        System.out.println("Array generado:");
        mostrarArray(array);

        int indice;
        do {
            indice = Utilidades.leerEntero("Introduce el índice del elemento que deseas eliminar (mover al final): ");
            if (indice < 0 || indice >= array.length) {
                System.out.println("Índice fuera de rango. Intenta de nuevo.");
            }
        } while (indice < 0 || indice >= array.length);

        moverElementoAlFinal(array, indice);

        System.out.println("Array después de mover el elemento al final:");
        mostrarArray(array);
    }

    public static void moverElementoAlFinal(int[] array, int indice) {
        int elemento = array[indice];

        for (int i = indice; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = elemento;
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

