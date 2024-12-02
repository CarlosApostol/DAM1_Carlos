package Repaso;//Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Repaso4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String resultado;

        System.out.println("Introduce tu nombre: ");
        nombre = scanner.nextLine();
        resultado = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();

        JOptionPane.showMessageDialog(null, "Bienvenido, "+resultado);
    }
}
