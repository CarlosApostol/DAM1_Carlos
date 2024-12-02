package Repaso;//Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división)

import java.util.Scanner;
public class Repaso1 {
    public static void main(String[] args) {
        Scanner Numero = new Scanner (System.in);

       int x;
       int y;
       int suma;
       int resta;
       int multiplicacion;
       int division;
       int resto;

        System.out.println("Introduce el primer numero:");
        x = Numero.nextInt();

        System.out.println("Introduce el segundo numero:");
        y = Numero.nextInt();
        Numero.close();

        suma = x+y;
        resta = x-y;
        multiplicacion = x*y;
        division = x/y;
        resto = x%y;

        System.out.println("Los resultados son:");
        System.out.println("La suma de " +x+ " y " +y+ " es: " +suma);
        System.out.println("La resta de " +x+ " y " +y+ " es: " +resta);
        System.out.println("La multiplicacion de " +x+ " y " +y+ " es: " +multiplicacion);
        System.out.println("La division de " +x+ " y " +y+ " es: " +division);
        System.out.println("El resto de la division de " +x+ " y " +y+ " es: " +resto);
    }
}



