package RepasoArrayList;

import java.util.ArrayList;

public class COMPRUEBA_ArrayList_18 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        System.out.println(colores.isEmpty());
        colores.removeAll(colores);
        System.out.println(colores.isEmpty());

    }
}

