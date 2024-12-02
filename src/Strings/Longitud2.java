//Realiza un programa que lea una cadena de texto y nos diga si alguna palabra tiene una longitud de k caracteres.
package Strings;

import utilidades.Utilidades;

public class Longitud2 {
    public static void main(String[] args) {
        String texto;
        int longitud;


        texto = Utilidades.leerCadena("Introduce tu texto: ");
        longitud = Utilidades.leerEntero("Dime que longitud quieres que las palaras tengan:");
        respuesta(contarLongitud(texto,longitud));
    }

    public static boolean contarLongitud (String texto, int longitud){
        int contador = 0;
        boolean palabra = false;

        for (int i = 0; i < texto.length(); i++) { //Queremos contar cada letra empezando desde la primera que es 0
            contador++;
            if (texto.charAt(i) == ' ') {          //Si el caracter es igual a un espacio, el contador vuelve a 0 ya que no es una palabra
                contador = 0;
            } else {
                if (contador == texto.length()) { //Si no hay siguiente palabra y la que tenemos cumple los requisitos, la sumamos y rompemos el bucle
                    palabra = true;                    //Solo funciona cuando es 1 sola palabra
                    break;
                }
                if (contador == longitud && i == texto.length()-1) {
                    palabra = true;
                    break;
                }
                if (contador == longitud && texto.charAt(i + 1) == ' ') { //Si el contador tiene ya las palabras con los requisitos que pedimos
                    palabra = true;                                          //Y siguiente caracter es un espacio, es el final de la palabra, y si cumple los requisitos se guarda
                }

            }
        }
        return palabra;
    }
    public static void respuesta (boolean palabra) {
        if (palabra) {
            System.out.println("Hay una palabra con la longitud deseada.");
        } else {
            System.out.println("No hay ninguna palabra con la longitud deseada.");
        }
    }
}
