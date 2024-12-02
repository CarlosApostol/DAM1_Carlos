package Repaso;// Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

import java.util.Scanner;
public class Repaso9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precio;
        double descuento;
        double descuento2 = -1;
        double preciofinal;

        System.out.println("Introduce el precio: ");
        precio = scanner.nextInt();

        descuento = precio*1.21;
        preciofinal = precio + descuento;

        System.out.println("Tu precio con IVA es: " + preciofinal+"€");
    }
}
