package EjemplosEnJAVA;//Diseña un algoritmo que lea un número n e imprima esto:

import java.util.Scanner;
public class Ejemplo27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String resultado = "";

        do {
            System.out.print("Introduce tu numero: ");
            numero = scanner.nextInt();
        } while (numero<0);
        for (int i = 1; i <= numero; i++) {
            resultado += i+ " ";
            System.out.println(resultado);
        }
    }
}