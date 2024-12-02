package EjemplosEnJAVA;//Precio final

import java.util.Scanner;
    public class Ejemplo20 {
        public static void main(String[] args) {
            int precio;
            double descuento1;
            double descuento2;
            double preciodescontado1;
            double preciodescontado2;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce el precio del producto: ");
            precio = scanner.nextInt();

            scanner.close();

            descuento1 = precio * 0.05;
            preciodescontado1 = precio - descuento1;
            descuento2 = precio * 0.10;
            preciodescontado2 = precio - descuento2;

            if (precio < 6) {
                System.out.println("No hay descuento.");
            } else if (precio >= 6 && precio < 60) {
                System.out.println("Tienes un descuento del 5%, osea de: " + descuento1 + "€");
                System.out.println("Aplicando un descuento del 5%, tu precio es de: " + preciodescontado1 + "€");
            } else if (precio>=60) {
                System.out.println("Tienes un descuento del 10%, osea de: " + descuento2 + "€");
                System.out.println("Aplicando un descuento del 10%, tu precio es de: " + preciodescontado2 + "€");
            }

        }
        }

