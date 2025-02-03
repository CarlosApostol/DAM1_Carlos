package POO.POO_Ejercicio7;
import java.util.*;

class Autor {
    String cod_aut;
    private Set<Llibre> llibres;

    public Autor(String cod_aut) {
        this.cod_aut = cod_aut;
        this.llibres = new HashSet<>();
    }

    public String getCod_aut() {
        return this.cod_aut;
    }

    public void addLlibre(Llibre llibre) {
        this.llibres.add(llibre);
    }
    @Override
    public String toString() {
        return "EL CODIGO DEL AUTOR ES: " + this.cod_aut + "\n\t"+"LIBROS DE ESTE AUTOR: " + llibres;
    }
}
