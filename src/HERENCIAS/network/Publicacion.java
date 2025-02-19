package HERENCIAS.network;

import java.util.ArrayList;

public class Publicacion {
    private String id;
    private String autor;
    private String fecha;
    private String hora;
    private int megusta;
    private ArrayList<String> comentarios;

    public Publicacion(String id, String autor, String fecha, String hora, int megusta, ArrayList comentarios) {
        this.id = id;
        this.autor = autor;
        this.fecha = fecha;
        this.hora = hora;
        this.megusta = megusta;
        this.comentarios = comentarios;
    }

    public String getId()
    {
        return id;
    }
    public String setId()
    {
        return this.id = id;
    }
    public String getAutor()
    {
        return autor;
    }
    public String setAutor()
    {
        return this.autor = autor;
    }
    public String getFecha()
    {
        return fecha;
    }
    public String setFecha()
    {
        return this.fecha = fecha;
    }
    public String getHora()
    {
        return hora;
    }
    public String setHora()
    {
        return this.hora = hora;
    }
    public int getMegusta()
    {
        return megusta;
    }
    public int setMegusta()
    {
        return this.megusta = megusta;
    }
    public int AñadirMegusta(){
        return this.megusta += 1;
    }
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
    public void addComentario(String comentario) {
        this.comentarios.add(comentario);
    }
    public void publicacion()
    {
        System.out.println("El ID de esta publicacion es: "+id+" su autor es: "+autor+" salio el "+fecha+" a las "+hora+"h"+" tiene "+megusta+" likes"+"\n\t"+"Comentarios:"+"\n\t"+comentarios);
    }
}


