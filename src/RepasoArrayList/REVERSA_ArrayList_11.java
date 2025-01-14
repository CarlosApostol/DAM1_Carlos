package RepasoArrayList;

import java.util.*;

public class REVERSA_ArrayList_11 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        Collections.reverse(colores);
        System.out.println(colores);
    }
}

