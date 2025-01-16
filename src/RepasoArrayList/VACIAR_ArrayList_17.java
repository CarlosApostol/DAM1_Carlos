package RepasoArrayList;

import java.util.ArrayList;
import java.util.List;

public class VACIAR_ArrayList_17 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        colores.removeAll(colores);
        System.out.println(colores);

    }
}
