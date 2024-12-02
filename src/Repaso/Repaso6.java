package Repaso;//Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

import java.util.Scanner;
public class Repaso6 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int numero;

            System.out.println("Introduce tu numero: ");
            numero = scanner.nextInt();

            if (numero%2==0) {
            System.out.println("Tu numero "+numero+" es divisible por 2.");
        }   else {
            System.out.println("Tu numero "+numero+" NO es divisible entre 2.");
            }
            }
}
