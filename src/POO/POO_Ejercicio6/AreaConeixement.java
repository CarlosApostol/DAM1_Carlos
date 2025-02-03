package POO.POO_Ejercicio6;
import java.util.*;

class AreaConeixement {
    String cod_area;
    private Set<Departament> departaments;

    public AreaConeixement(String cod_area) {
        this.cod_area = cod_area;
        this.departaments = new HashSet<>();
    }

    public String getCod_area() {
        return cod_area;
    }

    public void addDepartament(Departament departament) {
        this.departaments.add(departament);
    }
    @Override
    public String toString() {
        return "CODI AREA DE CONEIXEMENT: " + this.cod_area + "\n\t" + this.departaments;
    }
}
