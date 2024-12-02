//Escribe un programa que lea una frase del teclado y luego imprima las palabras que la forman de forma invertida.
package Strings;

import utilidades.Utilidades;

public class Invertida {
    public static void main(String[] args) {
        String cadena;

        cadena = Utilidades.leerCadena("Introduce tu texto: ");

        invertirFrase(cadena);
        dividirEnPalabras(cadena);
    }

    public static String[] dividirEnPalabras(String cadena) {
        // Quitar espacios en blanco al principio y al final
        cadena = cadena.trim();
        // Reemplazar uno o más espacios en blanco por un solo espacio
        cadena = cadena.replaceAll(" +", " ");
        // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
        return cadena.split(" ");
    }

    public static void invertirFrase(String cadena) {
        // Dividir la frase en palabras diciendo que palabras es el metodo anterior de utilidades
        String[] palabras = dividirEnPalabras(cadena);

        // Imprimir las palabras en orden inverso
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}