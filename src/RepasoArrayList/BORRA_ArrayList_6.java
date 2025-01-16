package RepasoArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BORRA_ArrayList_6 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Negro");


        System.out.println(colores);
        colores.remove(2);
        System.out.println(colores);
    }
}
