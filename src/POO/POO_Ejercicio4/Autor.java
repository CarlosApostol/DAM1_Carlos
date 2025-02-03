package POO_Ejercicio4;
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