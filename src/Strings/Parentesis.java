//Diseña un programa que nos diga si una cadena está bien parentizada o no.
package Strings;

import utilidades.Utilidades;

public class Parentesis {
    public static void main(String[] args) {
        String texto;

        texto = Utilidades.leerCadena("Introduce tu texto: ");

        comprobarParentesis(texto);
    }

    public static int comprobarParentesis(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '(') {
                contador = 1;
            }
            if (texto.charAt(i) == ')') {
                contador++;
            }
         }
            if (contador != 2) {
                System.out.println("Esta mal parentizada.");
            }
            if (contador == 2) {
                System.out.println("Esta bien parentizada.");
            }return contador;
            }
    }
