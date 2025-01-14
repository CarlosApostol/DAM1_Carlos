package RepasoArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MEZCLA_ArrayList_10 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        Collections.shuffle(colores);
        System.out.println(colores);
    }
}
