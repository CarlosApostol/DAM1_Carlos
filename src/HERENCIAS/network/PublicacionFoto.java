package HERENCIAS.network;

import java.util.ArrayList;

public class PublicacionFoto extends Publicacion {
    private String nombreimagen;
    private String titulo;
    PublicacionFoto(String id, String autor, String fecha, String hora, int megusta, ArrayList comentarios, String nombreimagen, String titulo) {
        super(id, autor, fecha, hora, megusta, comentarios);
        this.nombreimagen = nombreimagen;
        this.titulo = titulo;
    }

    public String getNombreimagen() {
        return nombreimagen;
    }
    public void setNombreimagen(String nombreimagen) {
        this.nombreimagen = nombreimagen;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
