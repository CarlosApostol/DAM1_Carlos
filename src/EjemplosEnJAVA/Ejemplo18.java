package EjemplosEnJAVA;//Diseña un algoritmo que recibe horas, minutos y segundos y muestra horas, minutos y segundos resultantes de la adición de un segundo

import java.util.Scanner;
public class Ejemplo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las horas: ");
        int hor = scanner.nextInt();

        System.out.println("Introduce los minutos: ");
        int min = scanner.nextInt();

        System.out.println("Introduce los segundos: ");
        int seg = scanner.nextInt();

        System.out.println("Hora seleccionada: " + hor + ":" + min + ":" + seg);

        System.out.println("Elige a que quieres sumarle 1 (s=segundos, m=minutos, h=horas): ");
        char valor = scanner.next().charAt(0);

        scanner.close();

        switch (valor) {
            case 's':
                seg++;
                if (seg >= 60) {
                    seg = 0;
                    min++;
                    if (min >= 60) {
                        min = 0;
                        hor++;
                        if (hor >= 24) {
                            hor = 0;
                        }
                    }
                }
                System.out.printf("Hora tras sumar 1 segundo: %02d:%02d:%02d%n", hor, min, seg);
                break;
            case 'm':
                min++;
                if (min >= 60) {
                    min = 0;
                    hor++;
                    if (hor >= 24) {
                        hor = 0;
                    }
                }
                System.out.printf("Hora tras sumar 1 minuto: %02d:%02d:%02d%n", hor, min, seg);
                break;

            case 'h':

                hor++;
                if (hor >= 24) {
                    hor = 0;
                }
                System.out.printf("Hora tras sumar 1 hora: %02d:%02d:%02d%n", hor, min, seg);
                break;
        }
    }
}
