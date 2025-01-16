//En resumen, trimToSize es útil cuando quieres optimizar el uso de memoria en un ArrayList que ya no necesita crecer. Es inutil
package RepasoArrayList;
import java.util.ArrayList;


public class TRIM_ArrayList_19 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println(colores);
        colores.trimToSize();
        System.out.println(colores);

    }
}

