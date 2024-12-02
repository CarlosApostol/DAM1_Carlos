//Escribe un programa que muestre la cantidad de dígitos que aparecen en una cadena. Por ejemplo, la cadena “1 20 hola 234 45a”, tiene 8 dígitos.
package Strings;

import utilidades.Utilidades;

public class Digitos {
    public static void main(String[] args) {
        int contador = 0;
        String cadena;

        cadena = Utilidades.leerCadena("Inroduce la cadena: ");
        System.out.println("Hay " + numero(cadena, contador) + " digitos.");
    }

    public static int numero(String cadena, int contador) {
        for (int i = 0; i < cadena.length(); i++) {
                switch (cadena.charAt(i)) {
                    case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                        contador++;
                        if (cadena.charAt(i) + 1 <= 0) {
                            contador = contador-1;
                        }
                }
        }
            return contador;

    }
}
