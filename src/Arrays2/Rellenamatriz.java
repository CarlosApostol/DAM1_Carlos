//Rellena una matriz de 10 x 10 con valores aleatorios (0 o 1) e imprímela de la siguiente forma:
package Arrays2;

import utilidades.Utilidades;
public class Rellenamatriz {
    public static void main(String[] args) {
        // Primero voy a definir una matriz de 10x10:
        int[][] matriz = new int[10][10];

        // AHORA relleno la matriz con valores aleatorios entre 0 y 1
        rellenarMatrizConCerosYUnos(matriz);

        // AHORA que me imprima la matriz de forma leible (10x10)
        System.out.println("Matriz de 10x10 con valores aleatorios (0 o 1):");
        mostrarMatriz(matriz);
    }

    public static void rellenarMatrizConCerosYUnos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 2);  // Genera un 0 o un 1
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
