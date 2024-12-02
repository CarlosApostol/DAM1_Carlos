//La función a crear recibe la nota como un parámetro entero y muestra el valor en letra.

package Metodos;
import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Introduce la nota: ");
        nota = scanner.nextInt();
        NotaEnLetra(nota);
    }

    public static void NotaEnLetra(int nota) {
        switch (nota) {
            case (1):
                System.out.println("La nota es: uno");
                break;
            case (2):
                System.out.println("La nota es: dos");
                break;
            case (3):
                System.out.println("La nota es: tres");
                break;
            case (4):
                System.out.println("La nota es: cuatro");
                break;
            case (5):
                System.out.println("La nota es: cinco");
                break;
            case (7):
                System.out.println("La nota es: siete");
                break;
            case (8):
                System.out.println("La nota es: ocho");
                break;
            case (9):
                System.out.println("La nota es: nueve");
                break;
            case (10):
                System.out.println("La nota es: diez");
                break;
        }
    }
}
