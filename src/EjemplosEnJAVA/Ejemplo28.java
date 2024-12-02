package EjemplosEnJAVA;//Escribe un programa que muestre si un número es primo o no.

import java.util.Scanner;
public class Ejemplo28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce tu numero impar (mayor que 3): ");
            numero = scanner.nextInt();
        } while (numero < 0);
        if (numero == 2 || numero == 3 || numero == 5) {
            System.out.println("Es un numero primo.");
        }
        if (numero != 2 && numero%2 == 0) {
            System.out.println("Es un par, los numeros pares no son numeros primos.");
        } else if (numero !=2 && numero%2 != 0){
        for (int i = 3; i <= numero/2; i+=2) {

            if (numero%i != 0) {
                System.out.println("El resultado de dividir "+numero+" y "+i+ " es: "+numero%i+" por lo tanto "+numero+" puede ser un numero primo si todas las operaciones dan este texto.");
            } else {
                System.out.println("El resultado de dividir "+numero+" y "+i+ " es: "+numero%i+" por lo tanto "+numero+" no es un numero primo, el resto de operaciones no importan.");
                break;
            }
        } }


    }
}




