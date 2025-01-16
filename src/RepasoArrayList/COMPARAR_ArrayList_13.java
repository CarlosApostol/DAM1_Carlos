package RepasoArrayList;

import java.util.ArrayList;


public class COMPARAR_ArrayList_13 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        ArrayList<String> colores2 = new ArrayList<>();
        colores2.add("Rojo");
        colores2.add("Verde");
        colores2.add("Amarillo");

        ArrayList<String> c3 = new ArrayList<>();
        for (String comparar : colores)
        c3.add(colores2.contains(comparar) ? "Si" : "No" );
        System.out.println(c3);
    }
}

