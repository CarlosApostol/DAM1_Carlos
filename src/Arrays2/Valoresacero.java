package Arrays2;

import utilidades.Utilidades;

public class Valoresacero {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        rellenarMatrizConCerosYUnos(matriz);

        System.out.println("Matriz de 10x10 con valores aleatorios (0 o 1):");
        mostrarMatriz(matriz);

        contarFilasYColumnasConCeros(matriz);
    }

    public static void rellenarMatrizConCerosYUnos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
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

    public static void contarFilasYColumnasConCeros(int[][] matriz) {
        int filasConCeros = 0;
        int columnasConCeros = 0;

        // AHORA cuenta las filas con todos los valores a 0
        for (int i = 0; i < matriz.length; i++) {
            boolean filaConCeros = true;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    filaConCeros = false;
                    break;
                }
            }
            if (filaConCeros) {
                filasConCeros++;
            }
        }

        // Y cuenta tambien las columnas con todos los valores a 0
        for (int j = 0; j < matriz[0].length; j++) {
            boolean columnaConCeros = true;
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != 0) {
                    columnaConCeros = false;
                    break;
                }
            }
            if (columnaConCeros) {
                columnasConCeros++;
            }
        }
        System.out.println("Filas con todos los valores a 0: " + filasConCeros);
        System.out.println("Columnas con todos los valores a 0: " + columnasConCeros);
    }
}



