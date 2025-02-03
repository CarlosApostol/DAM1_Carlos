package POO.POO_Ejercicio6;
import java.util.*;

class Professor {
    String dni;
    private Set<Catedra> catedrals;

    public Professor(String dni) {
        this.dni = dni;
        this.catedrals = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void addCatedra(Catedra catedra) {
        this.catedrals.add(catedra);
    }
    @Override
    public String toString() {
        return "DNI DEL PROFESSOR: " + this.dni;
    }
}
