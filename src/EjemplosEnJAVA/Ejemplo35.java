package EjemplosEnJAVA;//Realiza un programa que calcule el resto de una división usando el método de las restas sucesivas

import java.util.Scanner;
public class Ejemplo35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int acum;
        double division;

        System.out.print("Introduce tu numero: ");
        numero1 = scanner.nextInt();
        System.out.print("Introduce por cuanto quieres dividir ese numero: ");
        numero2 = scanner.nextInt();
        acum = numero1;
        division = numero1 % numero2;
        do {
            for (int i = numero1; i <= numero2; i++) {
                acum = acum - i;
            }
        } while (acum < division);
        System.out.print(numero1+"/"+numero2+" = "+division);
    }
}
