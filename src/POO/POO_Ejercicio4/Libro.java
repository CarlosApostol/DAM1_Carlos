package POO_Ejercicio4;
import java.util.*;

class Libro {
    String titulo;
    Autor autor;
    int pagnum;
    List<Tema> temas;

    public Libro(String titulo, Autor autor, int pagnum) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagnum = pagnum;
        this.temas = new ArrayList<>();
    }

    public void agregarTema(Tema tema) {
        temas.add(tema);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getAPagnum() {
        return this.pagnum;
    }

    public String toString() {
        return "Titulo del libro: " + this.titulo + "\n\t" + "Autor del libro: " + this.autor + "\n\t" + "Numero de Paginas: " + this.pagnum + "\n\t" +"Tema del libro: "+this.temas;
    }
}
