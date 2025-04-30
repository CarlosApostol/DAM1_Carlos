package Ficheros;

import java.io.*;
import java.text.DateFormat;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        Scanner scanner = new Scanner(System.in);
        File directorioActual = new File("/");

        while (true) {
            mostrarDirectorioActual(directorioActual, formatter);

            int opcion = scanner.nextInt();

            if (opcion == -1) {
                System.out.println("Saliendo...");
                break;
            } else if (opcion == 0) {
                directorioActual = volverAlDirectorioPadre(directorioActual);
            } else if (opcion == -2) {
                cambiarPermisos(scanner, directorioActual);
            } else if (opcion == -3) {
                contarArchivosPorExtension(scanner, directorioActual);
            } else if (opcion == -4) {
                buscarArchivoPorNombre(scanner, directorioActual);
            } else if (opcion == -5) {
                crearDirectorio(scanner, directorioActual);
            } else if (opcion == -6) {
                eliminarDirectorio(scanner, directorioActual);
            } else if (opcion > 0) {
                directorioActual = cambiarDeDirectorio(directorioActual, opcion);
            }
        }
    }

    public static void mostrarDirectorioActual(File directorioActual, DateFormat formatter) {
        System.out.println("\nDirectorio actual: " + directorioActual.getAbsolutePath());
        System.out.println("---------------------------------------------------");

        String[] archivos = directorioActual.list();
        if (archivos == null) {
            System.out.println("El directorio está vacío.");
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

                System.out.println((i + 1) + ". " + archivos[i] + "\t\t\t" + tipo + "\t\t" + tamaño + " bytes " +
                        formatter.format(directorioActual.lastModified()) + " " + leer + escribir + ejecutar);
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println("0. Volver al directorio padre.");
        System.out.println("-1. Salir.");
        System.out.println("-2. Cambiar permisos de un archivo o directorio.");
        System.out.println("-3. Contar archivos por extensión.");
        System.out.println("-4. Buscar archivo por nombre.");
        System.out.println("-5. Crear un nuevo directorio.");
        System.out.println("-6. Eliminar un directorio");

        System.out.print("\nSelecciona una opción: ");
    }

    public static File volverAlDirectorioPadre(File directorioActual) {
        if (directorioActual.getParentFile() != null) {
            return directorioActual.getParentFile();
        } else {
            System.out.println("No se puede volver más atrás.");
            return directorioActual;
        }
    }

    public static void cambiarPermisos(Scanner scanner, File directorioActual) {
        System.out.println("Selecciona el número del archivo/directorio: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        String[] archivos = directorioActual.list();
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
    }

    public static void contarArchivosPorExtension(Scanner scanner, File directorioActual) {
        System.out.println("¿Qué extensión quieres buscar?: ");
        scanner.nextLine();
        String extension = scanner.nextLine();
        int contador = 0;

        String[] archivos = directorioActual.list();
        for (String nombreArchivo : archivos) {
            if (new File(directorioActual, nombreArchivo).isFile() && nombreArchivo.endsWith(extension)) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " ficheros con la extensión " + extension);
    }

    public static void buscarArchivoPorNombre(Scanner scanner, File directorioActual) {
        System.out.println("Introduce el nombre del archivo a buscar: ");
        scanner.nextLine();
        String nombreArchivo = scanner.nextLine();
        File[] archivosEnDirectorio = directorioActual.listFiles();
        boolean encontrado = false;

        for (File archivo : archivosEnDirectorio) {
            if (buscarArchivo(archivo, nombreArchivo)) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Archivo no encontrado.");
        }
    }

    public static void crearDirectorio(Scanner scanner, File directorioActual) {
        System.out.println("¿Qué nombre quieres para tu directorio?");
        scanner.nextLine();
        String nombre = scanner.nextLine();

        File nuevoDirectorio = new File(directorioActual, nombre);
        nuevoDirectorio.mkdir();
    }

    public static void eliminarDirectorio(Scanner scanner, File directorioActual) {
        System.out.println("¿Qué directorio quieres borrar?:");
        scanner.nextLine();
        String borrar = scanner.nextLine();
        File directorioABorrar = new File(directorioActual, borrar);

        if (directorioABorrar.exists() && directorioABorrar.isDirectory()) {
            File[] archivosEnDirectorio = directorioABorrar.listFiles();
            if (archivosEnDirectorio != null) {
                for (File archivo : archivosEnDirectorio) {
                    archivo.delete();
                }
            }
            directorioABorrar.delete();
        }
    }

    public static File cambiarDeDirectorio(File directorioActual, int opcion) {
        String[] archivos = directorioActual.list();
        if (opcion > 0 && opcion <= archivos.length) {
            File seleccionado = new File(directorioActual, archivos[opcion - 1]);
            if (seleccionado.isDirectory()) {
                return seleccionado;
            }
        }
        return directorioActual;
    }

    public static boolean buscarArchivo(File directorio, String nombreArchivo) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    if (buscarArchivo(archivo, nombreArchivo)) {
                        return true;
                    }
                } else if (archivo.getName().equals(nombreArchivo)) {
                    System.out.println("Archivo encontrado: " + archivo.getAbsolutePath());
                    return true;
                }
            }
        }
        return false;
    }
}






