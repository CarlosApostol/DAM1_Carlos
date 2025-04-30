package Ficheros;

import java.io.File;
import java.text.DateFormat;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
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
                    String tipo = "[Directorio]";
                    String leer = "-/";
                    String escribir = "-/";
                    String ejecutar = "-";
                    if (directorioActual.canRead()) {
                        leer = "r/";
                    }
                    if (directorioActual.canWrite()) {
                        escribir = "w/";
                    }
                    if (directorioActual.canExecute()) {
                        ejecutar = "x";
                    }
                    if (directorioActual.isFile()) {
                        tipo = "[Fichero]";
                    }
                    int tamaño = archivos.length;

                    System.out.println((i + 1) + ". " + archivos[i] + "\t\t\t" + tipo + "\t\t" + tamaño + " bytes " + formatter.format(directorioActual.lastModified()) + " " + leer + escribir + ejecutar);
                }
            }

            System.out.println("---------------------------------------------------");
            System.out.println("0. Volver al directorio padre.");
            System.out.println("-1. Salir.");
            System.out.println("-2. Cambiar permisos de un archivo o directorio.");

            System.out.print("\nSelecciona una opción: ");
            int opcion = scanner.nextInt();


            if (opcion == -1) {
                System.out.println("Saliendo...");
                break;
            } else if (opcion == 0) {
                if (directorioActual.getParentFile() != null) {
                    directorioActual = directorioActual.getParentFile();
                } else {
                    System.out.println("No se puede volver mas atras.");
                }
            } else if (opcion == -2) {
                System.out.println("Selecciona el número del archivo/directorio: ");
                int seleccion = scanner.nextInt();
                scanner.nextLine();

                if (seleccion > 0 && seleccion <= archivos.length) {
                    File seleccionado = new File(directorioActual, archivos[seleccion - 1]);
                    System.out.println("¿Qué permiso quieres cambiar? (r,w,x): ");
                    String permiso = scanner.nextLine();

                    if (permiso == "r") {
                       seleccionado.setReadable(true);
                    } else if (permiso == "w") {
                       seleccionado.setWritable(true);
                    } else if (permiso == "x") {
                        seleccionado.setExecutable(true);
                    }

                    }
            } else if (opcion > 0 && opcion <= archivos.length) {
                File seleccionado = new File(directorioActual, archivos[opcion - 1]);
                if (seleccionado.isDirectory()) {
                    directorioActual = seleccionado;
                }
                        }
                    }
                }
            }




