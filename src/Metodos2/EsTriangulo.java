//Si te dan tres palitos, puedes o no ser capaz de organizarlos en un triángulo. Por ejemplo, si uno de los palos mide 12 cm de largo y los otros dos tienen un cm de largo, no podrás hacer que los palitos cortos se encuentren en el medio. Para tres longitudes, hay una prueba simple para ver si es posible formar un triángulo:
//Si cualquiera de las tres longitudes es mayor que la suma de las otras dos, no puedes formar un triángulo Escribe un método llamado esTriangulo que toma tres enteros como argumentos y devuelve true o false, dependiendo de si puede o no formar un triángulo a partir de palitos con las longitudes dadas.
package Metodos2;

import java.util.Scanner;
public class EsTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y;
        int m;
        int x;

        System.out.println("Dame el valor de x: ");
        x = scanner.nextInt();

        System.out.println("Dame el valor de y: ");
        y = scanner.nextInt();

        System.out.println("Dame el valor de m: ");
        m = scanner.nextInt();

        EsTriangulo(x, y, m);
    }
    public static boolean EsTriangulo(int y, int x, int m) {
        if (x+y<m) {
            System.out.println("No se pude formar un triangulo, "+m+" es demasiado grande.");
            return false;
        }
        if (m+y<x) {
            System.out.println("No se pude formar un triangulo, "+x+" es demasiado grande.");
            return false;
        }
        if (x+m<y) {
            System.out.println("No se pude formar un triangulo, "+y+" es demasiado grande.");
            return false;
        } else {
            System.out.println("Se puede formar un triangulo.");
            return true;
        }
    }
}

