package Repaso;//Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos)

import java.util.Scanner;
public class Repaso16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseña = "pula";
        String contranew;
        int acum = 0;

        do {
        System.out.println("Introduce tu contraseña: ");
        contranew = scanner.nextLine();
        acum += 1;
        System.out.println("Intento numero: "+acum);
        } while (acum != 3 && !contranew.equals(contraseña) );
        if (acum == 3 && !contranew.equals(contraseña)) {
            System.out.println("Intentos maximos alcanzados.");
        }
        if (contranew.equals(contraseña)) {
            System.out.println("Enhorabuena!");
        }
        }
}
