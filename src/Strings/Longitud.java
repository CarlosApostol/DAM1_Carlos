//Realiza un programa que lea una cadena de texto y nos diga cuántas palabras tienen una longitud de k caracteres
package Strings;

import utilidades.Utilidades;

public class Longitud {
    public static void main(String[] args) {
        String texto;
        int longitud;
        int palabra = 0;

        texto = Utilidades.leerCadena("Introduce tu texto: ");
        do{
            longitud = Utilidades.leerEntero("Dime que longitud quieres que las palaras tengan:");
        }while(longitud>texto.length());
        System.out.println("Hay "+contarLongitud(texto,longitud,palabra)+" palabras con "+longitud+" caracteres.");
    }

    public static int contarLongitud (String texto, int longitud, int palabra){
    int contador = 0;

    for (int i = 0; i < texto.length(); i++) { //Queremos contar cada letra empezando desde la primera que es 0
        contador++;
        if (texto.charAt(i) == ' ') {          //Si el caracter es igual a un espacio, el contador vuelve a 0 ya que no es una palabra
            contador = 0;
        } else {
            if (contador == texto.length()) { //Si no hay siguiente palabra y la que tenemos cumple los requisitos, la sumamos y rompemos el bucle
                palabra++;                    //Solo funciona cuando es 1 sola palabra
                break;
            }
            if (contador == longitud && i == texto.length()-1) { //Tenemos en cuenta cuantos caracteres tenemos contados y i que sea el ultimo
                palabra++;                                       //Valor de toda la cadena
                break;
            }
            if (contador == longitud && texto.charAt(i + 1) == ' ') { //Si el contador tiene ya las palabras con los requisitos que pedimos
                palabra++;                                          //Y siguiente caracter es un espacio, es el final de la palabra, y si cumple los requisitos se guarda
            }

        }
    }
        return palabra;
    }
}

