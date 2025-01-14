//ORDENA ALFABETICAMENTE
package RepasoArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ALFABETIZA_ArrayList_8 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        Collections.sort(colores);
        System.out.println(colores);
    }
}

