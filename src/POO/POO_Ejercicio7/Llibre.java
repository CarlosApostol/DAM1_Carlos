package POO.POO_Ejercicio7;
import POO.POO_Ejercicio7.Exemplar;
import java.util.*;

class Llibre {
    String isbn;
    private Set<Autor> autores;
    private Set<Exemplar> exemplars;

    public Llibre(String isbn) {
        this.isbn = isbn;
        this.autores = new HashSet<>();
        this.exemplars = new HashSet<>();
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }
    public void addExemplar(Exemplar exemplar) {
        this.exemplars.add(exemplar);
    }

    @Override
    public String toString() {
        return this.isbn+"\n\t"+"SU NUMERO DE EJEMPLAR ES: "+this.exemplars;
    }
}
