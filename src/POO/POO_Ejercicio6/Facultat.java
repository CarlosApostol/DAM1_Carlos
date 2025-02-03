package POO.POO_Ejercicio6;
import java.util.*;

class Facultat {
    String cod_fac;
    private Set<Catedra> catedrals;

    public Facultat(String cod_fac) {
        this.cod_fac = cod_fac;
        this.catedrals = new HashSet<>();
    }

    public String getCod_fac() {
        return cod_fac;
    }

    public void addCatedra(Catedra catedra) {
        this.catedrals.add(catedra);
    }
    @Override
    public String toString() {
        return "CODI DE LA FACULTAT: " + this.cod_fac;
    }
}