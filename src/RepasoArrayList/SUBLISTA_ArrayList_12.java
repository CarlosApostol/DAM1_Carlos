package RepasoArrayList;

import java.util.*;

public class SUBLISTA_ArrayList_12 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        List<String> colores2 = colores.subList(0, 3);
        System.out.println(colores2);

    }
}
