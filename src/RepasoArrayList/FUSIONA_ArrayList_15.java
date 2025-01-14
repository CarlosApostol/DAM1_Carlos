package RepasoArrayList;

import java.util.ArrayList;

public class FUSIONA_ArrayList_15 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        ArrayList<String> colores2 = new ArrayList<>();
        colores2.add("Marron");
        colores2.add("Negro");
        colores2.add("Blanco");
        colores2.add("Rosa");

        ArrayList<String> coloresfin = new ArrayList<>();
        coloresfin.addAll(colores);
        coloresfin.addAll(colores2);

        System.out.println(coloresfin);
    }
}

