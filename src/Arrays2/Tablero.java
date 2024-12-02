//Escribe un programa que dada una matriz de 8x8 que puede contener los números del 0 al 3, imprima un tablero como el del ejemplo (en Arrays2).
package Arrays2;

import utilidades.Utilidades;
public class Tablero {
    public static void main(String[] args) {
        int[][] tablero = new int[8][8];

        rellenarMatriz(tablero);

        System.out.println("Tablero de 8x8:");
        mostrarTablero(tablero);
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor;
                do {
                    valor = Utilidades.leerEntero("Introduce un valor entre 0 y 3 para la posición [" + i + "][" + j + "]: ");
                } while (valor < 0 || valor > 3);
                matriz[i][j] = valor;
            }
        }
    }

    public static void mostrarTablero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
