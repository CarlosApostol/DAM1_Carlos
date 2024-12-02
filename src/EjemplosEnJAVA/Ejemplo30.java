package EjemplosEnJAVA;//Realiza un programa que averigüe si una palabra o frase es palíndroma.

import java.util.Scanner;
public class Ejemplo30 {
    public static void main(String[] args) {
        String palabra;
        String palabraInvertida;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");
        palabra = scanner.nextLine();
        //La conviertes en minuscula para eviar errores con las mayusculas
        palabra = palabra.toLowerCase();
        //Invertimos la palabra usando StringBuilder reverse
        palabraInvertida = new StringBuilder(palabra).reverse().toString();
        //Ponemos que si nuestra palabra equivale al valor palabrainvertida (equals=equivale) nos de que es un palindromo
        if (palabra.equals(palabraInvertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}
