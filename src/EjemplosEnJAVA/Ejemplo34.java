package EjemplosEnJAVA;//Realiza un programa que calcule la multiplicación de dos números usando el método de las sumas sucesivas

import java.util.Scanner;
    public class Ejemplo34 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero1;
            int numero2;
            int acum;
            int multiplicacion;
            String resul = "";

            System.out.print("Introduce tu numero: ");
            numero1 = scanner.nextInt();
            System.out.print("Introduce por cuanto quieres multiplicar ese numero: ");
            numero2 = scanner.nextInt();
            acum = numero1;
            multiplicacion = numero1 * numero2;
            do {
                for (int i = numero1; i <= numero2; i++) {
                    acum = acum + i;
                    resul += i+ " + ";
                    System.out.print(resul);
                }
            } while (acum < multiplicacion);
            System.out.print("= "+multiplicacion);
        }
    }



