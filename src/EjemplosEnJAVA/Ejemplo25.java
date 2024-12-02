package EjemplosEnJAVA;//Diseña un programa que calcule el factorial de un número

import java.util.Scanner;
public class Ejemplo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        double factorial = 1;

        do {
            System.out.print("Introduce tu numero: ");
            numero = scanner.nextInt();
        } while (numero<0); //repetir si el numero es menor que 0
        for (int i = 1; i <= numero; i++) { //bucle qeu nos indica que desde 1 hasta el numero que hayamos seleccionado se repetira
            factorial= factorial*i; //el factorial (el numero que tenemos acumulado se multiplicara por i que segun el numero que hayamos puesto se repetira sumando 1 hasta alcanzarlo
        }
        System.out.printf("%d! = %.0f %n", numero, factorial);
        //%d se utiliza para mostrar el número entero (numero) introducido por el usuario.
        //%.0f formatea el valor de factorial como un número de punto flotante sin decimales.
        //El ! es un símbolo que indica "factorial" en matemáticas (como en 5! para el factorial de 5).
        //"%n" se usa para agregar un salto de línea al final de la salida.
    }
}
