package HERENCIAS.network;

import java.util.ArrayList;

public class PublicacionTexto extends Publicacion{
    private String mensaje;

    PublicacionTexto(String id, String autor, String fecha, String hora, int megusta, ArrayList comentarios, String mensaje) {
    super(id, autor, fecha, hora, megusta, comentarios);
    this.mensaje = mensaje;
}
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
