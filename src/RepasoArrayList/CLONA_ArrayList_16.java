package RepasoArrayList;

import java.util.ArrayList;

public class CLONA_ArrayList_16 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        ArrayList<String> colores2 = (ArrayList<String>)colores.clone();
        System.out.println(colores2);

    }
}

