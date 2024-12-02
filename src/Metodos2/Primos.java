//Crea un programa que muestre en pantalla todos los números primos entre 3 y 100, usando la función creada en el ejercicio anterior. Puedes llamar a la función creada en el ejercicio anterior de la siguiente forma: Primo.esPrimo(numero);
package Metodos2;

public class Primos {
    public static void main(String[] args) {
        // Recorremos los números entre 3 y 100
        for (int num = 3; num <= 100; num++) {
            // Llamamos a esPrimo para verificar si el número es primo
            if (esPrimo(num)) {
                System.out.println(num + " es un número primo.");
            }
        }
    }

    // Método esPrimo que verifica si el número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i < num; i++) { // Recorre todos los divisores posibles desde 2 hasta num-1
            if (num % i == 0) { // Si encuentra un divisor, no es primo
                return false;
            }
        }
        return true; // Si no se encontró divisor, es primo
    }
}



