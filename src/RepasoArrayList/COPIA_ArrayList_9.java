package RepasoArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class COPIA_ArrayList_9 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        ArrayList<String> random = new ArrayList<String>();
        random.add("ola");
        random.add("ola2");
        random.add("ola3");
        random.add("ola4");
        System.out.println(random);
        Collections.copy(random, colores);
        System.out.println(random);
    }
}
