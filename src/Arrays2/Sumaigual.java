// Escribid un programa Java para encontrar todos los pares de elementos en un array cuya suma es igual a un número especificado por el usuario.
package Arrays2;

import utilidades.Utilidades;
public class Sumaigual {
    public static void main(String[] args) {
        int tamañoArray = Utilidades.leerEntero("Introduce el tamaño del array: ");
        int[] array = new int[tamañoArray];

        // Rellenamos el array con valores aleatorios entre 1 y 20
        Utilidades.rellenaArray(array, 1, 20);

        System.out.println("Array generado:");
        mostrarArray(array);

        int sumaObjetivo = Utilidades.leerEntero("Introduce la suma objetivo: ");
        encontrarParesConSuma(array, sumaObjetivo);
    }

    public static void encontrarParesConSuma(int[] array, int sumaObjetivo) {
        boolean hayPares = false;
        System.out.println("Pares de elementos cuya suma es " + sumaObjetivo + ":");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sumaObjetivo) {
                    System.out.println(array[i] + " + " + array[j] + " = " + sumaObjetivo);
                    hayPares = true;
                }
            }
        }

        if (!hayPares) {
            System.out.println("No se encontraron pares cuya suma sea " + sumaObjetivo);
        }
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

