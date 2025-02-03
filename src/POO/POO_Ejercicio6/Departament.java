package POO.POO_Ejercicio6;
import java.util.*;

class Departament {
    String cod_dep;
    private Set<Catedra> catedrals;
    private Set<Professor> professores;

    public Departament(String cod_dep) {
        this.cod_dep = cod_dep;
        this.catedrals = new HashSet<>();
        this.professores = new HashSet<>();
    }

    public String getCod_dep() {
        return cod_dep;
    }

    public void addCatedra(Catedra catedra) {
        this.catedrals.add(catedra);
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
    @Override
    public String toString() {
        return "CODI DELS DEPARTAMENTS: " + this.cod_dep + "\n\t" + this.catedrals + this.professores;
    }
}
