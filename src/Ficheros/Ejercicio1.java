package Ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directorioActual = new File("/");

        while (true) {
            System.out.println("\nDirectorio actual: " + directorioActual.getAbsolutePath());
            System.out.println("---------------------------------------------------");

            String[] archivos = directorioActual.list();
            if (archivos == null) {
                System.out.println("El directorio esta vacio.");
            } else {
                for (int i = 0; i < archivos.length; i++) {
                    System.out.println((i + 1) + ". " + archivos[i]);
                }
            }

            System.out.println("---------------------------------------------------");
            System.out.println("0. Volver al directorio padre.");
            System.out.println("-1. Salir.");

            System.out.print("\nSelecciona una opción: ");
            int opcion = scanner.nextInt();


            if (opcion == -1) {
                System.out.println("Saliendo...");
                break;
            }

            else if (opcion == 0) {
                if (directorioActual.getParentFile() != null) {
                    directorioActual = directorioActual.getParentFile();
                } else {
                    System.out.println("No se puede volver mas atras.");
                }
            } else if (opcion > 0 && opcion <= archivos.length) {
                File seleccionado = new File(directorioActual, archivos[opcion - 1]);
                if (seleccionado.isDirectory()) {
                    directorioActual = seleccionado;
                } else {
                    System.out.println("No es un directorio.");
                }
            }
        }
    }
}







