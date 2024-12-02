package EjemplosEnJAVA;//Escribe un programa que lea un número y escriba su tabla de multiplicación

import java.util.Scanner;
public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int resultado;

        do {
            System.out.print("Introduce tu numero: ");
            numero = scanner.nextInt();
        } while (numero<0);
        for (int i = 1; i <= 10; i++) {
            resultado= numero*i;
            System.out.println(" Resultado de "+numero+" x "+i+" es: "+resultado);
        }
    }
}