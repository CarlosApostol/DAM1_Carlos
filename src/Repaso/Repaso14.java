package Repaso;//Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.

import java.util.Scanner;
public class Repaso14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        double menosx;
        double masx;

        System.out.println("Introduce el valor de a: ");
        a = scanner.nextInt();
        System.out.println("Introduce el valor de b: ");
        b = scanner.nextInt();
        System.out.println("Introduce el valor de c: ");
        c = scanner.nextInt();

        masx = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        menosx = (-b-Math.sqrt(b*b-4*a*c))/2*a;

        System.out.println("La equacion en + es: "+masx);
        System.out.println("La equacion en - es: "+menosx);
    }
}
