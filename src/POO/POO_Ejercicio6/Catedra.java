package POO.POO_Ejercicio6;
import java.util.*;

class Catedra {
    String cod_cat;
    private Set<Professor> professores;

    public Catedra(String cod_cat) {
        this.cod_cat = cod_cat;
        this.professores = new HashSet<>();
    }

    public String getCod_cat() {
        return cod_cat;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
    @Override
    public String toString() {
        return "CODI DE LA CATEDRA: " + this.cod_cat + "\n\t" + this.professores;
    }
}
