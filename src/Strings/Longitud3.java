//Escribe un programa que lea una cadena y un número entero k y muestre el mensaje “Todas las cadenas son cortas” si todas las palabras tienen una longitud estrictamente menor que k y “Hay alguna palabra larga” en caso contrario.
package Strings;

import utilidades.Utilidades;

public class Longitud3 {
    public static void main(String[] args) {
        String texto;
        int longitud;


        texto = Utilidades.leerCadena("Introduce tu texto: ");
        do {
            longitud = Utilidades.leerEntero("Dime que longitud quieres que las palaras tengan:");
        }while(longitud>texto.length());
        respuesta(contarLongitud(texto,longitud));
    }

    public static boolean contarLongitud (String texto, int longitud){
        int contador = 0;
        boolean palabra = false;

        for (int i = 0; i < texto.length(); i++) { //Queremos contar cada letra empezando desde la primera que es 0
            if (texto.charAt(i) != ' ') {          //Si el caracter es igual a un espacio, el contador vuelve a 0 ya que no es una palabra
                contador++;
                if (contador>longitud) {
                    palabra = true;
                    break;
                }
            } else {
                contador = 0;
            }

        }
        return palabra;
    }
    public static void respuesta (boolean palabra) {
        if (palabra) {
            System.out.println("Alguna palabra es mas larga que la longitud deseada.");
        } else {
            System.out.println("Todas las palabras son cortas.");
        }
    }
}