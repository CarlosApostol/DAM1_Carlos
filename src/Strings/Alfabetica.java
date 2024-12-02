//Una palabra es alfabética si todas sus letras están ordenadas alfabéticamente. Por ejemplo, “amor”, “chino” e “himno” son palabras alfabéticas. Diseña un programa que nos diga si una palabra es alfabética o no.
package Strings;

import utilidades.Utilidades;

public class Alfabetica {
    public static void main(String[] args) {
        String cadena;
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


        cadena = Utilidades.leerCadena("Introduce tu texto: ");

        if (esAlfabetica(cadena)) {
            System.out.println("La palabra es alfabética.");
        } else {
            System.out.println("La palabra no es alfabética.");
        }
    }

    // Método que comprueba si la palabra es alfabética
    public static boolean esAlfabetica(String cadena) {
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) < cadena.charAt(i - 1)) { // Si el carácter actual es menor que el anterior, no está ordenado alfabéticamente
                return false; // La palabra no es alfabética
            }
        }
        return true; // La palabra es alfabética
    }
}
