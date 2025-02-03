package POO.POO_Ejercicio7;
import java.util.*;

public class Editorial {
    String cod_ed;
    private Set<Llibre> llibres;

    public Editorial(String cod_ed) {
        this.cod_ed = cod_ed;
        this.llibres = new HashSet<>();
    }

    public String getCod_ed() {
        return this.cod_ed;
    }
    public void addLlibre(Llibre llibre) {
        this.llibres.add(llibre);
    }

    @Override
    public String toString() {
        return "EL CODIGO DE LA EDITORIAL ES: "+this.cod_ed+"\n\t"+"SUS LIBROS SON: "+llibres;
    }
}
