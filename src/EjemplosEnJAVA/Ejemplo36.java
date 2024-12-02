package EjemplosEnJAVA;//Realiza un programa que lea un número entero decimal (máximo 255) e imprima su valor en binario

import java.util.Scanner;
public class Ejemplo36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numerointroducido;
        int numero2;


        do {
            System.out.print("Introduce tu numero (entre 0 y 255): ");
            numero1 = scanner.nextInt();
        } while (numero1 < 0 && numero1 > 255);
        while (numero1 > 1) {
            numerointroducido = numero1;
            numero2 = numero1 / 2;
            System.out.println(numerointroducido + " / " + 2 + " = "+numero2);
            System.out.println("Su residuo: "+numerointroducido%2);
            numero1 = numero2 / 2;
            System.out.println(numero2 + " / " + 2 + " = "+numero1);
            System.out.println("Su residuo: "+numero2%2);
        } if (numero1 == 1);
            System.out.println("En binario es: "+1+" y los demas residuos en orden de abajo a arriba");
    }
}
