package RepasoArrayList;

import java.util.ArrayList;

public class ArrayList_22 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        for (int i = 0; i< colores.size(); i++) {
            System.out.println("Numero: "+i+" Color: "+colores.get(i));
        }

    }
}
