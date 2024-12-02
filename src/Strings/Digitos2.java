//Escribe un programa que muestre la cantidad de números que aparecen en una cadena. Por ejemplo, la cadena “1 20 hola 234 45a”, tiene 3 números. Las palabras deben separarse por blancos.
package Strings;

import utilidades.Utilidades;

public class Digitos2 {
    public static void main(String[] args) {
        int contador = 0;
        String cadena;
        int numeros = 0;

        cadena = Utilidades.leerCadena("Inroduce la cadena: ");
        System.out.println("Hay " + numero(cadena, contador, numeros) + " numeros.");
    }

    public static int numero(String cadena, int contador, int numeros) {
        for (int i = 0; i < cadena.length(); i++) {
            contador++;
            if (cadena.charAt(i) != '1' && cadena.charAt(i) != '2' && cadena.charAt(i) != '3' && cadena.charAt(i) != '4' && cadena.charAt(i) != '5' && cadena.charAt(i) != '6' && cadena.charAt(i) != '7' && cadena.charAt(i) != '8' && cadena.charAt(i) != '9' && cadena.charAt(i) != '0') {
                contador = 0;
                 }
                    else {
                        if (i+1 == cadena.length()){
                        numeros++;
                        break;
                         }
                    else{
                        if (cadena.charAt(i+1) == ' ') {
                            numeros++;
                        }
                    }

                }
            }
        return numeros;
    }
}
