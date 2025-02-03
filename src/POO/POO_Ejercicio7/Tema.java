package POO.POO_Ejercicio7;
import java.util.*;

public class Tema {
    String cod_t;
    private Set<Llibre> llibres;

    public Tema(String cod_t) {
        this.cod_t = cod_t;
        this.llibres = new HashSet<>();
    }

    public String getCod_t() {
        return this.cod_t;
    }
    public void addLlibre(Llibre llibre) {
        this.llibres.add(llibre);
    }

    @Override
    public String toString() {
        return "EL CODIGO DEL TEMA ES: "+this.cod_t+"\n\t"+"SUS LIBROS INCLUIDOS SON: "+llibres;
    }
}
