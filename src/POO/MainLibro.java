package POO;
import java.util.*;

class Autor {
    String nombre;
    String fecha;

    public Autor(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() { return this.nombre;};
    public String getFecha() { return this.fecha;};

    public String toString() {
        return this.nombre+"\n\t"+"Fecha de nacimiento del Autor: "+this.fecha;
    }
}
class Tema {
    String tema;

    public Tema(String tema) {
        this.tema = tema;
    }

    public String getTema() { return this.tema;};

    public String toString() {
        return "Temas: "+this.tema;
    }

}
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

public class MainLibro{
        public static void main(String[] args) {
            Autor autor1 = new Autor("Federico Garcia Lorca", "15/05/1945");
            Autor autor2 = new Autor("Lope de Vega", "01/02/1715");
            Autor autor3 = new Autor("Miguel de Cervantes", "27/01/1915");

            Tema tema1 = new Tema("Drama");
            Tema tema2 = new Tema("Comedia");
            Tema tema3 = new Tema("Romance");

            Libro libro1 = new Libro("La casa de Bernarda Alba", autor1, 415);
            libro1.agregarTema(tema1);
            Libro libro2 = new Libro("Fuenteovejuna", autor2, 309);
            libro2.agregarTema(tema2);
            Libro libro3 = new Libro("La gitanilla", autor3, 246);
            libro3.agregarTema(tema3);

            System.out.println(libro1);
            System.out.println(libro2);
            System.out.println(libro3);
        }
}

