package RepasoArrayList;

import java.util.*;
public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Negro");

        for (String element : colores) {
            System.out.println(element);
        }
    }
}
