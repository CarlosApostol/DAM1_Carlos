package POO.POO_Ejercicio7;
import java.util.*;

public class Lector {
    String dni;
    private Set<Exemplar> exemplars;

    public Lector(String dni) {
        this.dni = dni;
        this.exemplars = new HashSet<>();
    }

    public String getDni() { return this.dni;}

    public void addExemplar(Exemplar exemplar) {
        this.exemplars.add(exemplar);
    }

    @Override
    public String toString() {
        return "DNI DEL LECTOR: "+this.dni+"\n\t"+exemplars;
    }

}
