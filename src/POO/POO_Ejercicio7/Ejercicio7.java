package POO.POO_Ejercicio7;
import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Autor autor1 = new Autor("autor de ejemplo");
        Llibre libro1 = new Llibre("83749isbn");
        Editorial editorial1 = new Editorial("123editorial");
        Tema tema1 = new Tema("456tema");
        Exemplar ejemplar1 = new Exemplar("1234568");
        Lector lector1 = new Lector("99999999N");

        autor1.addLlibre(libro1);
        editorial1.addLlibre(libro1);
        lector1.addExemplar(ejemplar1);
        libro1.addAutor(autor1);
        libro1.addExemplar(ejemplar1);
        tema1.addLlibre(libro1);

        System.out.println(autor1);
        System.out.println(editorial1);
        System.out.println(tema1);
    }
}
