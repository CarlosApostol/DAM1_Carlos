package RepasoArrayList;

import java.util.*;

public class INTERCAMBIA_ArrayList_14 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        Collections.swap(colores, 0, 2);
        System.out.println(colores);
    }
}

