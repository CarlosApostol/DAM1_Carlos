//Escribe un programa que calcule el segundo valor más grande en un array de enteros (se puede usar Arrays.sort())
package Arrays2;

import utilidades.Utilidades;

public class Segundomayor {
    public static void main(String[] args) {
        int tamañoArray = Utilidades.leerEntero("Introduce el tamaño del array: ");
        int[] arrayOriginal = new int[tamañoArray];

        // Rellenamos el array con valores aleatorios entre 1 y 10
        Utilidades.rellenaArray(arrayOriginal, 1, 10);

        System.out.println("Array original:");
        mostrarArray(arrayOriginal);

        // Creamos un array inverso
        int[] arrayInverso = copiarInverso(arrayOriginal);

        System.out.println("Array inverso:");
        mostrarArray(arrayInverso);
    }

    public static int[] copiarInverso(int[] arrayOriginal) {
        int[] arrayInverso = new int[arrayOriginal.length];

        // Copiamos los elementos en orden inverso
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInverso[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        return arrayInverso;
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

