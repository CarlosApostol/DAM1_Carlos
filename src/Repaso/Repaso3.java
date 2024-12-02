package Repaso;//Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

import java.util.Scanner;
public class Repaso3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String resultado;

        System.out.println("Introduce tu nombre: ");
        nombre = scanner.nextLine();
        resultado = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();

        System.out.println("Bienvenido, "+resultado);
    }
}
