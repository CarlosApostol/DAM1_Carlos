package RepasoArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ACTUALIZA_ArrayList_5 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        String color;
        Scanner sc = new Scanner(System.in);
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Negro");

        System.out.println("Dame un color que quieres que tenga esa posicion");
        color = sc.nextLine();
        System.out.println("Dame un numero del 0 al 4");
        int numero = sc.nextInt();

        colores.set(numero, color);

        System.out.println(colores);
    }
}

