//Escribid un programa Java para mover todos los 0 al final de un array. Mantened el orden relativo de los otros elementos de la array (distintos de cero).
package Arrays2;

import utilidades.Utilidades;
public class                Moverceros {
    public static void main(String[] args) {
        int tamañoArray = Utilidades.leerEntero("Introduce el tamaño del array: ");
        int[] array = new int[tamañoArray];

        Utilidades.rellenaArray(array, 0, 5);

        System.out.println("Array generado:");
        mostrarArray(array);

        moverCerosAlFinal(array);

        System.out.println("Array después de mover los ceros al final:");
        mostrarArray(array);
    }

    public static void moverCerosAlFinal(int[] array) {
        int indiceNoCero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[indiceNoCero] = array[i];
                if (indiceNoCero != i) {
                    array[i] = 0;
                }
                indiceNoCero++;
            }
        }
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

