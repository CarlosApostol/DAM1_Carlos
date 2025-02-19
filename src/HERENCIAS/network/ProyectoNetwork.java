package HERENCIAS.network;

import java.util.ArrayList;

public class ProyectoNetwork {
    public static void main(String[] args) {

        ArrayList<String> listaComentarios1 = new ArrayList<>();
        listaComentarios1.add("¡Excelente publicación!");
        listaComentarios1.add("Muy interesante, gracias por compartir.");
        listaComentarios1.add("Borra la cuenta.");

        ArrayList<String> listaComentarios2 = new ArrayList<>();
        listaComentarios2.add("Borra la cuenta.");

        ArrayList<String> listaComentarios3 = new ArrayList<>();
        listaComentarios3.add("Hola, ¿Quires ganar mucho dinero haciendo NADA? ENTRA EN EL ENLACE -->");

        Publicacion publicacion1 = new Publicacion("12345", "Marco Polo", "18-02-2025", "08:00 a.m", 5, listaComentarios1);
        PublicacionFoto pubfoto1 = new PublicacionFoto("90456", "Sebastian Moise", "20-01-2025", "15:07 p.m", 2, listaComentarios2, "imagen_protesta.jpg", "PROTESTA CONTRA SOFAS HECHOS DE CASPA");
        PublicacionTexto pubtexto1 = new PublicacionTexto("92379", "Ana Gómez", "05-02-2025", "19:30 p.m", 10, listaComentarios3, "ABUELA CAE POR LAS ESCALERAS EN MONASTERIO,  12 muertos, 1 abuela herida, 9 especies extintas");


        System.out.println("Publicacion prueba:");
        publicacion1.publicacion();

        System.out.println("Publicacion foto prueba:");
        System.out.println("ID: "+pubfoto1.getId());
        System.out.println("Autor: " + pubfoto1.getAutor());
        System.out.println("Fecha: " + pubfoto1.getFecha());
        System.out.println("Hora: " + pubfoto1.getHora());
        System.out.println("Imagen: " + pubfoto1.getNombreimagen());
        System.out.println("Título: " + pubfoto1.getTitulo());
        System.out.println("Likes: " + pubfoto1.getMegusta());
        System.out.println("Comentarios: " + pubfoto1.getComentarios());

        System.out.println("Publicacion texto prueba:");
        System.out.println("ID: "+pubtexto1.getId());
        System.out.println("Autor: " + pubtexto1.getAutor());
        System.out.println("Mensaje: " + pubtexto1.getMensaje());
        System.out.println("Likes: " + pubtexto1.getMegusta());
        System.out.println("Comentarios: " + pubtexto1.getComentarios());


        System.out.println("Añadir me gusta (en este caso a publicacion de texto):");
        pubtexto1.AñadirMegusta();
        System.out.println("Likes después de dar 'Me gusta': " + pubtexto1.getMegusta());

        System.out.println("Añadir comentario (en este caso a publicacion de foto)");
        pubfoto1.addComentario("Yo done de la caspa de mi padre para uno de esos");
        System.out.println("Comentarios después de agregar: " + pubfoto1.getComentarios());
    }
}

