package POO_Ejercicio4;
import java.util.*;

public class Ejercicio4{
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
