//Realiza un programa que lea un frase y la convierta en unas siglas. Por ejemplo, Escuela Oficial de Idiomas, se convierte en EOI. Date cuenta que las palabras en minúsculas no forman parte de las siglas.
package Strings;

import utilidades.Utilidades;

public class Siglas {
    public static void main(String[] args) {
        String cadena;

        cadena = Utilidades.leerCadena("Inroduce la cadena: ");

        ConvertirSiglas(cadena);
    }

    public static String ConvertirSiglas(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') {
                System.out.print(cadena.charAt(i));
            }
        } return cadena;
    }
}
