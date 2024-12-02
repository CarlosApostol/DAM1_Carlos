package Repaso;//Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math

import java.util.Scanner;
public class Repaso5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;
        double pi = 3.14;
        double area;

        System.out.println("Introduce el radio: ");
        radio = scanner.nextDouble();

        area = pi*(radio*radio);

        System.out.println("El area es: "+area);
    }
}
